package clases.basicos;

import java.util.regex.*;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern patter = Pattern.compile("^(\\w+)@(\\w+)\\.(\\w+)$");
		Matcher matcher = patter.matcher("8ho9la@su3ra.c2om");
		boolean resultado = matcher.matches();
		System.out.println(resultado);
	}

}
