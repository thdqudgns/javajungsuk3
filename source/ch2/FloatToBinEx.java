class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);
		/**
		 * Float.floatToIntBits():
		 * IEEE 754 �ε� �Ҽ����� ���̱� ���� (single format)����Ʈ ���̾ƿ��� ����, ������ �ε� �Ҽ����� ���� ǥ���� �����մϴ�.
		 */
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16������ ���
	} // main�� ��
}
