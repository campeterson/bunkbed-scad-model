(ns bunkbed.environment
  (:require [scad-clj.model :as scad-model]))

(defn draw-ceiling []
  (->> (scad-model/cube 200 200 1)
       (scad-model/color [1 0 1])
       (scad-model/translate [0 0 97])))

(defn draw-floor []
  (->> (scad-model/cube 200 200 1)
       (scad-model/color [1 0 1])
       (scad-model/translate [0 0 -1])))
