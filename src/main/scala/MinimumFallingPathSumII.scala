class MinimumFallingPathSumII {
  def minFallingPathSum(grid: Array[Array[Int]]): Int = {
    val n = grid.size
    def findPathSum(row: Int, col: Int, grid: Array[Array[Int]], dp: Array[Array[Int]]): Int = {
      if(row==n-1)
        return grid(n-1)(col)
      if(dp(row)(col) != -1)
        return dp(row)(col)
      dp(row)(col) = (for{
        j <- 0 to n-1
        if(j!=col)
      } yield grid(row)(col) + findPathSum(row+1,j,grid,dp)).min
      dp(row)(col)
    }
    val dp = Array.fill[Int](n,n)(-1)
    val mini = (for{
      j <- 0 to n-1
    } yield findPathSum(0,j,grid,dp)).min
    mini
  }
}
