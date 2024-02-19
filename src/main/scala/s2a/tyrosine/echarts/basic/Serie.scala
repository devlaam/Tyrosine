package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal


@native
trait Serie extends js.Object :
  val `type`: String = native
  val data: Arraj[Double] = native

object Serie :
  def apply(`type`: String, data: Arraj[Double]): Serie =
    literal(`type`=`type`, data=data).asInstanceOf[Serie]
