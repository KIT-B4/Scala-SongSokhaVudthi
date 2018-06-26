object main
{
  def main(args: Array[String])
  {
    println("Please Input Your Age:");
    var num = scala.io.StdIn.readInt();
    // var age=19;
    var i = 0;
    for(i <- 0 to num if (i%4!=0))
    {
      println(i);
    }
  }
}
