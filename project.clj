(defproject witch-house/pronouns "1.12.0-SNAPSHOT"
  :description "Pronoun.is is a website for personal pronoun usage examples"
  :url "http://pronoun.is"
  :license "GNU Affero General Public License 3.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.0"]
                 [ring "1.6.3"]
                 [ring.middleware.logger "0.5.0"]
                 [ring/ring-devel "1.6.3"]
                 [environ "1.1.0"]
                 [hiccup "1.0.5"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-environ "1.1.0"]
            [lein-ring "0.12.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "pronouns-standalone.jar"
  :profiles {:production {:env {:production true}}
             :dev {:dependencies [[midje "1.6.3"]]}}
  :ring {:handler pronouns.web/app})
