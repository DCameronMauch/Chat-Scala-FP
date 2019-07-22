import Dependencies.allDeps

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.github.dcameronmauch"
ThisBuild / version      := "0.1.0"

lazy val app = (project in file("."))
  .settings(
    name := "chat_scala_fp",
    libraryDependencies ++= allDeps,
    scalacOptions ++= Seq(
      "-Ypartial-unification"
    )
  )