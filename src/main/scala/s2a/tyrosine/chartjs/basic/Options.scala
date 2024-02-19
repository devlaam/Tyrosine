package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Options extends js.Object :
  val legend: Legend = native
  val scales: Scales = native

object Options :
  def apply(legend: Legend, scales: Scales): Options =
    literal(legend=legend,scales=scales).asInstanceOf[Options]
