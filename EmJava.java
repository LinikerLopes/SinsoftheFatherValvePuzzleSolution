import java.util.Scanner;

public class EmJava {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o numero do final da nota: ");
           int num = sc.nextInt();

            for (int i = 0;i<=5; i++){
                for (int i2 = 0; i2<=5; i2++){
                    if (i * 7 + i2 * 4 == num){
                        System.out.println("Válvula norte: " + i );
                        System.out.println("Válvula sul: " + i2 );
                        System.out.println("Finalizado");
                    }
                }
            }
        System.out.println("Algoritmo feito pelo Woox");
        }

    }
