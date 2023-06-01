package Arrays;

import javax.swing.JOptionPane;

public class Array1 {
	public static void main(String[] args) {

		int[] vetor = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"))];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero " + (i + 1)));
		}
		imprimirVetor(vetor);
		calcularMedia(vetor);

	}

	private static void calcularMedia(int[] vetor) {
		double media = 0;
		for (int i = 0; i < vetor.length; i++) {
			media += (vetor[i] / vetor.length);
		}
		System.out.println("Media = " + media);

	}

	static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}

	}

}
