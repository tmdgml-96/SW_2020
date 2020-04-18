package Command_Assignment;

public class QuitCommand implements Command_2{
	
	private Document document;
	
	@Override
	public void execute() {
		document.quit();
	}

	public QuitCommand(Document document) {
		this.document = document;
	}
	
	

}
