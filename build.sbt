import Dependencies.allDeps

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.github.dcameronmauch"
ThisBuild / version      := "0.1.0"

lazy val app = (project in file("."))
  .settings(
    name := "scala_http4s_zio",
    libraryDependencies ++= allDeps,
    scalacOptions ++= Seq(
      "-Ypartial-unification"
    )
  )