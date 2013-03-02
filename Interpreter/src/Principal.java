import java.util.EnumSet;



public class Principal {
	
// http://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#d5e12191
	enum Naipes {
		copas, ouro, paus, espadas;
		
		public Naipes sucessor() {
			return values()[(ordinal() + 1) % values().length];
		}
		
		public Naipes antecessor() {
			return values()[(ordinal() - 1) % values().length];
		}
	
	};
	
	
//	enum NaipesPretos extends Enum<Naipes> {
//		
//	}
	
	public static void main(String[] args) {
		Naipes umNaipe = Naipes.copas;
		umNaipe = umNaipe.sucessor();
		if (umNaipe==Naipes.ouro);
		if (umNaipe.equals(Naipes.ouro));
		System.out.println(umNaipe.toString());
		EnumSet<Naipes> naipesPretos = EnumSet.range(Naipes.paus, Naipes.espadas);
		for (Naipes n : Naipes.values()) 
			System.out.println(n.toString()+" = "+n.ordinal());
		for (Naipes n : naipesPretos)  // imprime apenas paus e espadas
			System.out.println(n.toString()+" = "+n.ordinal());
		if ( naipesPretos.contains(umNaipe))
			System.out.println(umNaipe.toString()+" é um naipe preto");
		else System.out.println(umNaipe.toString()+" é um naipe vermelho");
	}
	
}
