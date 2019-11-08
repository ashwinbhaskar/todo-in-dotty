val dottyVersion = "0.20.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "todo-in-dotty",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "com.typesafe.slick"  % "slick_2.13" % "3.3.2",
      "org.slf4j" % "slf4j-nop" % "1.7.26",
      "com.typesafe.slick" % "slick-hikaricp_2.13" % "3.3.2"
    )
  )
