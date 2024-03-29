package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.{Array as Arraj}

import s2a.tyrosine.generic.basic.{DataPoint => GDataPoint}

@native
trait DataPoint extends js.Object :
  val x: Double = native
  val y: Double = native

object DataPoint :
  def apply(x: Double, y: Double): DataPoint =
    literal(x=x, y=y).asInstanceOf[DataPoint]

  def apply(dp: GDataPoint): DataPoint =
    literal(x=dp.x, y=dp.y).asInstanceOf[DataPoint]

  def merge(x: Arraj[Double], y: Arraj[Double]): Arraj[DataPoint] = x.zip(y).map((x,y) => DataPoint(x,y))
