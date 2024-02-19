package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Options extends js.Object :
  val series: Arraj[Serie] = native
  val chart: Chart = native

object Options :
  def apply(series: Arraj[Serie],chart: Chart): Options =
    literal(series=series, chart=chart).asInstanceOf[Options]
