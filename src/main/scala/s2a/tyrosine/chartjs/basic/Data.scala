package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Data extends js.Object :
  val datasets: Arraj[DataSet] = native

object Data :
  def apply(datasets: Arraj[DataSet]): Data =
    literal(datasets=datasets).asInstanceOf[Data]
