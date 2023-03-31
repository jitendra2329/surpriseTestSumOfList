ThisBuild / version := "0.1.0-SNAPSHOInt"

ThisBuild / scalaVersion := "2.13.10"

lazy val rooInt = (project in file("."))
  .settings(
    name := "surpriseTestListSum"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
