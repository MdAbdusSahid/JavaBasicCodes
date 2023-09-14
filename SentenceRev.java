class SentenceRev
{
    public static void main(String args[])
    {
        String s = " My Name Is Sahid";
        String[] split = s.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) 
        {
            result += (split[i] + " ");
        }
        System.out.println(result.trim());
    }
}