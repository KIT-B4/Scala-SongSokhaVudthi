object main
{
    def main(args: Array[String])
    {
        println(calculate(5));
    }
    def calculate(num: Int): Int=
    {
        if(num==1)
        {
            return num;
        }
        else
        {
            return num*calculate(num-1);
        }
    }
}