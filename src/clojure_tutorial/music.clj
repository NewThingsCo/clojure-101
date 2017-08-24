(ns clojure-tutorial.music
  (:require [alda.lisp :refer :all]
            [alda.now :as now]))

; https://github.com/alda-lang/alda/blob/master/doc/alda-now.md

(defn play []
  (now/play!
    (part "accordion"
          (note (pitch :c) (duration (note-length 8)))
          (note (pitch :d))
          (note (pitch :e :flat))
          (note (pitch :f))
          (note (pitch :g))
          (note (pitch :a :flat))
          (note (pitch :b))
          (octave :up)
          (note (pitch :c)))))

(def notes
  [:g :d :c :b :a :d :c :ba :d
   :c :b :c :a :d :d :g :d
   :c :b :a :d :c :b :a :d :c :b :c :a :d :d :e
   :e :e :c :b :a :g :g :a :b :a :e :f :d :d :e
   :e :c :b :a :g :d :a :d :d])

(comment

  (now/play!
    (part "accordion"
          (note (pitch :g))
          (note (pitch :c))
          (note (pitch :b))
          (note (pitch :a))
          (note (pitch :d))
          (note (pitch :c))))

  )

