object string
{
    def main(args: Array[String])
    {
        println("Please Input a String")
        var input=scala.io.StdIn.readLine();
        var vowel:Int=0;
        var i=0;
        var consonant:String="";
        for(i <- 0 to input.length-1)
        {
            if(input(i)=='A'||input(i)=='E'||input(i)=='I'||input(i)=='O'||input(i)=='U'||input(i)=='a'||input(i)=='e'||input(i)=='i'||input(i)=='o'||input(i)=='u')
            {
                vowel=vowel+1;
            }
            else if((input(i)>='a'&&input(i)<='z')||(input(i)>='A'&&input(i)<='Z'))
            {
                consonant=consonant+input(i);
            }
        }
        println("The consonants are "+consonant);
        println("There are "+vowel+" vowels");
    }
}