(ns bunkbed.top
  (:require [scad-clj.model :as scad-model]
            [bunkbed.component :as component]))

(defn top-siderail [mattress-dims]
  (->> (bunkbed.board/_2x6 (+ (:length mattress-dims) (* 2 (:padding mattress-dims))))
       (scad-model/rotate [(scad-model/deg->rad 90) 0 (scad-model/deg->rad 90)])))

(defn bottom-siderail [mattress-dims]
  (->> (bunkbed.board/_2x8 (+ (:length mattress-dims) (* 2 (:padding mattress-dims))))
       (scad-model/rotate [(scad-model/deg->rad 90) 0 (scad-model/deg->rad 90)])))

(defn headboard [mattress-dims leg-height]
  (scad-model/union
    ;; Top crossbar
    (->> (component/crossbar mattress-dims)
         (scad-model/translate [1.5
                                0
                                (- leg-height (/ 5.5 2))]))
    ;; Middle crossbar
    (->> (component/crossbar mattress-dims)
         (scad-model/translate [1.5
                                0
                                (- leg-height (/ 5.5 2) 5.5 4)]))
    ;; Bottom crossbar
    (->> (component/crossbar mattress-dims)
         (scad-model/translate [1.5
                                0
                                (- leg-height (/ 5.5 2) 5.5 4 5.5 4)]))
    (->> (component/leg leg-height)
         (scad-model/translate [0
                                (/ (:width mattress-dims) 2)
                                18]))
    (->> (component/leg leg-height)
         (scad-model/translate [0
                                (- (/ (:width mattress-dims) 2))
                                18]))))

(defn draw [mattress-dims leg-height]
  (->> (scad-model/union
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
         ;; Top siderails
         (->> (top-siderail mattress-dims)
              (scad-model/translate [0
                                     (-
                                      (+ (/ (:width mattress-dims) 2) (:padding mattress-dims)))
                                     (- leg-height 1 (/ 7.5 2))]))
         (->> (top-siderail mattress-dims)
              (scad-model/translate [0
                                     (+ (/ (:width mattress-dims) 2) (:padding mattress-dims))
                                     (- leg-height 1 (/ 7.5 2))])) 
         ;; Bottom siderails
         (->> (bottom-siderail mattress-dims)
              (scad-model/translate [0
                                     (-
                                      (+ (/ (:width mattress-dims) 2) (:padding mattress-dims)))
                                     (- leg-height 1 (/ 7.5 2) 2.75 7.5)]))
         (->> (bottom-siderail mattress-dims)
              (scad-model/translate [0
                                     (+ (/ (:width mattress-dims) 2) (:padding mattress-dims))
                                     (- leg-height 1 (/ 7.5 2) 2.75 7.5)]))
         ;; Mattress
         (->> (bunkbed.mattress/draw mattress-dims)
              (scad-model/translate [0
                                     0
                                     ;(- leg-height (/ 7.5 2) 2.75 (- 5.5 2) (/ (:height mattress-dims) 2))  
                                     (- leg-height (/ 7.5 2) 2.75 (- 5.5 2))  
                                     ])
              ))
       (scad-model/translate [0 0 leg-height])))
