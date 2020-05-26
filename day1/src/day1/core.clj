(ns day1.core
  (:require [clojure.string :as str]))

(defn parse-freq
  [freq]
  (Integer/parseInt freq))

(defn split-input
  [input]
  (into [] (map str/trim (str/split input #","))))

(defn as-numbers 
  [strv]
  (map parse-freq strv))

(defn final-freq
  [input]
  (->> input
    (split-input)
    (as-numbers)
    (reduce +)))
