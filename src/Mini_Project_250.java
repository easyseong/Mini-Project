import java.util.Random;
import java.util.Scanner;

public class Mini_Project_250 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] words = {"java", "count","school","book","student","programmer"};
		int num=0;
		int index = (new Random()).nextInt(words.length);
		String solution = words[index];
		StringBuffer answer = new StringBuffer(solution.length());//����¦��ⰹ��
		for(int i=0;i<solution.length();i++)
			answer.append('-');
		do {
			System.out.println("������ ����: "+answer);
			System.out.print("���ڸ� �����Ͻÿ�: ");
			char x = s.next().charAt(0);	//next()�� �Է¹ް� char�� ������ �����´�.
	
			for(int i=0;i<solution.length();i++) {
				if(solution.charAt(i)==x) {
					answer.delete(i, i+1);
					answer.insert(i, x);
					num++;
				}	
			}
		}while(num!=solution.length());
		System.out.println(answer);
		System.out.println("����");


	}

}
