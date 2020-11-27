package $package$


import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import scala.collection.JavaConversions.{asScalaBuffer, asScalaSet, mapAsScalaMap}


trait SparkSessionWrapper extends Serializable {

  lazy val spark: SparkSession = {

    val applicationConf: Config = ConfigFactory.load()
    val strMaster = applicationConf.getString("spark.master")
    val strAppName = applicationConf.getString("spark.app.name")

    val configArray = applicationConf
      .entrySet()
      .map(obj => (obj.getKey, applicationConf.getString(obj.getKey)))
      .filter(_._1.contains("spark")).toList.toArray

    val conf = new SparkConf()
      .setExecutorEnv(configArray)
      .setMaster(strMaster)
      .setAppName(strAppName)

    SparkSession.builder().config(conf)
      .enableHiveSupport()
      .getOrCreate()
  }

}