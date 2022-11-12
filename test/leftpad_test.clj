(ns leftpad-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [leftpad :refer [leftpad]]))

(deftest leftpad-tests
  (testing "nil returns empty"
    (is (= "" (leftpad nil))))

  (testing "Empty returns empty"
    (is (= ""
           (leftpad ""))))

  (testing "do no add space when padding is less than length"
    (is (= "hello"
           (leftpad "hello" 1))))

  (testing "do no add space when s matchs length"
    (is (= "hello"
           (leftpad "hello" 5))))

  (testing "add one space to string to match length"
    (is (= " hello"
           (leftpad "hello" 6))))

  (testing "add two spaces to string to match length"
    (is (= "  hello"
           (leftpad "hello" 7)))))
