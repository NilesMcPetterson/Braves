public class LinePrinter {
	private String string;

	public LinePrinter(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
	
	public void multiPrint(int num) {
		for(int i = 0; i < num; i++) {
			//System.out.println(string);
			System.out.printf("%-20s", string);
			System.out.print(string);
			System.out.println();
		}
	}
}
