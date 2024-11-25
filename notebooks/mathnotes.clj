;;# Nick's Math Notes
^{:nextjournal.clerk/visibility {:code :hide}}
(ns mathnotes
  {:nextjournal.clerk/toc true}
  (:require [nextjournal.clerk :as clerk :refer [tex]]))

^{:nextjournal.clerk/visibility {:code :hide :result :hide}}
(defn make-table [headers rows]
  (clerk/html
   [:table
    [:tr.bg-slate-300.dark:bg-slate-700.dark:text-white (for [h headers] [:th.border.border-gray-500.text-center.dark:border-white h])]
    (for [r rows] [:tr.bg-blue-50.dark:bg-slate-500.dar:text-white (for [c r] [:td.border.border-gray-500.dark:border-white c])])]))

;;## Trigonometry

;;#### Primary Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\textbf{Function}"), (tex "\\textbf{Definition}")]
            [[(tex "\\sin(x)"), (tex "\\frac{\\text{opposite}}{\\text{hypotenuse}}")]
             [(tex "\\cos(x)"), (tex "\\frac{\\text{adjacent}}{\\text{hypotenuse}}")]
             [(tex "\\tan(x)"), (tex "\\frac{\\text{opposite}}{\\text{adjacent}} = \\frac{\\sin(x)}{\\cos(x)}")]])

;;#### Angle Sum Formulas
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\textbf{Formula}")]
            [[(tex "\\sin(\\alpha\\pm\\beta) = \\sin(\\alpha)\\cos(\\beta)\\pm\\cos(\\alpha)\\sin(\\beta)")]
             [(tex "\\cos(\\alpha\\pm\\beta) = \\cos(\\alpha)\\cos(\\beta)\\mp\\sin(\\alpha)\\sin(\\beta)")]
             [(tex "\\sin(2x) = (\\sin(x)+\\cos(x))^2 - 1 = 2\\sin(x)\\cos(x)")]
             [(tex "\\cos(2x) = \\cos^2(x) - \\sin^2(x) = 2\\cos^2(x) - 1")]])

;;#### Reciprocal Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\textbf{Function}"), (tex "\\textbf{Definition}")]
            [[(tex "\\sec(x)"), (tex "\\frac{1}{\\cos(x)}")]
             [(tex "\\csc(x)"), (tex "\\frac{1}{\\sin(x)}")]
             [(tex "\\cot(x)"), (tex "\\frac{\\cos(x)}{\\sin(x)}")]])

;;#### Pythagorean Identities
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\textbf{Identity}")]
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
             [(tex "\\text{arcsec}(x)"), (tex "\\frac{1}{|x|\\sqrt{x^2 - 1}}")]
             [(tex "\\text{arccsc}(x)"), (tex "-\\frac{1}{|x|\\sqrt{x^2 - 1}}")]
             [(tex "\\text{arccot}(x)"), (tex "-\\frac{1}{1+x^2}")]
             ])

;;## Logarithms

;;#### Definition
^{:nextjournal.clerk/visibility {:code :hide}}
(tex "\\log_{b}(y) = x \\Longleftrightarrow b^x = y")

;;#### Identities
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\textbf{Identity}")]
            [[(tex "b^{\\log_{b}(x)} = x")]
             [(tex "\\log_{b}(b^x) = x")]
             [(tex "\\log_{b}(1) = 0")]
             [(tex "\\log_{b}(b) = 1")]])

;;#### Properties
^{:nextjournal.clerk/visibility {:code :hide}}
(make-table [(tex "\\textbf{Properties}")]
            [[(tex "\\log_{b}(xy) = \\log_{b}(x) + \\log_{b}(y)")]
             [(tex "\\log_{b}\\left(\\frac{x}{y}\\right) = \\log_{b}(x) - \\log_{b}(y)")]
             [(tex "\\log_{b}(x^y) = y\\log_{b}(x)")]
             [(tex "\\log_{b}(\\sqrt[y]{x}) = \\frac{\\log_{b}(x)}{y}")]
             [(tex "x^{\\log_{b}(y)} = y^{\\log_{b}(x)}")]])

