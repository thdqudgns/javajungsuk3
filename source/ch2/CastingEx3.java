class CastingEx3 {
	public static void main(String[] args) {
		float f   = 9.1234567f;	//4byte �Ǽ����̴�.
		double d  = 9.1234567;	//8byte �Ǽ����̴�.
		double d2 = (double)f;	//�� ū ������ �ڷ������� ����ȯ

		System.out.printf("f =%20.18f\n", f);	// %: �� ���ڿ� �ڿ��� ���� �־��ְڴ�.
		System.out.printf("d =%20.18f\n", d);	// 20.18f: 20�ڸ��� ǥ���ϴµ�, 18�ڸ��� �Ҽ��κ��� �Ǽ���.
		System.out.printf("d2=%20.18f\n", d2);	// \n: �̰��� ����ϰ� �ٹٲ��� �Ѵ�. (next line)
		//f =9.123456954956055000: ���е��� 7�ڸ��� 6 �޺κ��� �� ����ִ�.
		//d =9.123456700000000000: ���е��� 15�ڸ��� 7���� ����� ����.
	}
}
