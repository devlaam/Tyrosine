package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal


@native
trait Option extends js.Object :
  val xAxis: Axis = native
  val yAxis: Axis = native
  val series: Arraj[Serie] = native

object Option :
  def apply(xAxis: Axis, yAxis: Axis, series: Arraj[Serie]): Option =
    literal(xAxis=xAxis, yAxis=yAxis, series=series).asInstanceOf[Option]
