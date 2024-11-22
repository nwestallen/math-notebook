;; # Math Notes
^{:nextjournal.clerk/visibility {:code :hide}}
(ns mathnotes
  (:require [nextjournal.clerk :as clerk]))

;; Ok hopefully I am able to do some notebook stuff

^{:nextjournal.clerk/visibility {:code :hide :result :hide}}
(def equation (clerk/tex "
  \\frac{d}{dt} \\frac{∂ L}{∂ \\dot{q}} - \\frac{∂ L}{∂ q} = 0
"))

;;**Trigonometric Derivatives**
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:head [(clerk/tex "\\bf f(x)"), (clerk/tex "\\bf f'(x)")]
              :rows [[(clerk/tex "\\sin(x)"), (clerk/tex "\\cos(x)")]
                     [(clerk/tex "\\cos(x)"), (clerk/tex"-\\sin(x)")]
                     [(clerk/tex "\\tan(x)"), (clerk/tex"\\sec^2(x)")]]})

