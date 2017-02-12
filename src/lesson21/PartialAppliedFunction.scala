package lesson21

/**
  * Created by hipparchus on 2017/2/12.
  * partial applied function
  */
object PartialAppliedFunction {

  def main(args: Array[String]) {
//    val data = List(1,2,3,4,5,6)
//    data.foreach(println _)
//    data.foreach(x => println(x))

    def sum(a:Int, b:Int, c:Int) = a + b + c
    println(sum(1,2,3))

    val fp_a = sum _
    println(fp_a(1,2,3))
    println(fp_a.apply(1,2,3))
    val fp_b = sum(1, _ :Int ,3)
    println(fp_b(2))
    println(fp_b(10))
  }
}
