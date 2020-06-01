(ns day2.core
  (:gen-class))

(defn ch-count
  [str]
  (frequencies str))

(defn contains-x-letter
  [ch-counts x]
  (not (empty? (filter #(= (second %) x) ch-counts))))

(defn two-count
  [ch-counts]
  (->> ch-counts
       (filter #(= ) ch-counts) 
       (count)))

(defn checksum
  [ids]
  (->> ids
       (map ch-count)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
