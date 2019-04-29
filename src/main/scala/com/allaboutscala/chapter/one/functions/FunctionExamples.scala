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
    * Function without parenthesis
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

  /**
    * Function with parameters no return type
    */

  def calculateDonutCost(donutName: String, quantity: Int): Unit = {
    println(s"Calculating cost for $donutName, quantity = ${2.50 * quantity}")
  }

  //calculateDonutCost("Vanilla Donut", 100)

  /**
    * ... Adding default values to function parameters
    */

  def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Unit = {
    println(s"Calculating cost for $donutName, quantity = ${2.50 * quantity}, couponCode = $couponCode")
  }

  calculateDonutCost2("Vanilla Donut", 100)
  calculateDonutCost2("Vanilla Donut", 100, "Coupon_1234")


}
