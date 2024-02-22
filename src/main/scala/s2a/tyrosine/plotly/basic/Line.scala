package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Line extends js.Object :
  val color: String = native
  val width: Int    = native

object Line :
  def apply(color: String, width: Int = 2): Line =
    literal(color=color,  width=width).asInstanceOf[Line]

