package com.allaboutscala.chapter.three.functions

object TypedFunction extends App {

  /**
    * Typed Function Example
    * @param discount
    * @tparam T
    */
  def applyDiscount[T](discount: T): Unit = {
    discount match {
      case d: String =>
        println(s"14. Lookup percentage discount in database for $d")
      case d: Double =>
        println(s"14. $d discount will be applied")
      case _ => println("14. Unsupported discount type")
    }
  }

  applyDiscount[String]("Coupon_140")
  applyDiscount[Double](10)
  applyDiscount[Int](10)

}
