ThisBuild / scalaVersion := "2.13.0"
ThisBuild / organization := "com.github.dcameronmauch"
ThisBuild / version      := "0.1.0"

lazy val app = (project in file("."))
  .settings(
    name := "scala_http4s_zio"
  )