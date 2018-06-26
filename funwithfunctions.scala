object main
{
    def square(n:Int):Int= n*n
    def sumSquare(m:Int,n:Int):Int= square(m)+square(n)
    def main(args: Array[String])
    {
        println(square(3));
        println(sumSquare(2,3));
    }
}