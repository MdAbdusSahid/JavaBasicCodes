class String_delete_char
{
    public static void main(String args[])
    {
        String input = "developer";     //input string
String firstFourChars = "";     //substring containing first 4 characters
 
if (input.length() > input.length()-1) 
{
    firstFourChars = input.substring(1, 8);
} 
else
{
    firstFourChars = input;
}
 
System.out.println(firstFourChars);
    }
}
