package interpreter;

import java.util.Stack;

public interface Palavra {
	public Integer interpret(Stack<Palavra> pilha);
}
