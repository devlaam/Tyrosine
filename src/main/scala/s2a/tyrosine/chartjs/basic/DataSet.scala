package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait DataSet extends js.Object :
  val pointRadius: Int = native
  val pointBackgroundColor: String = native
  val data: Arraj[DataPoint] = native

object DataSet :
  def apply(pointRadius: Int, pointBackgroundColor: String, data: Arraj[DataPoint]): DataSet =
    literal(pointRadius=pointRadius,pointBackgroundColor=pointBackgroundColor, data=data).asInstanceOf[DataSet]

