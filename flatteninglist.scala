object main
{
    def main(args: Array[String])
    {
        var line = List(1,2,3,4,5,6,7,8,9,10);
        var page = List(76,23,89,34,56,112,98);
        var book = List("Harry Potter", "Hunger Game", "Paper Town");
        var category = List("Horror", "Romance", "Adventure");
        var library = List("KIT", "AIS");
        var list = List(library,category,book,page,line);
        println(list);
        println(list(0));
        println(list(0)(0));
    }
}