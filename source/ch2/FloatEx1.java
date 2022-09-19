class FloatEx1 {
	public static void main(String[] args) {
		float  f   = 9.12345678901234567890f;
		float  f2  = 1.2345678901234567890f;
		double d   = 9.12345678901234567890d;

		System.out.printf("     123456789012345678901234%n");
		System.out.printf("f  : %f%n", f); 
		System.out.printf("f  : %24.20f%n", f);
		System.out.printf("f2 : %24.20f%n", f2);
		System.out.printf("d  : %24.20f%n", d);
		System.out.printf("d  : %f%n", d);
		
		// float든 double든 실수형은 정수부 상관없이 기본적으로 소수점 이하 6째자리까지 출력.
		// 단 정밀도는 정수부를 포함하여 7자리, 15자리다.
	}
}
