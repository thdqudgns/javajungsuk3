class CastingEx2 {
	public static void main(String[] args) {
		int  i = 10;		//������
		byte b = (byte)i;	//�������� byte������ ��ȯ: ���� �տ�(byte)�� ���δ�. byte���� ������ 1byte��
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
		
		i = 300;
		b = (byte)i;	 //byte���� ������ -128 ~ 127 �̴�.
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 

		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 

		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 

		System.out.println("i="+Integer.toBinaryString(i));
	}
}
