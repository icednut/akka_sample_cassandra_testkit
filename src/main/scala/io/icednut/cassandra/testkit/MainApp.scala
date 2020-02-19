package io.icednut.cassandra.testkit

import java.io.File
import java.util.concurrent.CountDownLatch

import akka.persistence.cassandra.testkit.CassandraLauncher

/**
 * @author will.109
 * @date 2020/02/19
 **/
object MainApp extends App {
  val databaseDirectory = new File("target/cassandra-db")
  CassandraLauncher.start(databaseDirectory, CassandraLauncher.DefaultTestConfigResource, clean = false, port = 9042)

  sys.addShutdownHook {
    CassandraLauncher.stop()
  }
  println("Started Cassandra, press Ctrl + C to kill")
  new CountDownLatch(1).await()
}
