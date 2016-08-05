object Main{
  def main(args:Array[String]) : Unit = {
    println("CALCULATOR v0.1")
    val tokens : Array[Char] = Array('(',')','+','-','*','/')
    //input = scala.io.StdIn.readLine()

    var input = "(33 + 3 + 3) -        2"

    //Scanning for tokens
    var tempIndex = for(i <- 0 until input.length if( tokens.contains(input(i)) ))  yield i
    tempIndex = tempIndex.reverse
    var head = ""
    var tail = ""
    for(i <- 0 until tempIndex.length){
      head = input.take(tempIndex(i)+1)
      tail = input.drop(tempIndex(i)+1)
      input = head +' '+tail
      head = input.take(tempIndex(i))
      tail = input.drop(tempIndex(i))
      input = head +' '+tail
      println(input)
    }
    var temp = input.split(' ')
    println(temp.mkString(" | "))
    //Remove
    for(i <- temp){
      if(temp.equals(' ')) println("Found space")
    }
  }
}
