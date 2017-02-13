package lesson24

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

/**
  * Created by hipparchus on 2017/2/13.
  * main
  */
object SAM {
  def main(args: Array[String]) {
    var data = 0
    val frame = new JFrame("SAM Testing")
    val jButton = new JButton("Counter")
//    jButton.addActionListener(new ActionListener {
//      override def actionPerformed(e: ActionEvent): Unit = {
//        data += 1
//        println(data)
//      }
//    })

    implicit def convertedAction(action:(ActionEvent) => Unit) =
      new ActionListener {
        override def actionPerformed(e: ActionEvent): Unit = {action(e)}
      }

    jButton.addActionListener((e:ActionEvent) => {data += 1; println(data)})

    frame.setContentPane(jButton)
    frame.pack()
    frame.setVisible(true)
  }
}
