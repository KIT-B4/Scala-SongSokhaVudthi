object Main
{
    def main(args: Array[String])
    {
        var myList = Array(32,26,88);
        var temp=0;
        for(x <- 0 to myList.length-1)
        {
            for(y <- (x+1) to myList.length-1)
            {
                if(myList(x)<myList(y))
                {
                    temp=myList(y);
                    myList(y)=myList(x);
                    myList(x)=temp;
                }
            }
        }
        for(x <- 0 to myList.length-1)
        {
            print(myList(x)+">");
        }
    }
}