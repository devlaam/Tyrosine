package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Options extends js.Object :
  val legend: Legend           = native
  val scales: Scales           = native
  val plugins: Optjon[Plugins] = native

object Options :
  def apply(
      legend: Legend,
      scales: Scales,
      plugins: Optjon[Plugins] = nyet
      ): Options =
    literal(
      legend  = legend,
      scales  = scales,
      plugins = plugins
      ).asInstanceOf[Options]
