
public class MergeSort {

	public static void main(String[] args) {
		// especial para arrays
		int arr[]= {13,139,2642,186,785,-1000000,-634,7,318};
		print(arr);
		sort(arr, 0, arr.length-1);
		print(arr);
	}
	
	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	static void merge (int arr[], int left, int mid, int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		int L[]= new int[n1];
		print(L);
		int R[]=new int[n2];
		print(R);
		for (int i = 0; i < n1; i++) {
			L[i]=arr[left+i];
		}
		for (int i = 0; i < n2; i++) {
			R[i]=arr[mid+1+i];
		}
		int i=0,j=0;
		int k=left;
		while (i<n1&& j<n2) {
			if (L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while (i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while (j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
		
		
	}
	
	static void sort(int arr[],int left,int right) {
		if (left<right) {
			int mid=(left+right)/2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr, left,mid,right);
		}
	}

}
