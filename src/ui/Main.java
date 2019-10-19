package ui;

public class Main {
	
	private InterfaceEvent command;
	
	public static void main(String[] args) {
		Main t = new Main();
	}
	public Main() {
		command  = new InterfaceEvent();
		command.showSelection();
	}	 
}
