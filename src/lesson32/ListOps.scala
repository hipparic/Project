package lesson32

/**
  * Created by hipparchus on 2017/2/18.
  * List & Pattern Match
  */
object ListOps {
  def main(args: Array[String]) {
    val bigData = List("Hadoop","spark")
    val data = List(1,2,3)

    val bigData_Core = "Hadoop" :: ("Spark" :: Nil)
    val data_Int = 1 :: 2 :: 3 :: Nil

    println(data.isEmpty)
    println(data.head)
    println(data.tail)

    val List(a,b) = bigData
    println("a: " + a + "===" + " b: " + b)
    val x :: y :: rest = data
    println("x : " + x + " === " + "y:" + y + " === " + rest)

    val shuffledData = List(4,3,5,2,3,4,6)
    println(sortList(shuffledData))

    def sortList(list:List[Int]):List[Int] = list match {
      case List() => List()
      case head::tail => compute(head,sortList(tail))
    }

    def compute(data:Int,dataSet:List[Int]) : List[Int] = dataSet match{
      case List() => List(data)
      case head::tail => if (data <= head) data :: dataSet else head :: compute(data,tail)
    }

  }
}
