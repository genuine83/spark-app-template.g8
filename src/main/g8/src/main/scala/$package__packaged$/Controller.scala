package ru.beeline.spark.etl.project

object Controller extends App with SparkSessionWrapper {
  val df1 = extractors.readCsv("titanic.csv")
  df1.show(numRows = 20, truncate = false)
  df1.printSchema()
}