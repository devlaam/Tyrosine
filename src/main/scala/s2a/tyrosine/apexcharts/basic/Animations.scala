package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Animations extends js.Object :
  val enabled: Boolean = native

object Animations :
  def apply(enabled: Boolean): Animations =
    literal(enabled=enabled).asInstanceOf[Animations]
