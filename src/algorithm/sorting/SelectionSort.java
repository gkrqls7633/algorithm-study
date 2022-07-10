package algorithm.sorting;

public class SelectionSort {

	
	//교환
	static void swap(int[] a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		
		//min a[i], ... , a[n-1] 에서 가장 작은 값을 가지는 요소의 인덱스
		//a[i]와 a[min]의 값을 교환
		for(int i=0; i < n-1; i++) {
			int min = i;  //아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록
			for(int j = i+1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			swap(a, i, min); //아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소 교환
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
