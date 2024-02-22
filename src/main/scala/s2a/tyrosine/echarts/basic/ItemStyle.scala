package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait ItemStyle extends js.Object :
  val color: String = native

object ItemStyle :
 def apply(color: String = "#000"): ItemStyle =
    literal(color=color).asInstanceOf[ItemStyle]
