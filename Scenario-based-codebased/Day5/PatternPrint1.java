class PatternPrint1{
 public static void main(String[] args){
    char letter ='A';
	
	for(int row=1;row<=7;row++){
	
	for(int space=7;space>row;space--){
	System.out.print(" ");
	}
	
	for(int col =1;col<=row;col++){
	   System.out.print(letter+ " ");
	    letter++;
	}
	    System.out.println();
	}
	}
}