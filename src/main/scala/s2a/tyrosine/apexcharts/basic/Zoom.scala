package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Zoom extends js.Object :
  val enabled: Boolean = native

object Zoom :
  def apply(enabled: Boolean): Zoom =
    literal(enabled=enabled).asInstanceOf[Zoom]
