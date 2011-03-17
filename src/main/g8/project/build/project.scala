import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {

  // Repositories
  val sts = ScalaToolsSnapshots // For scalaz 5.1-SNAPSHOT needed by specs2

  // Compile dependencies

  // Test dependencies
  val mockito = "org.mockito" % "mockito-all" % "1.8.5" % "test"
  val scalaCheck = "org.scala-tools.testing" %% "scalacheck" % "1.8" % "test"
  val specs2 = "org.specs2" %% "specs2" % "1.0.1" % "test"

  // Test frameworks
  def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
  override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)
}
