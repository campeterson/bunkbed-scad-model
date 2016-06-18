(ns bunkbed.core
  (:require [scad-clj.scad :as scad]
            [scad-clj.model :as scad-model]
            [bunkbed.component :as component]))

;; Bed dimensions
(def mattress-dims {:length 74
                    :width 39
                    :height 8
                    :padding 1})
;; Trundle dimensions
(def trundle-frame {:length 71.75
                    :width 38.75
                    :height 4
                    :space-above-mattress 4})
(def top-leg-dims {:height 36
                   :type :2x8})
(def bottom-leg-dims {:height 36
                      :type :2x8})

(spit "model.scad"
      (scad/write-scad 
        (scad-model/union
          ;; Ceiling
          ;(bunkbed.environment/draw-ceiling)
          ;; Floor
          (bunkbed.environment/draw-floor)
          ;; Trundle & Mattress
          (bunkbed.trundle/draw-trundle trundle-frame mattress-dims)
          ;; Bottom Section
          (bunkbed.bottom/draw mattress-dims (:height bottom-leg-dims))
          ;; Top Section
          (bunkbed.top/draw mattress-dims (:height top-leg-dims))
          ;(->> (component/leg (:height bottom-leg-dims))
               ;(scad-model/translate [0 0 (/ (:height top-leg-dims) 2) ]))
          ;(->> (crossbar mattress-dims)
               ;(scad-model/translate [1.5 0 (:height top-leg-dims) (- (:height top-leg-dims) (/ 5.5 2)) ]))
          ;(scad-model/translate [0 (- (+ (/ (:width mattress-dims) 2) (:padding mattress-dims))) 0]))
          )))
