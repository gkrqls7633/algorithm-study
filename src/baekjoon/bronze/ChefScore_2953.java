package baekjoon.bronze;

import java.util.Scanner;

public class ChefScore_2953 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scoreList = new int[5];
		int index = 0;
		int max = 0;
		
		for(int i=0; i<5; i++) {
			
			int sum = 0;
			
			for(int j=0; j<4; j++) {
				int score = sc.nextInt();
				sum += score;
				
				if(max < sum) {
					max = sum;
					index = i + 1;
				}
			}
			scoreList[i] = sum;

			System.out.println(i+1+"번 참가자 점수" + scoreList[i]);
		}
		
		System.out.println("우승자 : " + max + "점수로 " + index + "번 참가자입니다.");
		
	}

}
