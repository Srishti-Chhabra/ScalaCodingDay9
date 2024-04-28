class RoundTheNumberToNearestMultipleOfTen {
  def round(n: Int): Int = {
    val left = n-(n%10)
    val right = n+(10 - n%10)
    if(n - left <=  right - n)
      left
    else
      right
  }
}

object RoundTheNumberToNearestMultipleOfTen extends App{
  val roundTheNumberToNearestMultipleOfTen = new RoundTheNumberToNearestMultipleOfTen
  println(roundTheNumberToNearestMultipleOfTen.round(29))
}
