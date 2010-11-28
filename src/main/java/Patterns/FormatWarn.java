package Patterns;

public class FormatWarn implements IFormatStrategy {

	@Override
	public String formatString(String toFormatString) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("WARNING: ");
		sb.append(toFormatString);
		return sb.toString();
	}

}
