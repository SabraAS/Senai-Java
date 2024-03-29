package controller;

import util.Teclado;

public class QuickSortEx1 {
	private int array[];
	private int comprimento;
	
	public void sort(int[] inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		
			this.array = inputArr;
			comprimento = inputArr.length;
			quickSort(0, comprimento - 1);
		
	}
	
		private void quickSort(int menorIndice, int maiorIndice) {
			int i = menorIndice;
			int j = maiorIndice;
			// calcula o n�mero do meio (piv�)
			int pivo = array[menorIndice+(maiorIndice-menorIndice)/2];
			// Divide em dois arrays
			while (i <= j) {
				/**
				 * Em cada loop, vamos identificar um n�mero a esquerda que � o maior que o piv�
				 * e um n�mero a direita que � menor que piv� e vamos troc�-los
				 */
				while (array[i] < pivo) {
					i++;
				}
				
				while (array[j] > pivo) {
					j--;
				}   
				
				if (i <= j) {
					trocaNumeros(i, j);
					//move o �ndice
					i++;
					j--;
				}
			}
			
			// chama o m�todo QuickSort
			if (menorIndice < j)
				quickSort(menorIndice, j);
			if (i < maiorIndice)
				quickSort(i, maiorIndice);
		}
		
		private void trocaNumeros(int i, int j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		public static void main(String a[]) {
			QuickSortEx1 sorter = new QuickSortEx1();
			int[] input = new int[5];
			for(int x = 0; x < input.length; x++) {
				input[x] = Teclado.lerInt("Digite 5 n�meros aleat�rios:");
			}
			
			sorter.sort(input);
			for(int i:input) {
				System.out.println(i);
				System.out.println(" ");
			}
		}
	}


