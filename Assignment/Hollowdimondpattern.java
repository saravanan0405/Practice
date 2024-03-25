public class Hollowdimondpattern{
        public static void main(String s[]){
                int val=1;
                for(int row=4;row>=1;row--){
                        for(int col=1;col<row;col++){
                                System.out.print(" ");
                        }
                        for(int col1=1;col1<=val;col1++){
				if(col1==1||col1==val){
                        System.out.print("*");
				}
				else
					System.out.print(" ");
                        }
                        val+=2;
                       System.out.println();
            

        }
        int val2=5;
                   for(int row=1;row<=3;row++){
                   for(int col=1;col<=row;col++){
                       System.out.print(" ");
                }
                for(int col2=1;col2<=val2;col2++){
                if(col2==1||col2==val2){
                System.out.print("*");
                }
                else
                System.out.print(" ");
                }
                val2-=2;
                System.out.println();
                }
}
}
