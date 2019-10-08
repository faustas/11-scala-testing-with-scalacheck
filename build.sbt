name := "11-scala-testing-with-scalacheck"

version := "0.1"

scalaVersion := "2.13.0"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies ++= Seq(
  "org.scalacheck"    %% "scalacheck"   % "1.14.1" % Test,
  "org.scalatest"     %% "scalatest"    % "3.0.8"  % Test
)