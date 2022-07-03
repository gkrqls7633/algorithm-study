package algorithm.sorting;

import java.util.Scanner;

public class BubbleSort {

	//교환
	static void swap(int[] a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	
	//버블sort
	static void bubbleSort(int[] a, int n) {
	
		for(int i=0; i < n-1; i++) {        
			for(int j = n-1; j > i; j--) {  //j-1, j 인덱스에 대해서 비교
				if(a[j-1] > a[j])
					swap(a, j-1, j);
			}
		}
		
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블정렬");
		System.out.print("요솟수 : " );
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i < nx; i ++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
			
		}
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순 정렬했습니다.");
		for(int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}

}
