import java.util.Scanner;
class   NNumOfPrimeNumber
{
      public static void main(String s[])
	  {
          Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the range");
          int n=sc.nextInt();
          int i=2,no=3,count=1;
          boolean prime=true;
		  System.out.println("The prime numbers are");
          while(count<n)
         {
             while(i<no)
             {
               if(no%i==0){
               System.out.println("not a prime number");
               prime=false;
                }
               i++;
             }
             if(prime==true){
             System.out.println(no);
             no=no+2;
             }
             count++;
        }
     }
}
	