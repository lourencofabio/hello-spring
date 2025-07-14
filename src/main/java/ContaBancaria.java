public class ContaBancaria {
    public static void main(String[] args) {
        double saldo = 100.0;                      // saldo inicial
        System.out.printf("Saldo inicial: R$ %.2f%n", saldo);

        double deposito = 150.0;                   // deposita
        System.out.printf("Depositando R$ %.2f...%n", deposito);
        saldo += deposito;

        double saque = 70.0;                       // saque
        System.out.printf("Sacando R$ %.2f...%n", saque);
        saldo -= saque;

        System.out.printf("Saldo final: R$ %.2f%n", saldo);
    }
}
    


