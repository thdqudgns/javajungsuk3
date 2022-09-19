class CastingEx2 {
	public static void main(String[] args) {
		int  i = 10;		//정수형
		byte b = (byte)i;	//정수형을 byte형으로 변환: 변수 앞에(byte)를 붙인다. byte형은 범위가 1byte다
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
		
		i = 300;
		b = (byte)i;	 //byte형의 범위는 -128 ~ 127 이다.
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
