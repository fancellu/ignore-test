ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala3test",
    crossScalaVersions := List("2.12.17", "2.13.10")
  )

//resolvers += "jitpack" at "https://jitpack.io"
//
//libraryDependencies ++= Seq(
//  "com.github.fancellu" % "openai-scala-models" % "v1.1.0.beta1"
//)