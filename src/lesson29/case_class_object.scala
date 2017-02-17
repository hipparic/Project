package lesson29

/**
  * Created by hipparchus on 2017/2/17.
  * case class & case object
  */

abstract class Person
case class Student(age:Int) extends Person
case class Worker(age:Int, salary:Double) extends Person
case object Shared extends Person

object case_class_object {

  def main(args: Array[String]) {
    def caseOps(person: Person) = person match {
      case Student(age) => println("I am "+ age + " years old")
      case Worker(_, salary) => println("salary:" + salary)
      case Shared => println("No property")
    }

    caseOps(Student(19))
    caseOps(Shared)

    val worker = Worker(29,10000.1)
    val worker2 = worker.copy(salary = 19.92)
    val worker3 = worker.copy(age = 30)
  }

}
