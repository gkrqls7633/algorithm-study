package baekjoon.bronze;

import java.util.Scanner;

/*
 * 명령 프롬프트 (1032번)
 */

public class cmdSearch {

	public static void answer() {
		System.out.print("파일 이름의 개수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] array = new String[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.next();
		}
		
		StringBuilder sb = new StringBuilder();
		
		boolean isSame = true;
		for(int i=0; i<array[0].length(); i++) {
			char c = array[0].charAt(i);
			
			isSame = true;
			for(int j=1; j<n; j++) {
				if(c != array[j].charAt(i) ) {
					isSame = false;
					break;
				}
			}
			
			if(isSame == true) {
				sb.append(c);
			}else
				sb.append('?');
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	public static void main(String[] args) {
		
		answer();
		
	}

}
