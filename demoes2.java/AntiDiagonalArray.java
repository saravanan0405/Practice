class AntiDiagonalArray
{
  public static void main(String s[])
  {
  int matrix [][]={{1,2,3},
              {4,5,6},
              {7,8,9}};
              
       
       diagonalArray(matrix);
       
    if(matrix.length!=matrix[0].length){
    System.out.println("Row col are not equals");
    return;
    }
 }   
       
    public static void diagonalArray(int [][] matrix)
   {
     
     int n=matrix.length;
        for(int i=0;i<n;i++){
        
            int j=0;
            int k=i;
    
         while(k>=0){
          System.out.print(matrix[j][k]+" ");
          j++;
          k--;
          }
          System.out.println();
          }
          
           
          
         for(int i=1;i<n;i++){
       
          int j=i;
           int k=n-1;
   
       while(j<n){
       System.out.print(matrix[j][k]+" ");
       j++;
       k--;
       }
       System.out.println();
       }
       
       System.out.println();
    }

}
       
          
