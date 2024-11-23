;;# Math Notes
^{:nextjournal.clerk/visibility {:code :hide}}
(ns mathnotes
  {:nextjournal.clerk/toc true}
  (:require [nextjournal.clerk :as clerk]))

;;## Trigonometry

;;#### Reciprocal Functions
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:head ["Function", "Definition"]
              :rows [[(clerk/tex "\\sec(x)"), (clerk/tex "\\frac{1}{\\cos(x)}")]
                     [(clerk/tex "\\csc(x)"), (clerk/tex "\\frac{1}{\\sin(x)}")]
                     [(clerk/tex "\\cot(x)"), (clerk/tex "\\frac{\\cos(x)}{\\sin(x)}")]]})

;;#### Pythagorean Identites
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:rows [[(clerk/tex "\\sin^2(x) + \\cos^2(x) = 1")]
                     [(clerk/tex "1 + \\cot^2(x) = \\csc^2(x)")]
                     [(clerk/tex "1 + \\tan^2(x) = \\sec^2(x)")]
                     [(clerk/tex "\\sec^2(x) + \\csc^2(x) = \\sec^2(x)\\csc^2(x)")]]})

;;#### Trigonometric Derivatives
^{:nextjournal.clerk/visibility {:code :hide}}
(clerk/table {:head [(clerk/tex "\\bf f(x)"), (clerk/tex "\\bf f'(x)")]
              :rows [[(clerk/tex "\\sin(x)"), (clerk/tex "\\cos(x)")]
                     [(clerk/tex "\\cos(x)"), (clerk/tex"-\\sin(x)")]
                     [(clerk/tex "\\tan(x)"), (clerk/tex"\\sec^2(x)")]
                     [(clerk/tex "\\sec(x)"), (clerk/tex "\\sec(x)\\tan(x)")]
                     [(clerk/tex "\\csc(x)"), (clerk/tex "-\\csc(x)\\cot(x)")]
                     [(clerk/tex "\\cot(x)"), (clerk/tex "-\\csc^2(x)")]]})



