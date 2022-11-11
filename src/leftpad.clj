(ns leftpad)

(defn leftpad
  ([s] (leftpad s (count s)))
  ([s padding] (leftpad s padding \space))
  ([s padding c]
   (let [cnt (count s)]
     (if (nil? s)
       ""
       (if (>= cnt padding)
         s
         (str (apply str (repeat (- padding cnt) c)) s))))))
