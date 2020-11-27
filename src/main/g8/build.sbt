name := "$name;format="Camel"$"

version := "$version$"

scalaVersion := "$scalaVersion$"
val sparkVersion = "$sparkVersion$"
val typeSafeVersion = "$typeSafeVersion$"
val scalaTestVersion = "$scalaTestVersion$"

libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "compile"
libraryDependencies += "org.apache.spark" %% "spark-hive" % sparkVersion % "compile"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "compile"
libraryDependencies += "com.typesafe" % "config" % typeSafeVersion
libraryDependencies += "com.github.mrpowers" %% "spark-fast-tests" % "0.21.3" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test"

fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")