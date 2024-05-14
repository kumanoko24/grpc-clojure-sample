(ns grpc-test.hello-service
  (:import
   [org.thxnet.core.hello.v0 Hello1Request Hello1Resposne])

  (:gen-class))

(defn handle-my-hello-one ^Hello1Resposne [^Hello1Request request]
  (let [name (.getName request)
        nick-name (if (.hasNickName request) (.getNickName request) "")]
    (.build
     (doto (Hello1Resposne/newBuilder)
       (.setMessage (str "Hello, " name))
       (.setMoreMessage (if (= "" nick-name)
                          (str "Also known as " nick-name)
                          ""))))))
