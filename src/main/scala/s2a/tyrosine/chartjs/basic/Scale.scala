package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Scale extends js.Object :
  val `type`: String = native
  val position: String = native

object Scale :
  def apply(`type`: String, position: String): Scale =
    literal(`type`=`type`,position=position).asInstanceOf[Scale]

