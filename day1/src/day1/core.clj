(ns day1.core
  (:require [clojure.string :as str]))

(defn split-input
  [input]
  (into [] (map str/trim (str/split input #"\n"))))

(defn calculate-freq
  [input]
  (->> input
    (split-input)
    (map #(Integer/parseInt %))
    (reduce +)))

(defn -main
  [& args]
  (->> args
      (first)
      (slurp)
      (calculate-freq)))
