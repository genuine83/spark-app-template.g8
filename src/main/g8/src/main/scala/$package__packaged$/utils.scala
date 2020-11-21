package ru.beeline.spark.etl.project

import org.apache.spark.sql.Column
import org.apache.spark.sql.functions._

object utils {

  def isEven(col: Column): Column = {
    col % 2 === lit(0)
  }

}

