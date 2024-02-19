package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Legend extends js.Object :
  val display: Boolean = native

object Legend :
  def apply(display: Boolean): Legend =
    literal(display=display).asInstanceOf[Legend]
