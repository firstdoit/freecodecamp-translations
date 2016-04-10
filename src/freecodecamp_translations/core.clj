(ns freecodecamp-translations.core
  (:gen-class)
  (:require [org.httpkit.client :as http])
  (:require [clojure.data.json :as json]))

(def url "https://raw.githubusercontent.com/FreeCodeCamp/FreeCodeCamp/staging/seed/challenges/00-getting-started/getting-started.json")

(def languages ["es" "pt" "fr" "de"])

(defn responseToContent
  [resp]
  (:body resp))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (responseToContent @(http/get url))})

(defn -main
  [& args]
  (println (responseToContent @(http/get url))))
