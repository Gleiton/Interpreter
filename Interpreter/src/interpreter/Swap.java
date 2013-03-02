package interpreter;

import java.util.Stack;

public class Swap implements Palavra {

	@Override
	public Integer interpret(Stack<Palavra> pilha) {
		pilha.push(pilha.remove(1));
		return null;
	}

}
