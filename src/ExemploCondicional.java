public class ExemploCondicional {

    static void main(String[] args) {

        double saldo = 1500.00;
        double valorSaque = 500.00;

        if (saldo >= valorSaque)
        {
            System.out.println("Saque autorizado! Novo saldo R$ " + (saldo - valorSaque));
        }
        else System.out.println("Saldo insuficiente. Saque negado");

    }
}
