public class JurosCompostos {public static void main(String[] args) {

        double principal = 1000.0;   // capital inicial
        double taxa      = 0.015;    // 1,5 % a.m.
        int meses        = 12;

        double saldo = principal;
        System.out.printf("%-3s %-10s%n", "Mês", "Saldo");

        for (int m = 1; m <= meses; m++) {
            // TODO: aplicar juros compostos e imprimir linha
        }

        System.out.printf("%nSaldo final após %d meses = R$ %.2f%n",
                          meses, saldo);
    }
    
}
