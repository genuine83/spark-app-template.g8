package ru.beeline.spark.etl.project

import org.apache.spark

object Controller extends App with SparkSessionWrapper {
  System.out.println("Hello Spark!")
//  val df1 = spark.Seq(("John", "Daw")("Smith", "Brown"))
//  df1.show(numRows = 20, truncate = false)
//  df1.printSchema()
}