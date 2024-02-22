package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}


@native
trait Options extends js.Object :
  val title: Title = native
  val series: Arraj[Serie] = native
  val chart: Chart         = native
  val xaxis: Optjon[Xaxis] = native
  val yaxis: Optjon[Yaxis] = native

object Options :
  def apply(
      title: Title,
      series: Arraj[Serie],
      chart: Chart,
      xaxis: Optjon[Xaxis] = nyet,
      yaxis: Optjon[Yaxis] = nyet
      ): Options =
    literal(
      title  = title,
      series = series,
      chart  = chart,
      xaxis  = xaxis,
      yaxis  = yaxis
      ).asInstanceOf[Options]
