(ns freecodecamp-translations.core
  (:gen-class)
  (:require [org.httpkit.client :as http]))

(def url "https://api.github.com/repos/FreeCodeCamp/FreeCodeCamp/contents/seed/challenges/00-getting-started/getting-started.json")

(def options {:timeout 1000
              :headers {"Accept" "application/vnd.github.v3+json"}})

(defn handler [request]
  (let [resp (http/get url options)]
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body (:body @resp)}))

(defn -main
  [& args]
  (println "Hello, World!"))
