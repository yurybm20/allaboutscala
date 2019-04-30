package com.allaboutscala.chapter.three.functions

object SimpleFunction extends App {


  /**
    * Function without parameters nor a return type
    */

  def favoriteDonut(): String = {
    "Glazed Donut"
  }

  //println(s"1. My favorite donut is $favoriteDonut")

  /**
    * Function without parenthesis
    */

  def leastFavoriteDonut = "Plain Donut"
  //println(s"2. My least favorite donut is $leastFavoriteDonut")


  /**
    * Function without a return type
    */

  def printDonutSalesReport() : Unit = {
    //database searching ...
    println("3. Printing donut sales report ... done!")
  }

  //printDonutSalesReport()

  /**
    * Function with parameters no return type
    */

  def calculateDonutCost(donutName: String, quantity: Int): Unit = {
    println(s"4. Calculating cost for $donutName, quantity = ${2.50 * quantity}")
  }

  //calculateDonutCost("Vanilla Donut", 100)

  /**
    * ... Adding default values to function parameters
    */

  def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Unit = {
    println(s"5. Calculating cost for $donutName, quantity = ${2.50 * quantity}, couponCode = $couponCode")
  }

  //calculateDonutCost2("Vanilla Donut", 100)
  //calculateDonutCost2("Vanilla Donut", 100, "Coupon_1234")

}
