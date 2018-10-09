package java_programs;

public class Duplicates_elements_Arrays {

	public static void main(String[] args) {
		int arr1[]= {10,15,18,9,2,6,2,9,15};
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
		


	}

}
