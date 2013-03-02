package interpreter;
import java.util.Stack;


public class Drop implements Palavra {

	@Override
	public Integer interpret(Stack<Palavra> pilha) {
		pilha.pop();
		return null;
	}

}
