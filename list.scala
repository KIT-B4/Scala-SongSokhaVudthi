object main
{
    def main(args: Array[String])
    {
        var student = List("Am Chunny", "Song Sokha Vudthi", "Tha Puthsopheak", "Heng Senghak", "Kim Miratorimoonlight");
        var(l,r)=student.splitAt(2); //to split the list into the left side and right side
        println("Element On The Left Side: "+l);
        println("Element On The Right Side: "+r);
        println("Original List: "+ student); //to print the list element
        println("Head Of List: "+ student.head); //to print the first element in the list
        println("Tail Of List: "+ student.tail); //to print all element except the first
        println("Except last: "+ student.init); //to print all element except the last
        println("Element at the end: "+student.last); //to print the last element of the list
        println("2nd Element to 4th Element: "+ student.slice(1,4)); //to print the element in between a specific range
        println("List In Reverse: "+ student.reverse); //to print all the element in reverse
        println("Is the list empty: "+ student.isEmpty); //to check if the list is empty or not
        student= student:+ "Heourng Hen"; //to add the element to the end of the list
        var h = "Tea Vengtieng";
        student=h::student; //to add the element to the front of the list
        println("New List: "+ student);
    }
}