package Command_Assignment;

import java.util.Scanner;

// 2020.04.18 java.lang.IllegalStateException: Scanner closed


public class Client {
	
	public static void main(String[] args) {
		
		Document document = new Document();
		
		PasteCommand pasteCommand = new PasteCommand(document);
		CutCommand cutCommand = new CutCommand(document);
		UndoCommand undoCommand = new UndoCommand(document);
		QuitCommand quitCommand = new QuitCommand(document);

		Scanner sc = new Scanner(System.in);
		
		String quit = new String("quit");
		String undo = new String("undo");
		String paste = new String("paste");
		String cut = new String("cut");
		

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
			
			else if(quit.equals(in_select)) {
				quitCommand.execute();

			}
			
			else if(paste.equals(in_select)) {
				pasteCommand.execute();

			}
			
			else if(undo.equals(in_select)) {
				undoCommand.execute();

			}
			
			
			else if(cut.equals(in_select)) {
				cutCommand.execute();
				
			}
		}
	}
}
