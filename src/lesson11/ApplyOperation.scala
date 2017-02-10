package lesson11

/**
  * Created by hipparchus on 2017/2/9.
  * apply function
  */

class ApplyTest{
  def apply() = println("I am into Spark!")
  def haveATry: Unit ={
    println("Have a try on apply!")
  }
}

object ApplyTest{
  def apply() = {
    println("I am into Scala!")
    new ApplyTest
  }
}

object ApplyOperation {
  def main(args: Array[String]) {
//    val arr = Array(1,2,3,4,5)
//    val a = ApplyTest()
//    a.haveATry
    val a = new ApplyTest
    a.haveATry
    println(a())
  }
}
