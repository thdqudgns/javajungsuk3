class CastingEx1 {
	public static void main(String[] args) {
		double d  = 85.4;	//8byte짜리 실수형 데이터
		int score = (int)d;	//정수 형변환: 변수 앞에 (int)를 붙인다.

		System.out.println("score="+score);
		System.out.println("d="+d);
	}
}
