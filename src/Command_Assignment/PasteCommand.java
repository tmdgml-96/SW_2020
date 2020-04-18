package Command_Assignment;

public class PasteCommand implements Command_2 {
	
	private Document document;

	@Override
	public void execute() {
		document.paste();
	}

	public PasteCommand(Document document) {
		this.document = document;
	}
	

}
