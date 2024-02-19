package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Chart extends js.Object :
  val height: Int = native
  val `type`: String  = native
  val zoom: Zoom = native
  val animations: Animations = native
  val stroke: Stroke = native
  val labels: Arraj[Int] = native
  val title: Title = native

object Chart :
  def apply(height: Int, `type`: String, zoom: Zoom, animations: Animations, stroke: Stroke, labels: Arraj[Int], title: Title): Chart =
    literal(height=height, zoom=zoom, animations=animations, stroke=stroke, labels=labels, title=title).asInstanceOf[Chart]
