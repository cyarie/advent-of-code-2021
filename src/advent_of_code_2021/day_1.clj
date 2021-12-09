(ns advent-of-code-2021.day-1
  (:gen-class)
  (:require [clojure.string :as str]))

(defn get-lines [file]
  (str/split-lines (slurp file)))

; Part one
(count (->> (get-lines "resources/day_1_input.txt")
     (map #(Integer/parseInt %))
     (partition 2 1)
     (mapcat (fn [[a b]] (if (> b a) [b])))))

; Part two
(count (->> (get-lines "resources/day_1_input.txt")
     (map #(Integer/parseInt %))
     (partition 3 1)
     (mapcat (fn [[a b c]] [(+ a b c)]))
     (partition 2 1)
     (mapcat (fn [[a b]] (if (> b a) [b])))))
