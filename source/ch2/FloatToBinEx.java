class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);
		/**
		 * Float.floatToIntBits():
		 * IEEE 754 부동 소수점의 「싱글 포맷 (single format)」비트 레이아웃에 따라, 지정된 부동 소수점의 값을 표현해 리턴합니다.
		 */
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16진수로 출력
	} // main의 끝
}
