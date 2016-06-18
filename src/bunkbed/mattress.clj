(ns bunkbed.mattress
  (:require [scad-clj.model :as scad-model]))

(defn draw [mattress]
  (->> (scad-model/cube
         (:length mattress)
         (:width mattress)
         (:height mattress))
       (scad-model/color [1 1 1])))
