ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % Test
libraryDependencies += "org.scalamock" %% "scalamock" % "5.2.0" % Test
libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.30.0"

lazy val root = (project in file("."))
  .settings(
    name := "bank-scala"
  )
