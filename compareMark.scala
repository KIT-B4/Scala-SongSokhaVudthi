object Main
{
  def main(args: Array[String]): Unit =
  {
    var alice = Array(12,23,34);
    var bob = Array(12,34,56);
    // println("Enter alice score:");
    // for(i <- 0 to 2)
    //   {
    //     alice(i)= scala.io.StdIn.readInt();
    //   }
    // println("Enter bob score:");
    // for(i <- 0 to 2)
    //   {
    //     bob(i)= scala.io.StdIn.readInt();
    //   }
    for(i <- 0 to 2)
      {
        if(bob(i)>alice(i) || bob(i)<alice(i))
        {
            print("1 ");
        }
      }
  }
}