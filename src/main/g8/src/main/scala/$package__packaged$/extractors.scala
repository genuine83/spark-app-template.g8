package ru.beeline.spark.etl.project

import org.apache.spark.sql.DataFrame

object extractors extends SparkSessionWrapper {
  def readCsv(filePath: String,
              header: Boolean = true,
              separator: String = ",",
              inferSchema: Boolean = true): DataFrame = {
    spark.read.format("csv")
      .option("header", s"$header")
      .option("sep", separator)
      .option("inferSchema", s"$inferSchema")
      .load("titanic.csv")
  }
}
