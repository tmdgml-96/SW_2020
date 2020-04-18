package Command_Assignment;

public class UndoCommand implements Command_2 {
	
	private Document document;

	@Override
	public void execute() {
		document.undo();
	}

	public UndoCommand(Document document) {
		this.document = document;
	}
	

}
