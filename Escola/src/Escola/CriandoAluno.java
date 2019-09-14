package Escola;

public class CriandoAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "Tallys";
		a1.idade = 26;
		a1.nota1 = 7.5;
		a1.nota2 = 7.9;
		
		Aluno a2 = new Aluno();
		a2.nome = "Leonan";
		a2.idade = 22;
		a2.nota1 = 6.5;
		a2.nota2= 7.1;
		
		Aluno a3 = new Aluno();
		a3.nome = "Iago";
		a3.idade = 22;
		a3.nota1 = 8.7;
		a3.nota2 = 9.9;
		
		Aluno a4 = new Aluno();
		a4.nome = "Willian";
		a4.idade = 21;
		a4.nota1 = 7.0;
		a4.nota2 = 9.9;
		
		double media1 = (a1.nota1 / 2) + (a1.nota2 / 2);
		double media2 = (a2.nota1 / 2) + (a2.nota2 / 2);
		double media3 = (a3.nota1 / 2) + (a3.nota2 / 2);
		double media4 = (a4.nota1 / 2) + (a4.nota2 / 2);
		
		System.out.println("Primeiro aluno: ");
		System.out.println("Nome: " + a1.nome);
		System.out.println("Idade: " + a1.idade);
		System.out.println("Nota1: " + a1.nota1);
		System.out.println("Nota2: " + a1.nota2);
		System.out.println("Media: " + media1 + "\n");
		
		System.out.println("Segundo aluno: ");
		System.out.println("Nome: " + a2.nome);
		System.out.println("Idade: " + a2.idade);
		System.out.println("Nota1: " + a2.nota1);
		System.out.println("Nota2: " + a2.nota2);
		System.out.println("Media: " + media2 + "\n");
		
		System.out.println("Terceiro aluno: ");
		System.out.println("Nome: " + a3.nome);
		System.out.println("Idade: " + a3.idade);
		System.out.println("Nota1: " + a3.nota1);
		System.out.println("Nota2: " + a3.nota2);
		System.out.println("Media: " + media3 + "\n");
		
		System.out.println("Quarto aluno: ");
		System.out.println("Nome: " + a4.nome);
		System.out.println("Idade: " + a4.idade);
		System.out.println("Nota1: " + a4.nota1);
		System.out.println("Nota2: " + a4.nota2);
		System.out.println("Media: " + media4);
		
	}
}
