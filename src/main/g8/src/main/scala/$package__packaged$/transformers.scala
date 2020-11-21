package ru.beeline.spark.etl.project

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._

object transformers {

  def happyData()(df: DataFrame): DataFrame = {
    df.withColumn("happy", lit("data is fun"))
  }

}
