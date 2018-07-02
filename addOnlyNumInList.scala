object main
{
    def main(args: Array[String])
    {
        val x = ("Hello", " Is it me you're looking for", 2, 7, 342.8f, " I can see it in your eyes", 124, " I can see it in your smile");
        var sum:Float=0;
        var str:String="";
        x.productIterator.foreach {
            case i:Int => sum=sum+i;
            case f:Float => sum=sum+f;
            case s:String => str=str+s;
        } ;
        println("The sum of all number is "+ sum);
        println("The concatenation of all string is: \n"+str)
    }
}