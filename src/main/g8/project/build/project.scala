import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {

  // Repositories
//  val sts = ScalaToolsSnapshots

  // Compile dependencies
//  val scalaz = "org.scalaz" %% "scalaz-core" % "6.0-SNAPSHOT"

  // Test dependencies
  val specs2 = "org.specs2" %% "specs2" % "1.3" % "test"

  // Test frameworks
  def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
  override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)
}
