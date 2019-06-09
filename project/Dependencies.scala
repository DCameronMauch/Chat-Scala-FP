import sbt._

object Dependencies {
  private val http4s_version = "0.20.1"
  private val http4s_blaze_server = "org.http4s" %% "http4s-blaze-server" % http4s_version
  private val http4s_dsl = "org.http4s" %% "http4s-dsl" % http4s_version

  // private val specs2 = "org.specs2" %% "specs2-core" % "4.5.1"

  private val mainDeps = Seq(
    http4s_blaze_server,
    http4s_dsl
  )

  private val testDeps = Seq.empty[ModuleID]

  val allDeps: Seq[ModuleID] = mainDeps ++ testDeps.map(_ % Test)
}