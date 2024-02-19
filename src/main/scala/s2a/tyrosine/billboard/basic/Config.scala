package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Config extends js.Object :
  val bindto: String = native
  val data: Data = native

object Config :
  def apply(bindto: String, data: Data): Config =
    literal(bindto=bindto, data=data).asInstanceOf[Config]

