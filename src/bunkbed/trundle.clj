(ns bunkbed.trundle
  (:require [scad-clj.model :as scad-model]
            [bunkbed.mattress :as bb-mat]))

(defn draw-trundle-frame [trundle-frame]
  (->> (scad-model/cube (:length trundle-frame)
                        (:width trundle-frame)
                        (:height trundle-frame))
       (scad-model/color [0 1 1])))

(defn draw-trundle [trundle-frame mattress]
  (scad-model/union
    ;; Trundel
    (->> (draw-trundle-frame trundle-frame)
         (scad-model/translate [0 0 (/ (:height trundle-frame) 2)]))
    ;; Mattress
    (->> (bb-mat/draw mattress)
         (scad-model/translate [0 0 (+
                                     (/ (:height trundle-frame) 2)
                                     (/ (:height mattress) 2))]))))
