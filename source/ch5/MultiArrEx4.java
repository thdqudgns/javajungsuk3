import java.util.*;

class  MultiArrEx4{
	public static void main(String[] args) {
		String[][] words = {
			{"chair","의자"},			// words[0][0], words[0][1]
			{"computer","컴퓨터"},	// words[1][0], words[1][1]
			{"integer","정수"}		// words[2][0], words[2][1]
		};

		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);	//index 0에는 영단어가

			String tmp = scanner.nextLine();

			if(tmp.equals(words[i][1])) {	//index 1에는 뜻이 저장되어있음을 이용하여 .equals()로 Scanner로 입력받은 문자와 일치하는지 확인하여
				System.out.printf("정답입니다.%n%n");	//정답여부를 출력하고
			} else {
			   System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);	//틀렸으면 정답인 index 1의 데이터를 출력한다.
			}
		} // for
	} // main의 끝
}
