class CastingEx3 {
	public static void main(String[] args) {
		float f   = 9.1234567f;	//4byte 실수형이다.
		double d  = 9.1234567;	//8byte 실수형이다.
		double d2 = (double)f;	//더 큰 범위의 자료형으로 형변환

		System.out.printf("f =%20.18f\n", f);	// %: 이 문자열 뒤에서 값을 넣어주겠다.
		System.out.printf("d =%20.18f\n", d);	// 20.18f: 20자리로 표현하는데, 18자리는 소수부분인 실수다.
		System.out.printf("d2=%20.18f\n", d2);	// \n: 이것을 출력하고 줄바꿈을 한다. (next line)
		//f =9.123456954956055000: 정밀도가 7자리라서 6 뒷부분은 막 들어있다.
		//d =9.123456700000000000: 정밀도가 15자리라서 7까지 제대로 들어갔다.
	}
}
