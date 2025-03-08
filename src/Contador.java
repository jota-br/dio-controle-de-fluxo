import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parametroUm = 0;
        int parametroDois = 0;
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
        } catch (Exception e) {
            System.err.println("Parâmetros inválidos, insira um número inteiro para o primeiro e segundo parâmetro");
        }

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println(i);
        }
    }
}