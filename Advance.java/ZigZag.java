class ZigZag
{

    public static void zigzag(String str,int numrow){
      if(numrow<=0){
        return;
        }
      if(numrow==1 || str.length()<numrow){
         return;
         }
         
         char zigzag[][]=new char[numrow][str.length()];
          boolean goingdown=true;
          int row=0;
             for(int i=0;i<str.length();i++){
                zigzag[row][i]=str.charAt(i);
                if(goingdown){
                 row++;
                  if(row == numrow-1){
                  goingdown=false;
                  }
                  }
                  else{
                  row--;
                  if(row==0){
                  goingdown=true;
                  }
              }   
           }
           for(int i=0;i<numrow;i++){
              for(int j=0;j<str.length();j++){
              System.out.print(zigzag[i][j] ==0 ? " ": zigzag[i][j]);
              }
              System.out.println();
              }
    }
                
                 
 
  public static void main(String s[])
  {
  String input="hello world";
  input =input.replace(" ","");
  int numrow=4;
  zigzag(input,numrow);
  }
}
