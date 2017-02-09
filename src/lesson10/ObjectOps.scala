package lesson10

/**
  * Created by hipparchus on 2017/2/9.
  */

class College{
  val id = College.studentNo
  private var number = 0
  def addClass(number:Int){this.number += number}
}

object College{
  private var studentNo = 0
  def newStudentNo = {
    studentNo += 1
    studentNo
  }
}

object ObjectOps {
  def main(args: Array[String]) {
    println(College.newStudentNo)
    println(College.newStudentNo)
  }
}
