package lesson15

/**
  * Created by hipparchus on 2017/2/10.
  * trait & AOP
  */
class UseTrait{

}

class Human{
  println("Human")
}

trait Teacher extends Human{
  println("Teacher")
  def teach
}

trait PianoPlayer extends Human{
  println("PianoPlayer")
  def playPiano = {
    println("I'm playing piano.")
  }
}

class PianoTeacher extends Human with Teacher with PianoPlayer{
  override def teach = {
    println("I'm training student.")
  }
}

trait Action {
  def doAction
}

trait TBeforeAfter extends Action{
  abstract override def doAction: Unit = {
    println("Initialization")
    super.doAction
    println("Destroyed")
  }
}

class Worker extends Action {
  override def doAction = println("Working...")
}

object UseTrait {
  def main(args: Array[String]) {
//   val t1 = new PianoTeacher
//    t1.playPiano
//    t1.teach
    val worker = new Worker with TBeforeAfter
    worker.doAction
  }
}
