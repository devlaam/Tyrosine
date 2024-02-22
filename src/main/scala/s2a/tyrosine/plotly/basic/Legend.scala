package s2a.tyrosine.plotly.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.Dynamic.literal


@native
trait Legend extends js.Object :
  val visible: Boolean = native
  val xanchor: String = native
  val yanchor: String = native

object Legend :
  def apply(
      visible: Boolean = true,
      xanchor: String  = "auto",
      yanchor: String  = "auto"
      ): Legend =
    literal(
      visible = visible,
      xanchor = xanchor,
      yanchor = yanchor
      ).asInstanceOf[Legend]
