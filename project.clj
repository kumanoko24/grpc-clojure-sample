(defproject grpc-test "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [io.grpc/grpc-netty-shaded "1.63.0"]
                 [io.grpc/grpc-protobuf "1.63.0"]
                 [io.grpc/grpc-stub "1.63.0"]
                 [com.google.protobuf/protobuf-java "4.26.1"]]
  :main ^:skip-aot grpc-test.core
  :target-path "target/%s"
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
