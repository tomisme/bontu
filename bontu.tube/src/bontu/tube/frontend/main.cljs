(ns ^:figwheel-hooks bontu.tube.frontend.main)

(js/console.log "Hello, world")

;; This is called once
(defonce init
  (do (set! (.-innerHTML (js/document.getElementById "app"))
            "<p>Loaded tubess!</p>
            <p>Edit <strong><code>src/bontu/tube/frontend/main.cljs</code></strong> to change this message.</p>")
      true))

;; This is called every time you make a code change
(defn ^:after-load reload []
  (prn "Ouch!")
  (set! (.-innerText (js/document.getElementById "app")) "Hot Reloaded tubesss!"))
