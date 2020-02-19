name := "akka_sample_cassandra_testkit"

version := "0.1"

scalaVersion := "2.13.1"
val akkaVersion = "2.6.3"
val cassandraPluginVersion = "0.102"

Global / cancelable := false

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-cassandra" % cassandraPluginVersion,
  "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % cassandraPluginVersion)
