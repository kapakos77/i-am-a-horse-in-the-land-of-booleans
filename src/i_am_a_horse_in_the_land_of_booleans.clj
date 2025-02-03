(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (== 0 (mod n 15)) "gotcha!"
    (== 0 (mod n 3)) "fizz"
    (== 0 (mod n 5)) "buzz"
    :else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (and (coll? x) (empty? x)) nil
    (or(list? x) (vector? x)) (* 2 (count x))
    :else true))


(defn divisible? [year div]
  (= (mod year div)0))

(defn leap-year? [year]
  (cond
    (and (divisible? year 4) (not (divisible? year 100))) true
    (divisible? year 400)  true
     :else false))
         

; '_______'
