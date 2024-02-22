package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.generic.basic.{DataPoint => GDataPoint}

@native
trait DataPoint extends js.Object :
  val x: Double = native
  val y: Double = native

object DataPoint :
  /* Needed because NaN make the whole sequence disappear. */
  def nullify(x: Double): js.Any = if x.isNaN then null else x

  def apply(x: Double, y: Double): DataPoint =
    literal(x=nullify(x), y=nullify(y)).asInstanceOf[DataPoint]

  def apply(dp: GDataPoint): DataPoint = apply(dp.x,dp.y)

  def merge(x: Arraj[Double], y: Arraj[Double]): Arraj[DataPoint] = x.zip(y).map((x,y) => DataPoint(x,y))
