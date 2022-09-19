class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;       
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       //  8진수 10, 10진수로는 8
		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
		int binNum = 0b10;      //  2진수 10, 10진수로는 2

		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n",  finger);	//5자리로 출력하고, 여백은 왼쪽
		System.out.printf("finger=[%-5d]%n", finger);	//5자리로 출력하고, 여백은 오른쪽
		System.out.printf("finger=[%05d]%n", finger);	//5자리로 출력하고, 여백은 왼쪽, 여백은 0으로 채움
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#X%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);   
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);   
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);  
		// 2진수는 0b를 붙여 저장하여도 기본 10진수 정수로 저장된다.
		// 그래서 2진수를 2진수로 출력하려면 10진 정수형을 2진수로 변환시켜줘야 한다.
		// 그 클래스가 Integer.toBinaryString() 이다.
	}
}
