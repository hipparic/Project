package lesson13

/**
  * Created by hipparchus on 2017/2/10.
  * Abstract Class
  */
class AbstractClassOps{
  var id:Int = _
}
abstract class SuperTeacher(val name:String){
  var id:Int
  var age:Int
  def teach
}

class MathsTeacher(name:String) extends SuperTeacher(name){
  override var id = name.hashCode
  override var age = 25
  override def teach: Unit ={
    println("Teach Maths!")
  }
}
object AbstractClassOps {
  def main(args: Array[String]) {
    val teacher = new MathsTeacher("Maths Teacher Hipparchus")
    teacher.teach

    println("teacher.id:" + teacher.id)
    println("teach.name:" + teacher.name)
  }
}
