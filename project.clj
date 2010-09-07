(defproject compojureongae "0.3.0"
  :description "Example app for deployoing Compojure on Google App Engine"
  :namespaces [compojureongae.core]
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.4.1"]
                 [ring/ring-servlet "0.2.5"]
                 [hiccup "0.3.0"]
                 [appengine "0.2"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.7"]
                 [com.google.appengine/appengine-api-labs "1.3.7"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [ring/ring-jetty-adapter "0.2.5"]
                     [com.google.appengine/appengine-local-runtime "1.3.4"]
                     [com.google.appengine/appengine-api-stubs "1.3.4"]]
  :repositories { "gae" "http://maven-gae-plugin.googlecode.com/svn/repository/"
                  "jboss" "http://repository.jboss.com/maven2/"}
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib")