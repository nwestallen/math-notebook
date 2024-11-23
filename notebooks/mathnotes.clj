;;# Math Notes
^{:nextjournal.clerk/visibility {:code :hide}}
(ns mathnotes
  {:nextjournal.clerk/toc true}
  (:require [nextjournal.clerk :as clerk :refer [tex]]))

^{:nextjournal.clerk/visibility {:code :hide :result :hide}}
(defn make-table [headers rows]
  (clerk/html
   [:table
    [:tr.bg-slate-300 (for [h headers] [:th.border.border-gray-500.text-center h])]
    (for [r rows] [:tr.bg-blue-50 (for [c r] [:td.border.border-gray-500 c])])]))

;;## Trigonometry

;;#### Primary Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table ["Function" "Definition"]
            [[(tex "\\sin(x)"), (tex "\\frac{\\text{opposite}}{\\text{hypotenuse}}")]
             [(tex "\\cos(x)"), (tex "\\frac{\\text{adjacent}}{\\text{hypotenuse}}")]
             [(tex "\\tan(x)"), (tex "\\frac{\\text{opposite}}{\\text{adjacent}} = \\frac{\\sin(x)}{\\cos(x)}")]])

;;#### Angle Sum Formulas
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table ["Formula"]
            [[(tex "\\sin(\\alpha\\pm\\beta) = \\sin(\\alpha)\\cos(\\beta)\\pm\\cos(\\alpha)\\sin(\\beta)")]
             [(tex "\\cos(\\alpha\\pm\\beta) = \\cos(\\alpha)\\cos(\\beta)\\mp\\sin(\\alpha)\\sin(\\beta)")]
             [(tex "\\sin(2x) = (\\sin(x)+\\cos(x))^2 - 1 = 2\\sin(x)\\cos(x)")]
             [(tex "\\cos(2x) = \\cos^2(x) - \\sin^2(x) = 2\\cos^2(x) - 1")]])

;;#### Reciprocal Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table ["Function", "Definition"]
            [[(tex "\\sec(x)"), (tex "\\frac{1}{\\cos(x)}")]
             [(tex "\\csc(x)"), (tex "\\frac{1}{\\sin(x)}")]
             [(tex "\\cot(x)"), (tex "\\frac{\\cos(x)}{\\sin(x)}")]])

;;#### Pythagorean Identities
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table ["Identity"]
            [[(tex "\\sin^2(x) + \\cos^2(x) = 1")]
             [(tex "1 + \\cot^2(x) = \\csc^2(x)")]
             [(tex "1 + \\tan^2(x) = \\sec^2(x)")]
             [(tex "\\sec^2(x) + \\csc^2(x) = \\sec^2(x)\\csc^2(x)")]])

;;#### Trigonometric Derivatives
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\bf f(x)"), (tex "\\bf f'(x)")]
            [[(tex "\\sin(x)"), (tex "\\cos(x)")]
             [(tex "\\cos(x)"), (tex "-\\sin(x)")]
             [(tex "\\tan(x)"), (tex "\\sec^2(x)")]
             [(tex "\\sec(x)"), (tex "\\sec(x)\\tan(x)")]
             [(tex "\\csc(x)"), (tex "-\\csc(x)\\cot(x)")]
             [(tex "\\cot(x)"), (tex "-\\csc^2(x)")]
             [(tex "\\arcsin(x)"), (tex "\\frac{1}{\\sqrt{1-x^2}}")]
             [(tex "\\arccos(x)"), (tex "-\\frac{1}{\\sqrt{1-x^2}}")]
             [(tex "\\arctan(x)"), (tex "\\frac{1}{1+x^2}")]
             [(tex "\\text{arccot}(x)"), (tex "-\\frac{1}{1+x^2}")]])



