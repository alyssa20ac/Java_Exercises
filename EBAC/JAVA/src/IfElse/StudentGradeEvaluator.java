package IfElse;
import java.util.Scanner;

public class StudentGradeEvaluator {

	public static void main(String[] args) {
		 Scanner Scanner = new Scanner(System.in);
		 double somaNotas = 0;
		 int totalNotas = 4;
		 
		 //ler notas
	for(int i = 1; i <= totalNotas; i++) {
		System.out.println("Digite a nota"+ i + ";");
		double nota = Scanner.nextDouble();
		somaNotas += nota;		
	}
	
	 // Calcular a média
    double media = somaNotas / totalNotas;
    System.out.println("Média do aluno: " + media);
    
 // Verificar a situação do aluno
    if (media >= 7) {
        System.out.println("Aluno Aprovado");
    } else if (media >= 5) {
        System.out.println("Aluno de Recuperação");
    } else {
        System.out.println("Aluno Reprovado");
    }
	
   
    Scanner.close();
    }
}
