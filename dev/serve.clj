(ns serve
  (:require [nextjournal.clerk :as clerk]))

(comment
  ;; start without file watcher, open browser when started
  (clerk/serve! {:browse? true :port 6677})

  ;; start with file watcher for these sub-directory paths
  (clerk/serve! {:browse? true :port 6677 :watch-paths ["notebooks"]})

  (clerk/clear-cache!)

  ;; or call `clerk/show!` explicitly
  (clerk/show! "notebooks/mathnotes.clj")

  (clerk/build-static-app! {:paths ["notebooks/mathnotes.clj"] :out-path "public"})

  )
