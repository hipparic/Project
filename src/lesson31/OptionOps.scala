package lesson31

/**
  * Created by hipparchus on 2017/2/18.
  * Option
  */
object OptionOps {
  def main(args: Array[String]) {
    val scores = Map("Alice" -> 99, "Spark" -> 100)

    scores.get("Alice") match {
      case Some(score) => println(score)
      case None => println("No score")
    }
  }
}
