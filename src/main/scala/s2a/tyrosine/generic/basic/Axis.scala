package s2a.tyrosine.generic.basic

class Axis(
  val kind: Axis.Kind,
  val position: Axis.Position,
  val title: String,
  val show: Boolean = true)

object Axis :
  enum Kind { case Linear, Log }
  enum Position { case Bottom, Top, Left, Right }
