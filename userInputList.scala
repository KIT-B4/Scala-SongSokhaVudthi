import scala.collection.mutable.MutableList  
var list = MutableList[Any]()
var input = "Start";
println("Enter the list elements, press enter twice to exit");
while (input!="") {
input = scala.io.StdIn.readLine()
list += input
}
list = list.filter(_!="")
println(list);