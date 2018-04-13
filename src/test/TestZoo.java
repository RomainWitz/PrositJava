package test;

import Zoo.*;

public class TestZoo {

	public static void main(String[] args) {
		
		Requin jaws = new Requin();
		Chimpanze cheeta = new Chimpanze();
		Requin ham = new Requin();
		jaws.setNom("jaws");
		cheeta.setNom("cheeta");
		ham.setNom("ham");
		
		System.out.println(jaws.toString() + " et " + jaws.son());
		System.out.println(cheeta.toString()+ " et" + cheeta.son());
		System.out.println(ham.toString()+ " et " + ham.son());

	}

}
