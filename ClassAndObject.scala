class Student
{
    def Welcome(name: String, id: Int, grade: String)
    {
        println("Welcome back Mr/Miss "+name+"\nYour ID is "+id+"\nYour grade for this semester is "+grade);
    }
}
object demo
{
    def main(args: Array[String])
    {
        val s= new Student();
        s.Welcome("Vudthi", 168, "A");
    }
}        