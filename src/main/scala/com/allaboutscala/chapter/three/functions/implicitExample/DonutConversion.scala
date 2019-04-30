package com.allaboutscala.chapter.three.functions.implicitExample

object DonutConversion {

  implicit def stringToDonutString(s: String) = new DonutString(s)
}
