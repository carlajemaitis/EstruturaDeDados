package modulo11;

import java.util.Scanner;
import java.util.Stack;

public class Modulo11Ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		Stack <String> pilha = new Stack <String>();
		String opcao = "";
		String nome;
		
		System.out.println("******************************");
		System.out.println("1 - Adicionar um novo livro na pilha.");
		System.out.println("2 - Listar todos os livros.");
		System.out.println("3 - Retirar um livro da pilha.");
		System.out.println("0 - Sair.");
		System.out.println("******************************");
		
		while(!opcao.equals("0")) 
		{
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextLine();
			switch (opcao)
			{
				case "1": 
					System.out.println("Digite o nome do livro: ");
					nome = leia.nextLine();
					pilha.push(nome);
					System.out.println("Livro adicionado. ");
					break;
				case "2":
					System.out.println("Lista dos livros: " + pilha);
					break;
				case "3":
					if(!pilha.isEmpty())
					System.out.println("Livro retirado: " + pilha.pop());
					else
					System.out.println("Não há livros. ");
					break;
				case "0":
					System.out.println("Programa finalizado. ");
					break;
			}
		}
	leia.close(); 
	}

}
