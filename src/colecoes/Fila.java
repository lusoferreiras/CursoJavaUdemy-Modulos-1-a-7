package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento ocorre quando a fila est� cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia");// Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> ober o pr�ximo elemento da fila (sem remover)
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia!
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a exce��o
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		// Poll e Remove -> obter o pr�ximo elemento da fila e remove!
		
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // Lan�a exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

	}

}
