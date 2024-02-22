package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Tick extends js.Object :
  val fit: Boolean  = native
  val show: Boolean = native

object Tick :
  def apply(show: Boolean, fit: Boolean = true): Tick =
    literal(show=show, fit=fit).asInstanceOf[Tick]

  val default = apply(show=true, fit=false)
