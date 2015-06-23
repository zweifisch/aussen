# aussen

configuration for aussenseiter

## Usage

load configuation in edn format from external file

```shell
CONFIG_FILE=/etc/myapp/config.edn java -jar myapp.jar
```

if `$CONFIG_FILE` is not set, it will look for `config.edn` from resources instead

the loaded configuration hashmap will then be merged with enviroment variables

```clojure
(require '[aussen.core :refer [env]])
```

## License

Copyright © 2015 Feng ZHOU

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
