class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
			System.out.print(numArr[i] = (int)(Math.random() * 10)); // numArr�� 0~9 index�� 0~9������ random�� ���� �ִ´�.
		}
		System.out.println();

		for (int i=0; i < numArr.length-1 ; i++ ) {	// 9���� �ݺ��Ѵ�.
			boolean changed = false;	// �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.

			for (int j=0; j < numArr.length-1-i ;j++) {	// i�� ������ ������, �ݺ�Ƚ���� �پ���.
				if(numArr[j] > numArr[j+1]) { // ������ ���� ������ ���� �ٲ۴�. -> ������ �۾������� == ��������
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;	// �ڸ��ٲ��� �߻������� changed�� true��.
				}
			} // end for j

			if (!changed) break;	// �ڸ��ٲ��� ������ ��ȭ�� ���� ���̹Ƿ� ���̻� ������� �ʰ�, �ݺ����� �����.
			
			// �ڸ��ٲ��� ���� ������ �����
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); // ���ĵ� ����� ����Ѵ�.
			System.out.println();
		} // end for i
	} // main�� ��
}
