package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Config extends js.Object :
  val displaylogo: Boolean = native

object Config :
  def apply(displaylogo: Boolean): Config =
    literal(displaylogo = displaylogo).asInstanceOf[Config]
