package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Scales extends js.Object :
  val x: Optjon[Scale] = native
  val y: Optjon[Scale] = native

object Scales :
  def apply(x: Optjon[Scale] = nyet, y: Optjon[Scale] = nyet): Scales =
    literal(x=x, y=y).asInstanceOf[Scales]

