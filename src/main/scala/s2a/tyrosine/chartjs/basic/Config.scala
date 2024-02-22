package s2a.tyrosine.chartjs.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Config extends js.Object :
  val `type`: String   = native
  val data: Data       = native
  val options: Options = native

object Config :
  def apply(
      `type`: String,
       data: Data,
       options: Options
       ): Config =
    literal(
       `type`   = `type`,
       data     = data,
       options  = options
       ).asInstanceOf[Config]

