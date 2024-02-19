package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Stroke extends js.Object :
  val width: Arraj[Int] = native
  val curve: String = native

object Stroke :
  def apply(width: Arraj[Int], curve: String): Stroke =
    literal(width=width, curve=curve).asInstanceOf[Stroke]

