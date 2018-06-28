object main
{
    def main(args: Array[String])
    {
        var name = List("Alex", "Henry", "Benjie", "Bob", "Austin", "Anthony");
        var i = 0;
        for(i <- 0 to name.size-1)
        {
            if(name(i).startsWith("A"))
            {
                println(name(i));
            }
        }
        name.foreach(x => if(x.length==4) print("Yes ") else print("No ")); 
        name.foreach(x => if(x.length>3) print("Yes ") else print("No "));
    }
}