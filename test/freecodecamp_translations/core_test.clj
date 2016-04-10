(ns freecodecamp-translations.core-test
  (:require [clojure.test :refer :all]
            [freecodecamp-translations.core :refer :all]
            [clojure.data.json :as json]))

(def getting-started (json/read-str (slurp "test/freecodecamp_translations/getting-started.json")))

(defn get-challenges
  [content]
  (get content "challenges"))

(deftest get-languages-getting-started
  (testing "Get languages in Getting Started content"
    (print (get-challenges getting-started))
    (is (= 0 1))))
