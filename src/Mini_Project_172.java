import java.util.ArrayList;
import java.util.Scanner;

class User {
	String userId, password;
	static int count;
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
}
public class Mini_Project_172 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<User>();
		while(true) {
			System.out.println("=========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("=========================");
			System.out.print("번호를 입력하시오: ");
			int num = s.nextInt();
			if(num==1) {
				System.out.print("Id: ");
				String Id = s.next();
				System.out.print("Password: ");
				String Password = s.next();
				list.add(new User(Id,Password));
				User.count+=1;
			}
			else if(num==2) {
				boolean a=false;
				System.out.print("Id: ");
				String Id = s.next();
				System.out.print("Password: ");
				String Password = s.next();
				for(User obj : list) {
					if(obj.userId==Id&&obj.password==Password)
						a=true;			
				}
				if(a==true) 
					System.out.println("Login 성공!");
				else 
					System.out.println("Login 실패!");
			}
			else if(num==3) {
				for(User obj : list) {
					System.out.println("{"+obj.userId+", "+obj.password+"}");
				}
			}
			else if(num==4)
				break;
		
			
		}
		
			
		

		
		
		

	}

}
