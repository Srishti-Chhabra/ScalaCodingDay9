class ElementsInTheRange {
  def check(nums: List[Int], a: Int, b: Int): Boolean = {
    val n = nums.size
    def loop(ind: Int): Int = {
      if(ind==n)
        return 0
      if(nums(ind)<a || nums(ind)>b)
        return loop(ind+1)
      1+loop(ind+1)
    }
    if(loop(0)==(b-a+1))
      return true
    false
  }
}

object ElementsInTheRange extends App{
  val elementsInTheRange = new ElementsInTheRange
  println(elementsInTheRange.check(List(1, 2, 4, 5, 2, 7, 8, 3).distinct,2,5))
}
