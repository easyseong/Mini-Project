import java.util.Random;
import java.util.Scanner;

public class Mini_Project_250 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] words = {"java", "count","school","book","student","programmer"};
		
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());//����¦��ⰹ��
		
		
		System.out.print("������ ����: ");
		for(int i=0;i<solution.length();i++) 
			System.out.print("_ ");
		System.out.println();
		System.out.print("���ڸ� �����Ͻÿ�: ");
		char x = s.next().charAt(0);	//next()�� �Է¹ް� char�� ������ �����´�.
		
		for(int i=0;i<solution.length();i++) {
			if(solution.charAt(i)==x) {
				
			}
		}

	}

}
