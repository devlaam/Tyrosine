package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Chart extends js.Object :
  val `type`: String         = native
  val zoom: Zoom             = native
  val animations: Animations = native

object Chart :
  def apply(
      `type`: String,
      zoom: Zoom,
      animations: Animations
      ): Chart =
    literal(
      zoom=zoom,
      animations=animations
      ).asInstanceOf[Chart]
