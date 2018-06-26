object main
{
    def guess(n:Int):Unit=
    {
        var x=0;
        println("Can you guess the square of "+ n+"?")
        x=scala.io.StdIn.readInt();
        while(!((n*n)-x==1 || (n*n)-x==0 || (n*n)-x==(-1)))
        {
            println("You are off by: "+((n*n)-x))
            println("Please try again: ")
            x=scala.io.StdIn.readInt();
        }
        println("Congratulations!!!")
    }
    def main(args: Array[String])
    {
        var n=9;
        println("Please input your guess:");
        guess(n);
    }
}