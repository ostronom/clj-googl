(ns clj-googl.core
	(:refer-clojure)
	(:require [clojure.contrib.json :as json]
		  [com.twinql.clojure.http :as http])
	(:import (java.net URI)
		 (org.apache.http.entity StringEntity)))

(def *apiuri* (java.net.URI. "https://www.googleapis.com/urlshortener/v1/url"))

(defn shorten [url]
	"Shorten long URL"
	(:id (:content (http/post 
		*apiuri*
		:headers {"Content-Type" "application/json"}
		:body (StringEntity. (json/json-str {:longUrl url}))
		:as :json))))

(defn expand [url]
	"Expand short URL"
	(:longUrl (:content (http/get *apiuri* :query {:shortUrl url} :as :json))))
