class WordSearch
{
    public static boolean searchword(char[][] word, String word1)
    {
                    
        int row=word.length;
        int col=word[0].length;
          for(int i=0;i<row;i++)
        {
            String str = new String(word[i]);
            if(str.contains(word1)){
             return true;
        }
        
     }
        for(int j=0;j<col;j++)
        {
           String value="";
           
           for(int i=0;i<row;i++)
           {
           value=value+word[i][j];
           if(value.contains(word1)){
           return true;
           }
           }
           }
           return false;
       
  }
      

  public static void main(String s[])
  {
 char [][] word={{'F','A','C','I'},
              {'O','B','Q','P'},
              {'A','N','O','B'},
              {'M','A','S','S'}}; 
            
  
  String word1="FOAM";
  String word2="MASS";
  System.out.println(searchword(word,word1));

   }
}


