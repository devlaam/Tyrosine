package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal


@native
trait Data extends js.Object :
  val `type`: String = native
  val columns: Arraj[Arraj[Any]] = native

object Data :
  def apply(`type`: String, columns: Arraj[Arraj[Any]]): Data =
    literal(`type`=`type`, columns=columns).asInstanceOf[Data]

