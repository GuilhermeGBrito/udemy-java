package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		Set<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana ");
		listaAprovados.add("Carlos ");
		listaAprovados.add("Pedro ");
		listaAprovados.add("Lucas ");
	

		for (String candidato : listaAprovados) {
			System.out.println(candidato);

		}

		Set<Integer> nums = new TreeSet<>();
		nums.add(19);
		nums.add(55);
		nums.add(36);
		nums.add(455);

		for (int numeros : nums) {
			System.out.println(numeros);
		}
		Set<Integer> nums2 = new HashSet<>();
		nums2.add(3);
		nums2.add(4);
		nums2.add(5);
		nums2.add(1);
	
		
		for(int i : nums2) {
			System.out.println(i);
		}

	}

}
