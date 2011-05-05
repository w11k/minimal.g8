import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {

  // Repositories
  val sts = ScalaToolsSnapshots

  // Compile dependencies
//  val scalaz = "org.scalaz" %% "scalaz-core" % "6.0-SNAPSHOT"

  // Test dependencies
  val mockito = "org.mockito" % "mockito-all" % "1.8.5" % "test"
//  val scalaCheck = "org.scala-tools.testing" %% "scalacheck" % "1.9-SNAPSHOT" % "test"
  val specs2 = "org.specs2" %% "specs2" % "1.3-SNAPSHOT" % "test"

  // Test frameworks
  def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
  override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)
}
