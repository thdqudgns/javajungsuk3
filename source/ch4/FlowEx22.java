class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		for(int tmp : arr) {	// arr에 저장되어 있는 값 하나씩 tmp에 받아온다.
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();		
		System.out.println("sum="+sum);
	} // main의 끝
}
