package modulo11;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Modulo11Ex01 
{

	public static void main(String[] args) 
	{
		
		Scanner leia  = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String opcao = "";
		String nome;
		
		System.out.println("******************************");
		System.out.println("1 - Adicionar cliente na fila.");
		System.out.println("2 - Listar todos os clientes.");
		System.out.println("3 - Retirar cliente da fila.");
		System.out.println("0 - Sair.");
		System.out.println("******************************");
		
		while (!opcao.equals("0"))
		{
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextLine();
			switch(opcao)
			{
				case "1":
					System.out.println("Escreva seu nome: ");
					nome = leia.nextLine();
					fila.add(nome);
					System.out.println("Cliente adicionado.");
					break;
				case "2": 
					System.out.println("Lista de clientes na fila: " + fila);
					break;
				case "3":
					if (!fila.isEmpty())
					System.out.println("Cliente chamado: " + fila.poll());
					else
					System.out.println("A fila está vazia.");
					break;
				case "0":
					System.out.println("O programa foi finalizado.");
			}
		} 
	leia.close();
	}

}
