package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait DataPoint extends js.Object :
  val x: Double = native
  val y: Double = native

object DataPoint :
  def apply(x: Double, y: Double): DataPoint =
    literal(x=x, y=y).asInstanceOf[DataPoint]

