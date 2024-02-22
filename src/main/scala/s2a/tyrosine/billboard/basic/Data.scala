package s2a.tyrosine.billboard.basic

import scala.scalajs.js
import scala.scalajs.js.native
import scala.scalajs.js.{Array as Arraj}
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.JSConverters._

import s2a.tyrosine.{Optjon, nyet}
import s2a.tyrosine.generic
import s2a.tyrosine.generic.basic.{DataSerie => GDataSerie}

@native
trait Data extends js.Object :
  val `type`: String = native
  val columns: Arraj[Arraj[Any]] = native
  val xs: Optjon[js.Object]      = native
  val names: Optjon[js.Object]   = native
  val colors: Optjon[js.Object]  = native

object Data :
  def apply(
      `type`: String,
      columns: Arraj[Arraj[Any]],
      xs: Optjon[js.Object]     = nyet,
      names: Optjon[js.Object]  = nyet,
      colors: Optjon[js.Object] = nyet
      ): Data =
    literal(
      `type`  = `type`,
      xs      = xs,
      columns = columns,
      names   = names,
      colors  = colors
      ).asInstanceOf[Data]


  private def pairs(n: Int) = (1 to n).map(i => s"x$i")

  private def labels(values: Seq[String]): js.Object =
    val map = values.zipWithIndex.map((v,i) => (s"y${i+1}",(v:js.Any)))
    literal(map *)

  def apply(series: Seq[GDataSerie]): Data =
    val xs     = labels(pairs(series.size))
    val names  = labels(series.map(_.name))
    val colors = labels(series.map(_.color))
    val colsX  = series.zipWithIndex.map((serie,i) => Arraj[Any](s"x${i+1}") ++ serie.xs).toJSArray
    val colsY  = series.zipWithIndex.map((serie,i) => Arraj[Any](s"y${i+1}") ++ serie.ys).toJSArray
    val colums = colsX ++ colsY
    apply(`type`="line",xs=xs,names=names,colors=colors,columns=colums)
