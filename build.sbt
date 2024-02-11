enablePlugins(ScalaJSPlugin)

scalaVersion  := "3.3.1"
name          := "tyrosine"
organization  := "s2a"
version       := "0.1.0"

scalacOptions ++= Seq("-feature","-deprecation","-unchecked","-new-syntax","-indent","-explain","-Wunused:all","-Wnonunit-statement","-Wvalue-discard")

import scala.sys.process._
def commit =  BuildInfoKey.action("commit"){("git rev-parse HEAD").!!.trim.take(8)}
def changes = BuildInfoKey.action("changes"){("git status --porcelain" #| "wc -l").!!.trim}

lazy val root = (project in file(".")).enablePlugins(BuildInfoPlugin).settings(
  buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, scalacOptions, sbtVersion, libraryDependencies, buildInfoBuildNumber, commit, changes),
  buildInfoPackage := "s2a.tyrosine" )

semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision

libraryDependencies ++= Seq(
  "org.scala-js"   %%% "scalajs-dom"      % "2.6.0",
  "com.lihaoyi"    %%% "scalatags"        % "0.12.0")

scalaJSUseMainModuleInitializer := true
