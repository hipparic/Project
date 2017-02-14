package lesson28

/**
  * Created by hipparchus on 2017/2/15.
  * Extractor
  */
object Extract {

  def main(args: Array[String]) {
    def match_array(arr :Any) = arr match {
      case Array(0) => println("Array: " + 0)
      case Array(x,y) => println("Array: " + x + " " + y)
      case Array(0,_*) => println("Array: " + "0......")
      case _ => println("something else")
    }

    match_array(Array(0))
    match_array(Array(1,0))
    match_array(Array(0,1,2,3,1))

    val pattern = "([0-9]+) ([a-z]+)".r

    "1112 helloScala" match {
      case pattern(num,string) => println(num + " " + string)
    }
  }
}
