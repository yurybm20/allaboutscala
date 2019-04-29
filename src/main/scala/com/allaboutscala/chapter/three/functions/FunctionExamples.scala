package com.allaboutscala.chapter.three.functions

object FunctionExamples extends App {


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

  /**
    * ... Using Option in function parameters
    */

  def calculateDonutCostOption(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"6. Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }

  //println(s"""Total cost = ${calculateDonutCostOption("Vanilla Donut", 5, None)}""")
  //println(s"""Total cost with coupon = ${calculateDonutCostOption("Vanilla Donut", 5, Some("Cupon_140"))}""")

  /**
    * ... Adding default value to an Option parameter
    */

  def  calculateDonutCostDefaultOption(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"7. Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case _ => 2.50 * quantity
    }
  }

  //println(s"""Total cost = ${calculateDonutCostDefaultOption("Vanilla Donut", 5)}""")
  //println(s"""Total cost with coupon = ${calculateDonutCostDefaultOption("Vanilla Donut", 5, Some("Cupon_140"))}""")


  /**
    * Function with an Option as a return type
    */

  def dailyCouponCode(): Option[String] = {
    val couponFromDb = "COUPON_1234"
    Option(couponFromDb).filter(_.nonEmpty) // remove any empty string
  }

  val todayCoupon: Option[String] = dailyCouponCode()
  //println(s"8. Today's coupon code = ${todayCoupon.getOrElse("No Today's Coupon code")}")

  /**
    * ... Using pattern matching
    */

  /*dailyCouponCode() match {
    case Some(couponCode) => println(s"9. Today's coupon code = $couponCode")
    case None => println("9. No today's coupon code")
  }*/

  

}
