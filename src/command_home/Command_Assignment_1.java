package command_home;

import java.util.Scanner;

/*
 * 
 * Command Pattern �� ���� �׳� �����ԤФ�
 * 
 * */

public class Command_Assignment_1 {

	public static void main(String[] args) {

		String quit = new String("quit");
		String undo = new String("undo");
		String paste = new String("paste");
		String cut = new String("cut");
		
		// Ư�� ��ġ Ȯ�� ���� StringBuffer 
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
				
				System.out.println("�Է°��� ��ȿ���� �ʽ��ϴ�. ���α׷��� �����մϴ�");
				System.exit(0);
			}
		
			/*
			 *  ��ɾ ��quit���̸� ���ø����̼��� �����Ѵ�.
			 */
			else if(quit.equals(in_select)) {
				
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
			
			
			/*
			 * ��ɾ ��paste���̸� paste����� ����� ��ġ�� ������ �ؽ�Ʈ�� 
			 * �Է¹޴´�
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
			 * ��ɾ ��undo���̸� ���������� ����� ��ɾ ��ҵȴ� 
			 *	(���� ����: ������ ����� ��ɾ �־�� ��)
			 */
			else if(undo.equals(in_select)) {
				temp = text.toString();
				
				if(temp != null) {
					
					text.delete(i_start, text.length());
					System.out.println("--> " + text + " <--");
				}
				
				else if(temp == null){
					System.out.println("�Էµ� ������ �����ϴ�.");
					System.exit(0);
				}
				
				
			}
			
			/*
			 * ��ɾ ��cut���̸� cut����� ���۵� ��ġ�� ���� ������ �Է¹޾� 
			 * �ڸ���
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
