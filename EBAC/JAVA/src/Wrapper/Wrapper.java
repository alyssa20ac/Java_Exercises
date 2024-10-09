package Wrapper;

public class Wrapper {
	public static void main(String[] args) {
        // Criando um objeto Scanner para ler o valor do console
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor numérico inteiro do usuário
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt(); // Variável primitiva (int)

        // Convertendo o valor primitivo para o tipo wrapper (Integer)
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprimindo o valor primitivo e o valor convertido (wrapper)
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);

        // Fechando o scanner
        scanner.close();
    }
}