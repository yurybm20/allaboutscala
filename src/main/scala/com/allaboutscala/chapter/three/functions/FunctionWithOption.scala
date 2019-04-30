package com.allaboutscala.chapter.three.functions

object FunctionWithOption {

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
