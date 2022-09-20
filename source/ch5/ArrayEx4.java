class ArrayEx4 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);	//abc의 0부터 abc.length의 길이만큼 -> result의 0부터에 붙여넣는다.
		System.arraycopy(num, 0, result, abc.length, num.length);	//num의 0부터 num.length의 길이만큼 -> result의 abc.length부터에 붙여넣는다.
		System.out.println(result);

		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);	
		System.out.println(num);

	     // number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);	//abc의 0부터 3의 길이만큼(0~2) -> num의 6부터에 붙여넣는다.
		System.out.println(num);
	}
}
