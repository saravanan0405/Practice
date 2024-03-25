class ReverseWord
{

  public static void reverseword(char [] message)
  {
    
    reverse(message,0,message.length-1);
    
      int start=0;
       for(int end=0;end<message.length;end++){  
          if(message[end]==' '){
            reverse(message,start,end-1);
            start=end+1;
            }
            else if(end==message.length-1){
               reverse(message,start,end);
               }
               }
               }
     
    public static void reverse(char [] message,int start,int end){
        char temp=0;
        while(start<end){
          temp=message[start];
          message[start]=message[end];
          message[end]=temp;
          start++;
          end--;
          }
          }        
   
  public static void main(String s[])
  {
    char message[]={'c','a','k','e',' ',
                     'p','o','u','n','d',' ',
                     's','t','e','e','l'};
                     
             System.out.println("before reverse string  = "+new String(message));         
               reverseword(message);
                  System.out.println("After reverse string = "+new String(message));
  }
 }
                     
