class LetterCombination
{

  public static String [] lettercombination(String digits){
            if(digits == null || digits.length()==0){
            return new String[0];
            }
            String [] mapping ={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };
            
            String result[]={""};
            
            for(int i=0;i<digits.length();i++){
               int digit=digits.charAt(i)-'0';
               String [] temp=new String[result.length * mapping[digit].length()];
               int index=0;
               for(String combination : result){
                  String letters =mapping[digit];

                  for(int j=0;j<letters.length();j++){
                  temp[index++] =combination + letters.charAt(j);
                  
                  }
                }
                  result =temp;
              }
                  return result;
           }
      

  public static void main(String s[]){
      String digits="23";
      String [] combination = lettercombination(digits);
      for(String combinations : combination){
            System.out.println(combinations +" ");
          }
       }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
