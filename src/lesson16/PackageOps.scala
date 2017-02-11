package lesson16

/**
  * Created by hipparchus on 2017/2/11.
  * package
  */
package com.scala.spark
package object people {
  val defaultName = "Scala"
}

package people {
  class people {
    var name = defaultName
  }
}

import java.awt.{color,Font}
import java.util.{HashMap=>JavaHashMap}
import scala.{StringBuilder => _}

class PackageOps{}

package spark.navigation {
  abstract  class Navigator{
    def act
  }
  package tests {

    //I'm in package spark.Navigation.test
    class NavigatorSuite
  }
  package impls {
    class Action extends Navigator{
      override def act {
        println("action")
      }
    }
  }
}

package hadoop {
  package navigation {
    class Navigator
  }

  package launch {

    class Booster {
      val nav = new navigation.Navigator
    }
  }
}
object PackageOps {
  def main(args: Array[String]) {

  }
}
