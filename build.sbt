lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "io.github.maksymilianrozanski",
      scalaVersion := "2.13.3"
    )
  ),
  name := "metals-sample",
  scalacOptions ++= Seq(
    "-Yrangepos",
    "-P:semanticdb:failures:warning",
    "-P:semanticdb:synthetics:on",
    "-Xplugin-require:semanticdb",
    "-P:semanticdb:sourceroot:" +
      baseDirectory.in(ThisBuild).value.toString
  )
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test

addCompilerPlugin(
  "org.scalameta" % "semanticdb-scalac" % "4.3.18" cross CrossVersion.full
)
