(ns grpc-test.core
  (:require
   [grpc-test.hello-service :refer [handle-my-hello-one]])

  (:import
   [io.grpc ServerBuilder]
   [org.thxnet.core.hello.v0 HelloGrpc$HelloImplBase])

  (:gen-class))

(defn create-hello-service []
  (proxy [HelloGrpc$HelloImplBase] []
    (myHelloOne [request response-observer]
      (let [response (handle-my-hello-one request)]
        (.onNext response-observer response)
        (.onCompleted response-observer)))))

(defn -main [& args]
  (let [server (.build (.addService (ServerBuilder/forPort 50051)
                                    (create-hello-service)))]
    (.start server)
    (println "Server started on port 50051")
    (.awaitTermination server)))
