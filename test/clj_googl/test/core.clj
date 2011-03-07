(ns clj-googl.test.core
  (:use [clj-googl.core] :reload)
  (:use [clojure.test]))

(deftest shorten-test
	(is (= (shorten "http://google.com") "http://goo.gl/mR2d")))

(deftest expand-test
	(is (= (expand "http://goo.gl/mR2d") "http://google.com/")))
