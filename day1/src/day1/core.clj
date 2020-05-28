(ns day1.core
  (:require [clojure.string :as str]))

(defn split-input
  [input]
  (into [] (map str/trim (str/split input #","))))

(defn final-freq
  [input]
  (->> input
    (split-input)
    (map #(Integer/parseInt %))
    (reduce +)))
