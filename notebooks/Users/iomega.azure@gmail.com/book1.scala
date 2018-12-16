// Databricks notebook source
val defaultMoviesUrl = "https://iomegastorage.blob.core.windows.net/data/movies.csv"
val defaultRatingsUrl = "adl://iomegadls.azuredatalakestore.net/data/ratings-c.csv"
val moviesUrl = dbutils.widgets.text("moviesUrl", "")
var ratingsUrl = dbutils.widgets.text("ratingsUrl", "")

var inputMoviesUrl = dbutils.widgets.get("moviesUrl")
var inputRatingsUrl = dbutils.widgets.get("ratingsUrl")

if(inputMoviesUrl == "" || inputMoviesUrl == null) {
  inputMoviesUrl = defaultMoviesUrl
}

if(inputRatingsUrl == "" || inputRatingsUrl == null) {
  inputRatingsUrl = defaultRatingsUrl
}

println(s"$inputMoviesUrl - $inputRatingsUrl")

// COMMAND ----------

