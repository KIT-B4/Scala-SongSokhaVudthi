object main
{
    def main(args: Array[String])
    {
        var array = new Array[Int](5);
        var newArray = new Array[Int](5);
        var sum=0;
        var max=0;
        var min=0;
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
        max=array(0);
        for(i <- 1 to 4)
        {
          if(max<array(i))
          {
            max=array(i);
          }
        }
        min=array(0);
        for(i <- 1 to 4)
        {
          if(min>array(i))
          {
            min=array(i);
          }
        }
        println("The biggest number is: "+max);
        println("The smallest number is: "+min);
        println("Please input all the element in the second array:");
        for(i <- 0 to 4)
        {
            newArray(i)=scala.io.StdIn.readInt();
        }
        var concat = array ++ newArray; //concatenating two array
        println("The elements of the final array is: ");
        concat.foreach(x => println(x));
    }
}
