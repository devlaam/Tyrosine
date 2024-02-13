package s2a.tyrosine

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom.{console, document, window, HTMLDivElement}

object Main :

  private def afterLastSemicolon(s: String): Option[String] =
    val i = s.lastIndexOf(":")
    if i<0 then None else Some(s.substring(i+1))

  private def reportVersionOnConsole(): Unit =
    import BuildInfo.*
    val tyrosineVersion = document.querySelector("#version").asInstanceOf[HTMLDivElement]
    val changed         = if changes == "0" then "(clean)" else s"(with $changes changes)"
    val scalaJSversion  = libraryDependencies.find(_.contains("scalajs-library")).flatMap(afterLastSemicolon).getOrElse("unknown")
    console.info(s"Tyrosine Demo, starting from ${window.location.href}")
    console.info(s"Application info: version $version, build $buildInfoBuildNumber, commit $commit $changed")
    console.info(s"Building info: sbt version $sbtVersion, scala version $scalaVersion, scalaJS version $scalaJSversion")
    console.info(s"Compiler options: ${scalacOptions.mkString(",")}")
    tyrosineVersion.textContent = s"Tyrosine Demo, version $version, build $buildInfoBuildNumber."


  @JSExportTopLevel("main")
  def main(args: Array[String]): Unit =
    reportVersionOnConsole()

