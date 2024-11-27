//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 5;
        int media = (n1 + n2)/2;
        System.out.println(media);
        char letra = 'A';
        String favorita = " é minha letra favorita";
        System.out.println(letra + favorita);

        double precoProduto = 10.50;
        int quantidade = 5;
        int resultado = (int) (precoProduto * quantidade);
        System.out.println(resultado);

        double valorEmDolares = 50.40;
        double dolar = 4.94;
        double resultadoDolar = valorEmDolares * dolar;
        System.out.println(resultadoDolar);

        double precoOriginal = 40.35;
        double percentualDesconto = 0.1;
        double desconto = precoOriginal * percentualDesconto;
        double resultadoDesconto = precoOriginal - desconto;
        System.out.println("o valor é " + precoOriginal + " mas com desconto fica " +resultadoDesconto);
    }
}