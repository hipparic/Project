package lesson14

/**
  * Created by hipparchus on 2017/2/10.
  * trait
  */
class UseTrait{

}

trait Logger{
  def log (msg:String){}
}

class ConcreteLogger extends Logger with Cloneable{
  override def log(msg:String) = print("Log:" + msg)

  def concreteLog{
    log("concrete log!")
  }
}

trait TraitLogger extends Logger{
  override def log (msg:String): Unit ={
    print("TraitLogger Log content is : " + msg)
  }
}

trait TraitLoggered{
  def logged(msg:String): Unit ={
    println("TraitLoggered log content is : " + msg)
  }
}

trait ConsoleLogger extends TraitLogger{
  override def log(msg:String): Unit ={
    println("Log from Console ：" + msg)
  }
}

class Test extends ConsoleLogger{
  def test: Unit ={
    log("Here is Test!")
  }
}

abstract class Account{
  def save
}

class MyAccount extends Account with ConsoleLogger{
  def save: Unit ={
    log("MyAccount Logger INFO!")
  }
}

object UseTrait {
  def main(args: Array[String]) {
    val logger = new ConcreteLogger with TraitLogger
    logger.concreteLog
  }
}
