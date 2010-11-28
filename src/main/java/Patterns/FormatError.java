package Patterns;

public class FormatError implements IFormatStrategy {

	@Override
	public String formatString(String toFormatString) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("ERROR: ");
		sb.append(toFormatString);
		return sb.toString();
	}

}
