package s2a.tyrosine.echarts.basic


import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Legend extends js.Object :
  val show: Boolean = native

object Legend :
  def apply(show: Boolean = true): Legend =
    literal(bottom="5%", show=show).asInstanceOf[Legend]
