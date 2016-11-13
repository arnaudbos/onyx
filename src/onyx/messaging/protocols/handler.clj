(ns onyx.messaging.protocols.handler)

(defprotocol Handler 
  (prepare-poll! [this])
  (set-replica-version! [this new-replica-version])
  (set-epoch! [this new-epoch])
  (handle-recovery [this message session-id])
  (handle-messages [this message position])
  (set-recover! [this recover*])
  (get-recover [this])
  (set-heartbeat! [this])
  (get-heartbeat [this])
  (set-ready! [this sess-id])
  (get-session-id [this])
  (block! [this])
  (unblock! [this])
  (blocked? [this])
  (completed? [this])
  (get-batch [this]))
