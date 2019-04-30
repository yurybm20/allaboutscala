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
      case _ =>
        println("14. Unsupported discount type")
    }
  }

  //applyDiscount[String]("Coupon_140")
  //applyDiscount[Double](10)
  //applyDiscount[Int](10)


  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"15. Lookup percentage discount in database for $d")
        Seq[T](discount)
      case d: Double =>
        println(s"15. $d discount will be applied")
        Seq[T](discount)
      case _ =>
        println("15. Unsupported discount type")
        Seq[T](discount)
    }
  }


  println(s"With Stting parameter = ${applyDiscountWithReturnType[String]("Coupon_123")}")
  println(s"With Double parameter = ${applyDiscountWithReturnType[Double](10)}")
  println(s"With Int parameter = ${applyDiscountWithReturnType[Int](10)}")


}
