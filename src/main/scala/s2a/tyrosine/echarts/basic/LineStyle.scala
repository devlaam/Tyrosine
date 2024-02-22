package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait LineStyle extends js.Object :
  val `type`: String = native
  val color: String  = native
  val width: Int     = native

object LineStyle :
 def apply(
      `type`: String  = "solid",
      color: String   = "#000",
      width: Int      = 2
      ): LineStyle =
    literal(
      `type` = `type`,
      color  = color,
      width  = width
      ).asInstanceOf[LineStyle]
