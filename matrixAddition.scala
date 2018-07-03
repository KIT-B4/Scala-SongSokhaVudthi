object main
{
    def main(args: Array[String])
    {
        var m1 = Array.ofDim[Int](2,2);
        var m2 = Array.ofDim[Int](2,2);
        var sum = Array.ofDim[Int](2,2);
        var i=0;
        var j=0;
        println("Enter the element for the first matrix: ");
        for(i <- 0 to 1)
        {
            for(j <- 0 to 1)
            {
                m1(i)(j)=scala.io.StdIn.readInt();
            }
        }
        println("Enter the element for the second matrix: ");
        for(i <- 0 to 1)
        {
            for(j <- 0 to 1)
            {
                m2(i)(j)=scala.io.StdIn.readInt();
            }
        }
        for(i <- 0 to 1)
        {
            for(j <- 0 to 1)
            {
                sum(i)(j)=m1(i)(j)+m2(i)(j);  
            }
        }
        println("The addition result is: ");
        for(i <- 0 to 1)
        {
            for(j <- 0 to 1)
            {
                print(sum(i)(j)+" ");
            }
            print("\n");
        }
    }
}