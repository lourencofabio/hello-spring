public class SomaPares30 {public static void main(String[] args) {
        int soma = 0;

        for (int n = 0; n <= 30; n += 2) {   // percorre só os pares
            soma += n;
        }

        System.out.printf("Soma dos pares de 0 a 30 = %d%n", soma);
    }
    
}
