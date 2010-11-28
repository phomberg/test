package Patterns;

public class StringCustomizer {
	private IFormatStrategy  m_FormatStrategy;
	
	public void SetFormatStrategy(IFormatStrategy formatStrategy)
	{
		m_FormatStrategy = formatStrategy;
	}
	
	public IFormatStrategy getFormatStrategy()
	{
		return m_FormatStrategy;
	}

	public String formatString(String toFormat)
	{
		return m_FormatStrategy.formatString(toFormat);
	}
}
