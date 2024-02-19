package s2a.tyrosine.echarts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal

import s2a.tyrosine.{Optjon, nyet}

@native
trait Axis extends js.Object :
  val `type`: String = native
  val data: Optjon[Arraj[String]] = native

object Axis :
  def apply(`type`: String, data: Optjon[Arraj[String]] = nyet): Axis =
    literal(`type`=`type`, data=data).asInstanceOf[Axis]
