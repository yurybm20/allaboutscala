package com.allaboutscala.chapter.one.functions

object FunctionExamples extends App {


  /**
    * Function without parameters nor a return type
    */

  def favoriteDonut(): String = {
    "Glazed Donut"
  }

  println(s"My favorite donut is $favoriteDonut")

  /**
    * Function without paranthesis
    */

  def leastFavoriteDonut = "Plain Donut"
  //println(s"My least favorite donut is $leastFavoriteDonut")


  /**
    * Function without a return type
    */

  def printDonutSalesReport() : Unit = {
    //database searching ...
    println("Printing donut sales report ... done!")
  }

  //printDonutSalesReport()

}
