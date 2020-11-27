name := "$name;format="Camel"$"

version := "$version$"

scalaVersion := "$scalaVersion$"
val sparkVersion = "$sparkVersion$"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "$sparkVersion$" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "$sparkVersion$" % "provided"

libraryDependencies += "com.github.mrpowers" %% "spark-daria" % "0.38.2"
libraryDependencies += "com.github.mrpowers" %% "spark-fast-tests" % "0.21.3" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")