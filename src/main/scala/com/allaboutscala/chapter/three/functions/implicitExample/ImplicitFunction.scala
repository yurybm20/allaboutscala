package com.allaboutscala.chapter.three.functions.implicitExample

import DonutConversion._

object ImplicitFunction extends App{


  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  println(s"13. Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
  println(s"13. Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")

}
