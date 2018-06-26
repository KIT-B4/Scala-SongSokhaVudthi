object main
{
    def main(args: Array[String])
    {
        println("Please Input a Number:");
        var num:Int=scala.io.StdIn.readInt();
        // var num=10;
        while(num!=0)
        {
            println(num);
            num=num-1;
        }
        println("Happy Birthday");
    }
}