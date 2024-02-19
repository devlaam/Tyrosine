package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Scales extends js.Object :
  val x: Scale = native

object Scales :
  def apply(x: Scale): Scales =
    literal(x=x).asInstanceOf[Scales]

