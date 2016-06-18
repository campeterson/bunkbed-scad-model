(ns bunkbed.board
  (:require [scad-clj.model :as scad-model]))

;; Board dimensions
;; https://en.wikipedia.org/wiki/Lumber
;; 2x4 - 1.5 x 3.5 in   || 38 x 89 mm
;; 2x6 - 1.5 x 5.5 in   || 38 x 140 mm
;; 2x8 - 1.5 x 7.25 in  || 38 x 184 mm
(def board-dimensions {:2x4 {:width 1.5
                             :length 3.5}
                       :2x6 {:width 1.5
                             :length 5.5}
                       :2x8 {:width 1.5
                             :length 7.25}})

(defn _2x4 [length]
  (->> (scad-model/cube (get-in board-dimensions [:2x4 :width])
                        (get-in board-dimensions [:2x4 :length])
                        length)
       (scad-model/color [1 0 0])))

(defn _2x6 [length]
  (->> (scad-model/cube (get-in board-dimensions [:2x6 :width])
                        (get-in board-dimensions [:2x6 :length])
                        length)
       (scad-model/color [0 1 0])))

(defn _2x8 [length]
  (->> (scad-model/cube (get-in board-dimensions [:2x8 :width])
                        (get-in board-dimensions [:2x8 :length])
                        length)
       (scad-model/color [0 0 1])))
