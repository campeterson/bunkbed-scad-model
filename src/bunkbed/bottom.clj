(ns bunkbed.bottom
  (:require [scad-clj.model :as scad-model]
            [bunkbed.component :as component]))

(defn headboard [mattress-dims leg-height]
  (scad-model/union
    (->> (component/crossbar mattress-dims)
         (scad-model/translate [1.5
                                0
                                (- leg-height (/ 5.5 2) 2.75)]))
    (->> (component/crossbar mattress-dims)
         (scad-model/translate [1.5
                                0
                                (+ 5 (/ 5.5 2))]))
    (->> (component/leg leg-height)
         (scad-model/translate [0
                                (/ (:width mattress-dims) 2)
                                18]))
    (->> (component/leg leg-height)
         (scad-model/translate [0
                                (- (/ (:width mattress-dims) 2))
                                18]))))

(defn draw [mattress-dims leg-height]
  (scad-model/union
    (->> (headboard mattress-dims leg-height)
         (scad-model/translate [(+ (/ 1.5 2)
                                   (/ (:length mattress-dims) 2))
                                0
                                0]))
    (->> (headboard mattress-dims leg-height)
         (scad-model/rotate [0 0 (scad-model/deg->rad 180)])
         (scad-model/translate [(- (+ (/ 1.5 2)
                                      (/ (:length mattress-dims) 2)))
                                0
                                0]))
    (->> (component/siderail mattress-dims)
         (scad-model/translate [0
                                (-
                                 (+ (/ (:width mattress-dims) 2) (:padding mattress-dims)))
                                (+ 10 (/ 7.5 2))]))
    (->> (component/siderail mattress-dims)
         (scad-model/translate [0
                                (+ (/ (:width mattress-dims) 2) (:padding mattress-dims))
                                (+ 10 (/ 7.5 2))]))))
