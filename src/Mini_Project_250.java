import java.util.Random;
import java.util.Scanner;

public class Mini_Project_250 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] words = {"java", "count","school","book","student","programmer"};
		
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());//정답짝대기갯수
		
		
		System.out.print("현재의 상태: ");
		for(int i=0;i<solution.length();i++) 
			System.out.print("_ ");
		System.out.println();
		System.out.print("글자를 추측하시오: ");
		char x = s.next().charAt(0);	//next()로 입력받고 char형 변수를 꺼내온다.
		
		for(int i=0;i<solution.length();i++) {
			if(solution.charAt(i)==x) {
				
			}
		}

	}

}
