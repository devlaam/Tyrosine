package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}


@native
trait Layout extends js.Object :
  val xaxis: Axis            = native
  val yaxis: Axis            = native
  val height: Optjon[Double] = native
  val title: Optjon[String]  = native
  val width: Optjon[Double]  = native
  val showLegend: Boolean    = native
  val legend: Optjon[Legend] = native

object Layout :
  def apply(
      xaxis: Axis           = Axis(),
      yaxis: Axis           = Axis(),
      height: Optjon[Int]   = nyet,
      width: Optjon[Int]    = nyet,
      title: Optjon[String] = nyet
    ): Layout =
    literal(
      xaxis  = xaxis,
      yaxis  = yaxis,
      width  = width,
      height = height,
      title  = title,
      showLegend = false,
      legend = Legend(xanchor="auto", yanchor="bottom"),
      margin = literal(b=20,l=20,r=10,t=10)
    ).asInstanceOf[Layout]
