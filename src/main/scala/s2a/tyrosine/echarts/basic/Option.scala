package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Option extends js.Object :
  val title: Optjon[Title]   = native
  val xAxis: Optjon[Axis]    = native
  val yAxis: Optjon[Axis]    = native
  val series: Arraj[Serie]   = native
  val legend: Optjon[Legend] = native

object Option :
  def apply(
      series: Arraj[Serie],
      xAxis: Optjon[Axis]    = nyet,
      yAxis: Optjon[Axis]    = nyet,
      title: Optjon[Title]   = nyet,
      legend: Optjon[Legend] = nyet
      ): Option =
    literal(
      series = series,
      xAxis  = xAxis,
      yAxis  = yAxis,
      title  = title,
      legend = legend
      ).asInstanceOf[Option]
