(ns bunkbed.component
  (:require [scad-clj.model :as scad-model]
            [bunkbed.board :as bb-board]))

(defn crossbar [mattress-dims]
  (->> (bb-board/_2x6 (:width mattress-dims)) 
       (scad-model/rotate [(scad-model/deg->rad 90) 0 0])))

(defn leg [height]
  ;(bunkbed.board/_2x8 leg-height) 
  (bb-board/_2x8 height))

(defn siderail [mattress-dims]
  (->> (bb-board/_2x8 (+ (:length mattress-dims) (* 2 (:padding mattress-dims))))
       (scad-model/rotate [(scad-model/deg->rad 90) 0 (scad-model/deg->rad 90)])))
