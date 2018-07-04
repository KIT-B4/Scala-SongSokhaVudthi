object main
{
    def main(args: Array[String])
    {
        var array = new Array[Int](5);
        var sum=0;
        println("Please input all the element in the array:");
        for(i <- 0 to 4)
        {
            array(i)=scala.io.StdIn.readInt();
        }
        for(i <- 0 to 4)
        {
            sum = sum + array(i);
        }
        println("The sum of all the elements is: "+ sum);
    }
}