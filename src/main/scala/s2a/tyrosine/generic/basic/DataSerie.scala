package s2a.tyrosine.generic.basic

import scala.scalajs.js
import scala.scalajs.js.{Array as Arraj}


class DataSerie(
    val name: String,
    val points: Arraj[DataPoint],
    val color: String) :
  def xs: Arraj[Double] = points.map(_.x)
  def ys: Arraj[Double] = points.map(_.y)
  def da: Arraj[Arraj[Double]] = points.map(_.asArraj)
  override def toString: String =
    val arr = points.foldLeft(StringBuilder("DataSerie(["))((sb,pt) => sb.append(s"(${pt.x},${pt.y})"))
    arr.append("],").append(color).append(")").toString
