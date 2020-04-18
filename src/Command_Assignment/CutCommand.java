package Command_Assignment;

public class CutCommand implements Command_2{
	
	private Document document;
	
	@Override
	public void execute() {
		document.cut();
	}

	public CutCommand(Document document) {
		this.document = document;
	}
	
	

}
