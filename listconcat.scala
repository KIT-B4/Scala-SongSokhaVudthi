object main
{
    def main(args: Array[String])
    {
        var list1 = List(12,64,72,33,51,85)
        var list2 = List(91,83,75,12,74,87)
        var list3 = (list1++list2).reverse //concat two list and reverse
        println("The reverse list is: "+list3)
        var i = 0;
        println("The odd elements are:")
        for(i <- 0 to list3.size-1)
        {
            if(list3(i)%2==1)
            {
                println(list3(i));
            }
        }
        println("All elements of list3 except the last one:") //print elements except the last one
        for(i <- 0 to list3.size-2)
        {
            println(list3(i));
        }
        // println(list3.init); alternative

        println("Converting elements of list 1 to string")
        list3.mkString("/")  //convert elements to string
        println(list3);
        
        println("List inside list:")
        var list4 = List(list1,list2,list3); //store list inside a list
        println(list4);
    }
}