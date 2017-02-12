package lesson19

/**
  * Created by hipparchus on 2017/2/12.
  * regExpress
  */
object RegExpressOps {

  def main(args: Array[String]) {
    val regex = """([0-9]+) ([a-z]+)""".r
    val numPattern = "[0-9]+".r
    val numberPattern = """\s+[0-9]+\s+""".r

    //findAllIn 返回遍历所有匹配项的迭代器
    for (matchString <- numPattern.findAllIn("999 scala,1234 spark")) println(matchString)

    //找到首个匹配项 findFirstIn 返回的是一个Option类型的数据，找到是Some(匹配内容),未找到是None
    println(numberPattern.findFirstIn("999 scala,1234 spark"))

    val numitemPattern = """([0-9]+) ([a-z]+)""".r

    val numitemPattern(num, item) = "99 hadoop"
    println("num:" + num + ",item:" + item)

    val line = "90809 spark"
    line match{
      case numitemPattern(num,blog) => println(num + "\t" + blog)
      case _ => println("defalut!")
    }
  }
}
