package test;

public class Sort {
	public static void main(String[] args) {
		int[] arr = {8,5,3,2,4};
//		bubbleSort(arr);//ð������
//		selectSort(arr);//ѡ������
//		quickSort(arr, 0, arr.length-1);//��������
//		insertSort(arr);//��������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	//ð������
	public static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	
	
	//ѡ������
	public static int[] selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = min;
		}
		return arr;
	}
	
	
	//��������
	public static int[] insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j >0; j--) {
				if (arr[j]<arr[j-1]) {
					int tmp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = tmp;
				}else {
					break;
				}
			}
		}
		return arr;
	}
	
	
	//��������
	public static void quickSort(int[] arr,int low,int high) {
		int i,j,tmp,t;
		if(low>high) {
			return;
		}
		i=low;
		j=high;
		
		tmp = arr[low];
		while(i<j) {
			while(tmp<=arr[j]&&i<j) {
				j--;
			}
			while(tmp>=arr[i]&&i<j) {
				i++;
			}
			if(i<j) {
				t=arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}
		}
		
		arr[low] = arr[i];
		arr[i] = tmp;
		quickSort(arr, low, j-1);
		quickSort(arr, j+1, high);
	}
	
	
	//ϣ������
	public static int[] shellSort(int[] arr) {
		for (int i = arr.length/2; i > 0; i--) {
			for (int j = i; j < arr.length; j++) {
				for (int k = j; k >0 && k-i >=0; k-=i) {
					if(arr[k]<arr[k-i]) {
						int tmp = arr[k-i];
						arr[k-i] = arr[k];
						arr[k] = tmp;
					}else {
						break;
					}
				}
			}
		}
		return arr;
	}
	
	
	
}
