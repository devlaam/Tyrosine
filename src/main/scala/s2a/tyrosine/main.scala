package s2a.serine

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom.{document, window, HTMLDivElement, Node}


object Main :

  private val tyrosineVersion = document.querySelector("tyrosineVersion").asInstanceOf[HTMLDivElement]

  @JSExportTopLevel("main")
  def main(args: Array[String]): Unit =
    import BuildInfo.*
    def changed = if changes == "0" then "(clean)" else s"(with $changes changes)"
    val scalaJSversion = libraryDependencies.find(_.contains("scalajs-library")).map(_.lastStr(":")).getOrElse("unknown")
    val otherLibraries = libraryDependencies.drop(3).map(x => s"${x.midStr(":")} version ${x.lastStr(":")}").mkString(", ")
    logger.info(s"Tyrosine Demo, starting from ${window.location.href}")
    logger.info(s"Application info: version $version, build $buildInfoBuildNumber, commit $commit $changed")
    logger.info(s"Building info: sbt version: $sbtVersion, scala version $scalaVersion, scalaJS version $scalaJSversion")
    logger.info(s"Libraries: $otherLibraries")
    logger.info(s"Compiler options: ${scalacOptions.mkString(",")}")
    tyrosineVersion.textContent = s"Tyrosine Demo, version $version, build $buildInfoBuildNumber."

