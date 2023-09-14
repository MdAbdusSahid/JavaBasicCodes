class SumOfRecursion	 
	{
 		static int Sum(int num) 
		{ 
        		if(num == 0)
			{
				return 0;
        		}
 
 	      		return num % 10 + Sum(num/10);
    		}
 
    	public static void main(String[] args) 
	{
        	int result = Sum(1234);
          	System.out.println(result);
    	}
 
}
 