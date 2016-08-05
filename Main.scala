object Main{
  def main(args:Array[String]) : Unit = {
    println("CALCULATOR v0.1")
    val tokens : Array[Char] = Array('(',')','+','-','*','/')
    //input = scala.io.StdIn.readLine()

    var input = "(33 + 3 + 3) -        2"

    //Start to proccess input file
    var temp = input.toCharArray.toBuffer

    //Remove the white space
    var tempIndex = for(i <- 0 until temp.length if(temp(i).isSpaceChar))  yield i
    for(i <- tempIndex.reverse) temp.remove(i)

    //Scanning for tokens
    input = temp.mkString
    tempIndex = for(i <- 0 until input.length if( tokens.contains(input(i)) ))  yield i
    
  }
}
