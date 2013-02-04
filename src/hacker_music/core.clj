(ns hacker-music.core
  :use 'overtone.live)

(definst original-sin [freq 440] (sin-osc freq))

(let [metro (metronome 128)]
  (recording-start "~/Source/Clojure/hacker-music/week0.wav")
  (original-sin)
  (Thread/sleep (- (metro 8) (now)))
  (recording-stop)
  (stop))

