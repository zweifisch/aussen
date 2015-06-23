(ns aussen.core
  (:require [clojure.java.io :as io]
            [environ.core :as environ]
            [clojure.edn :as edn]))

(defn load-edn [f]
  (try
    (with-open [r (-> f io/reader java.io.PushbackReader.)]
      (edn/read r))
    (catch Exception e
      (println (str "WARNING: aussen: " (.getLocalizedMessage e))))))

(defonce env (merge (load-edn (or (some-> (:config-file environ/env) io/reader)
                                  (io/resource "config.edn")))
                    environ/env))
