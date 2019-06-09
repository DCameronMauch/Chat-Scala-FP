import sbt._

object Dependencies {
  private val mainDeps: Seq[ModuleID] = Seq()

  private val testDeps: Seq[ModuleID] = Seq()

  val allDeps: Seq[ModuleID] = mainDeps ++ testDeps.map(_ % Test)
}