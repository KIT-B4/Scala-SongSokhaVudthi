object fibonacci
{
    def main(args: Array[String])
    {
        calculate(10);
    }
    def calculate(amount: Int):Int=
    {
        var a=0;
        var b=1;
        var c = new Array[Int](100);
        var i=0;
        var j=0;
        while( i < amount )
        {
            c(i)=a+b;
            a=b;
            b=c(i);
            i=i+1;
        }
        while( j < amount )
        {
            print(c(j));
            j=j+1;
        }
    }
}