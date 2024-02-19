package s2a.tyrosine

import scala.scalajs.js

/** To make explicit that you want to discard a result. */
extension(a: Any)
  inline def toUnit: Unit = ()

/** Preliminary definition of the JS Option. */
type Optjon[A] = js.UndefOr[A]

/** Preliminary definition of not-yet defined value. */
inline def nyet = js.undefined


