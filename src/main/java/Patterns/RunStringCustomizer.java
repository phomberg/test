package Patterns;

public class RunStringCustomizer {
	public static void main(String[] args) {
		System.out.println("Format Strategy test: ");
		StringCustomizer sc = new StringCustomizer();
		sc.SetFormatStrategy(new FormatError());
		System.out.println(sc.formatString("Format error strategy text"));
		sc.SetFormatStrategy(new FormatWarn());
		System.out.println(sc.formatString("Format warn strategy text"));	
	}
}
