class ArrayEx6 { 
	public static void main(String[] args) { 
		int[] score = { 79, 88, 91, 33, 100, 55, 95}; 

		int max = score[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�. 
		int min = score[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�. 

		for(int i=1; i < score.length;i++) {	// ó������ ������ Ž���ϸ鼭
			if(score[i] > max) { 				// ū ���� ������ �ִ����� �����ϰ�
				max = score[i]; 
			} else if(score[i] < min) { 		// ���� ���� ������ �ּڰ����� �����Ѵ�.
				min = score[i]; 
			} 
		} // end of for 

		System.out.println("�ִ밪 :" + max);       
		System.out.println("�ּҰ� :" + min);       
	} // end of main 
} // end of class 
