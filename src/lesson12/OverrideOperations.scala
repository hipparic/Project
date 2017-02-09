package lesson12

/**
  * Created by hipparchus on 2017/2/9.
  * scala inherit
  */

class Person(val name:String, var age:Int){
  println("The primary constructor of Person")

  val school = "XDU"

  def study = "study in the morning"

  override def toString = "I am a Person,name:" + name +",age:" + age
}

class Student(name :String, age:Int, val grade:String) extends Person(name,age){
  println("This is the subClass of Person, Primary constructor of  Student")
  override val school = "BJU"

  override def toString = "I am a student,name:"+name+",age:" + age + ","+super.study
}
object OverrideOperations {
  def main(args: Array[String]) {
    val w = new Student("hipparchus", 25, "grade four")
    println("School:" + w.school)
    println("Grade:"+ w.grade)
    print(w.toString)
  }
}
