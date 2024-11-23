;;# Math Notes
^{:nextjournal.clerk/visibility {:code :hide}}
(ns mathnotes
  {:nextjournal.clerk/toc true}
  (:require [nextjournal.clerk :as clerk :refer [tex]]))

;;## Trigonometry

;;#### Primary Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:head ["Function", "Definition"]
              :rows [[(tex "\\sin(x)"), (tex "\\frac{\\text{opposite}}{\\text{hypotenuse}}")]
                     [(tex "\\cos(x)"), (tex "\\frac{\\text{adjacent}}{\\text{hypotenuse}}")]
                     [(tex "\\tan(x)"), (tex "\\frac{\\text{opposite}}{\\text{adjacent}} = \\frac{\\sin(x)}{\\cos(x)}")]]})

(clerk/html [:table.bg-sky-500.text-left
             [:tr [:th.text-center "Function"] [:th.text-center "Definition"]]
             [:tr.bg-white [:td.border.border-gray (tex "\\sin(x)")] [:td.border.border-gray (tex "\\frac{\\text{opposite}}{\\text{adjacent}}")]]
             [:tr [:td (tex "\\cos(x)")] [:td (tex "\\frac{\\text{adjacent}}{\\text{hypotenuse}}")]]])

;;#### Reciprocal Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:head ["Function", "Definition"]
              :rows [[(tex "\\sec(x)"), (tex "\\frac{1}{\\cos(x)}")]
                     [(tex "\\csc(x)"), (tex "\\frac{1}{\\sin(x)}")]
                     [(tex "\\cot(x)"), (tex "\\frac{\\cos(x)}{\\sin(x)}")]]})

;;#### Pythagorean Identites
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:rows [[(tex "\\sin^2(x) + \\cos^2(x) = 1")]
                     [(tex "1 + \\cot^2(x) = \\csc^2(x)")]
                     [(tex "1 + \\tan^2(x) = \\sec^2(x)")]
                     [(tex "\\sec^2(x) + \\csc^2(x) = \\sec^2(x)\\csc^2(x)")]]})

;;#### Trigonometric Derivatives
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:head [(tex "\\bf f(x)"), (tex "\\bf f'(x)")]
              :rows [[(tex "\\sin(x)"), (tex "\\cos(x)")]
                     [(tex "\\cos(x)"), (tex"-\\sin(x)")]
                     [(tex "\\tan(x)"), (tex"\\sec^2(x)")]
                     [(tex "\\sec(x)"), (tex "\\sec(x)\\tan(x)")]
                     [(tex "\\csc(x)"), (tex "-\\csc(x)\\cot(x)")]
                     [(tex "\\cot(x)"), (tex "-\\csc^2(x)")]]})



