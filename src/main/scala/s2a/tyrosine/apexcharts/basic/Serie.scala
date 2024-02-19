package s2a.tyrosine.apexcharts.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Serie extends js.Object :
  val name: String = native
  val data: Arraj[Int|Double|Null] = native

object Serie :
  def apply(name: String, data: Arraj[Int|Double|Null]): Serie =
    literal(name=name, data=data).asInstanceOf[Serie]
