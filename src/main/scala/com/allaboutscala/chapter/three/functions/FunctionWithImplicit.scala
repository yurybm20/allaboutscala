package com.allaboutscala.chapter.three.functions

object FunctionWithImplicit extends App{

  println(s"""All customer will receive a ${discount *100}% discount""")
  implicit val discount: Double = 0.1
  implicit val storeName: String = "Tasty Donut Store"

  /**
    * Function with an implicit parameter
    * @param donutType
    * @param quantity
    * @param discount
    * @return
    */

  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  //println(s"""10. Total cost with discount of 5 Glazed Dounts = ${totalCost("Glazed Donut", 5)}""")

  /**
    * Function with multiple implicit parameters
    * @param donutType
    * @param quantity
    * @param discount
    * @param storeName
    * @return
    */
  def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
    println(s"[$storeName] Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  //println(s"""11. Total cost with discount of 5 Glazed Dounts = ${totalCost2("Glazed Donut", 5)}""")


  /**
    * manually passed-through
    */
  println(
    s"""12. Total cost with discount of 5 Glazed Dounts, manually passed-through = ${totalCost2("Glazed Donut", 5)(0.1, "Scala Donut Store")}""")

  }
