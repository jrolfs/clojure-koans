(set-env!
  :source-paths    #{"src/koans"}
  :resource-paths  #{"resources"}
  :dependencies '[[org.clojure/clojure "1.8.0"]
                  [koan-engine "0.2.3"]
                  [lein-koan "0.1.3"]])

(require '[koan-engine.runner])

(deftask run-koans []
  (koan-engine.runner/exec "run"))

(deftask test-koans []
  (koan-engine.runner/exec "test"))
