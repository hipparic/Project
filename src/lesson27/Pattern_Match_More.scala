package lesson27

/**
  * Created by hipparchus on 2017/2/15.
  * Type\Tuple\Array\List match
  */
object Pattern_Match_More {

  def main(args: Array[String]) {
    def match_type (t:Any) = t match {
      case p:Int => println("this is Integer")
      case p:String => println("this is String")
      case m:Map[_, _] => m.foreach(println)
      case _ => println("UnKnown type!")
    }

    match_type(2)
    match_type(Map("Scala" -> "Spark"))

    def match_array(arr :Any) = arr match {
      case Array(0) => println("Array: " + 0)
      case Array(x,y) => println("Array: " + x + " " + y)
      case Array(0,_*) => println("Array: " + "0......")
      case _ => println("something else")
    }

    match_array(Array(0))
    match_array(Array(1,0))
    match_array(Array(0,1,2,3,1))

    def match_list(list :Any) = list match {
      case 0::Nil => println("List:" +"0")
      case x::y::Nil => println("List:" + x + " " + y)
      case 0::tail => println("List:" + "0...")
      case _ => println("something else")
    }

    match_list(List(0))
    match_list(List(3,0))
    match_list(List(0,1,2,3))

    def match_tuple(tuple:Any) = tuple match{
      case (0,_) => println("Tuple:"+ 0)
      case (x,_) => println("Tuple:" + x)
      case _ => println("something else")
    }

    match_tuple((0,"scala"))
    match_tuple((2,0))
    match_tuple((1,2,3,"string",Map("scala"->"spark")))
  }
}
