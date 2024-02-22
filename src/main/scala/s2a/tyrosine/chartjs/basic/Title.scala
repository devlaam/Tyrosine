package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Title extends js.Object :
  val display: Boolean = native
  val text: String     = native

object Title :
  def apply(text: String, display: Boolean = true): Title =
    literal(display=display, text=text).asInstanceOf[Title]
