package Command_Assignment;

import java.util.Scanner;

/*
 * 
 * Command Pattern 안 쓰고 그냥 구현함ㅠㅠ
 * 
 * */

public class Command_Assignment_1 {

	public static void main(String[] args) {

		String quit = new String("quit");
		String undo = new String("undo");
		String paste = new String("paste");
		String cut = new String("cut");
		
		// 특정 위치 확인 위한 StringBuffer 
		//String str = new String();
		StringBuffer text = new StringBuffer("");
		
		String temp = new String("");
				
		Scanner sc = new Scanner(System.in);
		
		int i_start = 0;
		int i_end = 0;


		while(true) {
			
			System.out.println("pick from one of the following: \r\n" + 
					"undo \r\n" + 
					"paste \r\n" + 
					"quit \r\n" + 
					"cut");
			
			String in_select = sc.nextLine();

			
			if (!(quit.equals(in_select))&&!(undo.equals(in_select))&&
					!(paste.equals(in_select))&&!(cut.equals(in_select))) {
				
				System.out.println("입력값이 유효하지 않습니다. 프로그램을 종료합니다");
				System.exit(0);
			}
		
			/*
			 *  명령어가 “quit”이면 어플리케이션을 종료한다.
			 */
			else if(quit.equals(in_select)) {
				
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
			
			
			/*
			 * 명령어가 “paste”이면 paste명령이 실행될 위치와 삽입할 텍스트를 
			 * 입력받는다
			 */
			else if(paste.equals(in_select)) {
				
				System.out.println("Please specify index where the paste must start : ");
				
				i_start = sc.nextInt();
				System.out.println("You chose " + i_start);
				sc.nextLine();
				
				System.out.println("Please specify text to be inserted : ");
				temp = sc.nextLine();				
				
				text.insert(i_start,temp);	
				System.out.println("--> " + text + " <--");
			}
			
			/*
			 * 명령어가 “undo”이면 마지막으로 실행된 명령어가 취소된다 
			 *	(사전 조건: 이전에 실행된 명령어가 있어야 함)
			 */
			else if(undo.equals(in_select)) {
				temp = text.toString();
				
				if(temp != null) {
					
					text.delete(i_start, text.length());
					System.out.println("--> " + text + " <--");
				}
				
				else if(temp == null){
					System.out.println("입력된 문장이 없습니다.");
					System.exit(0);
				}
				
				
			}
			
			/*
			 * 명령어가 “cut”이면 cut명령이 시작될 위치와 문자 개수를 입력받아 
			 * 자른다
			 */
			else if(cut.equals(in_select)) {
				
				System.out.println("Please specify index where the cut must start(Inteager) : ");
				i_start = sc.nextInt();
				System.out.println("You chose" + i_start);				
				sc.nextLine();
				
				System.out.println("Please specify number of characters to be cut : ");
				i_end = sc.nextInt();
				System.out.println("You chose" + i_end);
				
				System.out.println("--> " + text.delete(i_start,i_end) + " <--");
			}
			sc.close();
		}	
	}
}
