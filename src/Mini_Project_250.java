import java.util.Random;
import java.util.Scanner;

public class Mini_Project_250 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] words = {"java", "count","school","book","student","programmer"};
		int num=0;
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());//정답짝대기갯수
		for(int i=0;i<solution.length();i++)
			answer.append('-');
		do {
			System.out.println("현재의 상태: "+answer);
			System.out.print("글자를 추측하시오: ");
			char x = s.next().charAt(0);	//next()로 입력받고 char형 변수를 꺼내온다.
	
			for(int i=0;i<solution.length();i++) {
				if(solution.charAt(i)==x) {
					answer.delete(i, i+1);
					answer.insert(i, x);
					num++;
				}	
			}
		}while(num!=solution.length());
		System.out.println(answer);
		System.out.println("성공");


	}

}
