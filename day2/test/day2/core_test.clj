(ns day2.core-test
  (:require [clojure.test :refer :all]
            [day2.core :refer :all]))

(deftest ch-count-test
  (testing 
    (is (= (ch-count "abcde") {\a 1 \b 1 \c 1 \d 1 \e 1}))
    (is (= (ch-count "ab1de") {\a 1 \b 1 \1 1 \d 1 \e 1}))
    (is (= (ch-count "aaabb") {\a 3 \b 2}))))

(deftest contains-x-letter-test
  (testing
    (is (= (contains-x-letter {} 2) false))
    (is (= (contains-x-letter {:a 1} 2) false))
    (is (= (contains-x-letter {:a 2 :b 3} 3) true))))

(deftest checksum-test
  (comment (testing
    (is (= (checksum ["abcde" "bababc" "abbcde" "abcccd" "aabcdd" "abcdee" "ababab"]) 12)))))
