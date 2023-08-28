package duplicateInteger;

import java.util.Scanner;

public class DuplicateInteger3 {
	public static void main(String[] args) {
		//중복되는 정수를 배열로 출력하기
	Scanner scan = new Scanner(System.in);
	String inner = scan.nextLine();
	String[] input = inner.split(",");      //배열선언

//    int w =input.length-1;
//    System.out.println(input[0]+","+input[w]);
//    if( input[0].equals(input[w]) ) {
//		System.out.println(input[0] +"," + input[w]);
//    }
    for( int i = 0; i <= input.length-1; i++) {
    	for( int n = i+1; n <= input.length-1; n++) {
    		if( input[i].equals(input[n]) ) {
    			if(input[i] == input[n]) {
    				break;
    			}
    			System.out.println(input[i] +"," + input[n]);
    	}
    	}
    }
    
    scan.close();
	}
}
