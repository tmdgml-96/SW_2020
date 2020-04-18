package Command_Assignment;

import java.util.Scanner;

public class Document {
	
	Scanner sc = new Scanner(System.in);
	
	int i_start, i_end;
	StringBuffer text = new StringBuffer("");
	String temp = new String("");
	
	public void paste() {

		System.out.println("Please specify index where the paste must start : ");
		sc.nextLine();
		
		System.out.println("Please specify text to be inserted : ");
		temp = sc.nextLine();	
		
		text.insert(i_start,temp);	
		System.out.println("--> " + text + " <--");
		
	}
	
	public void cut() {
		System.out.println("Please specify index where the cut must start(Inteager) : ");
		i_start = sc.nextInt();
		System.out.println("You chose" + i_start);				
		sc.nextLine();
		
		System.out.println("Please specify number of characters to be cut : ");
		i_end = sc.nextInt();
		System.out.println("You chose" + i_end);
		
		System.out.println("--> " + text.delete(i_start,i_end) + " <--");
		
	}
	
	public void undo() {
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
	
	public void quit() {
		
		System.out.println("----- 프로그램 종료 -----");
		
		System.exit(0);

	}
	
}
