import java.util.Map;


public class Number implements Expression {
	private int number;
	public Number(int number)       { this.number = number; }

	@Override
	    public int interpret(Map<String,Expression> variables)  { return number; }

}
