package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Title extends js.Object :
  val text: String = native

object Title :
  def apply(text: String): Title =
    literal(text=text).asInstanceOf[Title]
