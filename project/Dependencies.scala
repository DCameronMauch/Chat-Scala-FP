import sbt._

object Dependencies {
  private val http4s_version = "0.20.6"
  private val http4s_blaze_server = "org.http4s" %% "http4s-blaze-server" % http4s_version
  private val http4s_circe = "org.http4s" %% "http4s-circe" % http4s_version
  private val http4s_dsl = "org.http4s" %% "http4s-dsl" % http4s_version
  private val circe_generic = "io.circe" %% "circe-generic" % "0.11.1"

  // private val specs2 = "org.specs2" %% "specs2-core" % "4.5.1"

  private val mainDeps = Seq(
    http4s_blaze_server,
    http4s_circe,
    http4s_dsl,
    circe_generic
  )

  private val testDeps = Seq.empty[ModuleID]

  val allDeps: Seq[ModuleID] = mainDeps ++ testDeps.map(_ % Test)
}
