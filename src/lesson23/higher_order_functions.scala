package lesson23

/**
  * Created by hipparchus on 2017/2/12.
  * higher order functions
  */
object higher_order_functions {
  def main(args: Array[String]) {
    (1 to 9).map("*" * _).foreach(println _)
    (1 to 9).filter( _ % 2 == 0).foreach(println)
    println((1 to 9).reduceLeft(_ * _))
    "Spark is more and more becoming the popular farmework in analysis big data".split(" ").
      sortWith(_.length < _.length).foreach(println)
    val fun = ceil _
    val NUM = 3.14
    fun(NUM)
    Array(3.14,2.33,1.0).map(fun)

    val triple = (x:Double) => 3 * x
    Array(3.14,1.42,2.0).map((x:Double) => 3*x)
    Array(3.14,1.42,2.0).map{(x:Double) => 3*x}

    def high_order_functions(f:(Double) => Double) = f(0.64)
    println(high_order_functions(ceil _))
    println(high_order_functions(sqrt _))

    def mulBy(factor :Double) = (x:Double) => factor * x
    val qunituple = mulBy(5)
    println(qunituple(20))

    println(high_order_functions((x:Double) => 3 * x))
    high_order_functions((x) => 3 * x)
    high_order_functions(x => 3 * x)
    high_order_functions(3 * _)
    //可以使用占位符来表示参数，但是必须指定参数类型
    val fun2 = 3 * (_:Double)
    val fun3 : (Double) => Double = 3 * _
  }
}
