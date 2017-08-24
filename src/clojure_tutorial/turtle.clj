(ns clojure-tutorial.turtle
  (:require [clojure-turtle.core :refer :all]))

; https://github.com/google/clojure-turtle

(def win
  (new-window {:size [300 480]}))

(defn go-around []
  (all
    (forward 30)
    (right 90)))

;(clean)
;(go-around)
