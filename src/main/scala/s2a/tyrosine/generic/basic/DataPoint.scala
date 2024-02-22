package s2a.tyrosine.generic.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal


/* This is the interface you may implement in your application. */
// TODO: Some libs could directly accept this format, if it is native, (removes need for asObject) improve!
trait DataPoint :
  def x: Double
  def y: Double
  def asArraj  = Arraj(x,y)
  def asObject = literal(x=x,y=y)
  override def toString: String = s"DP($x,$y)"

object DataPoint :
  def apply(_x: Double, _y: Double): DataPoint =
    new DataPoint {
      val x = _x
      val y = _y }

  def merge(x: Arraj[Double], y: Arraj[Double]): Arraj[DataPoint] = x.zip(y).map((x,y) => DataPoint(x,y))


class RealDataPoint(val x: Double, val y: Double) extends DataPoint
