import java.util.*;  // Arrays.toString()�� ����ϱ� ���� �߰�

class ArrayEx9 {
	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6, 11 };  // �ҿ������� ����� ������ �迭
		int[] arr = new int[10];

		for (int i=0; i < arr.length ; i++ ) {
			int tmp = (int)(Math.random() * code.length);	// 0~4������ ������ ���� tmp�� ����
			arr[i] = code[tmp];		//code�迭 �ȿ� �ִ� ������ �������� arr�� i��° index�� ����
		}

		System.out.println(Arrays.toString(arr));	// arr�� -4, -1, 3, 6, 11 ���θ� �����Ǿ� �ִ�.
	} // main�� ��
}
