package lesson18

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Created by hipparchus on 2017/2/12.
  * file Options
  */
object FileOps {
  def main(args: Array[String]) {
//    val file = Source.fromFile("D:\\work\\test.txt")
//    for (line <- file.getLines()){
//      println(line)
//    }
//    file.close()
//    val webFile = Source.fromURL("http://spark.apache.org/")
//    webFile.foreach(print)
//    webFile.close()
//    val writer = new PrintWriter(new File("scala.txt"))
//    for (i <- 1 to 100) writer.println(i)
//    writer.close()
    println("please enter your input:")
    val line = Console.readLine
    println("Thank you ,just typed:" + line)
  }
}
