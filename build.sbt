name := "scoobi-specs-example"

version := "0.1.0"

scalaVersion := "2.10.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:higherKinds"
)

libraryDependencies ++= Seq(
  "com.nicta" %% "scoobi" % "0.7.0-cdh4-SNAPSHOT",
  "org.specs2" %% "specs2" % "1.12+" % "test"
)

resolvers ++= Seq(
  "nicta"              at "http://nicta.github.com/scoobi/releases",
  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "sonatype"           at "http://oss.sonatype.org/content/repositories/releases/"
)
