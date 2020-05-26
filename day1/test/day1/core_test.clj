(ns day1.core-test
  (:require [clojure.test :refer :all]
            [day1.core :refer :all]))

(deftest test-parse-freq
  (is (= -1 (parse-freq "-1")))
  (is (= 0 (parse-freq "0")))
  (is (= 1 (parse-freq "+1"))))

(deftest test-split-freqs
  (is (= ["0" "1" "2"] (split-input "0, 1, 2")))) 

(deftest test-final-freq
  (is (= 3 (final-freq "+1, +1, +1")))
  (is (= 0 (final-freq "+1, +1, -2")))) 
