import sbt._

class LuceneScalaProject(info: ProjectInfo) extends DefaultProject(info) {

  lazy val hi = task { println("Lucene Scala Research Project"); None }

  //val mysqljdbc = "mysql" % "mysql-connector-java" % "5.1.12"

  override def mainScalaSourcePath = "src"
}
