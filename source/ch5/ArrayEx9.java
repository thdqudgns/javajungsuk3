import java.util.*;  // Arrays.toString()을 사용하기 위해 추가

class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };  // 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];

		for (int i=0; i < arr.length ; i++ ) {
			int tmp = (int)(Math.random() * code.length);	// 0~4까지의 랜덤한 수를 tmp에 저장
			arr[i] = code[tmp];		//code배열 안에 있는 값들을 무작위로 arr의 i번째 index에 저장
		}

		System.out.println(Arrays.toString(arr));	// arr은 -4, -1, 3, 6, 11 으로만 구성되어 있다.
	} // main의 끝
}
