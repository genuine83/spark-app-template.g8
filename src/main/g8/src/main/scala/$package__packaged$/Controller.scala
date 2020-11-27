package $package$


object Controller extends App with SparkSessionWrapper {
  import spark.implicits._

  case class Person(firstName: String, lastName: String)

  val df1 = spark.createDataset(Seq(Person("John", "Daw")))

  df1.show(numRows = 20, truncate = false)
  df1.printSchema()

  spark.conf.getAll.foreach(println)
}