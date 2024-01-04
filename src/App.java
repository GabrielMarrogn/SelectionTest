import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, soma, soma2, resto;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();

        soma = a + b;
        soma2= c + d;
        resto = a % 2;

        System.out.println(resto);

        if(b > c && d > a){
            if(soma2 > soma){
                if(c > 0 && c >0){
                    if(resto == 0){
                    System.out.println("Valores aceitos");
                }else{
                    System.out.println("Valores nao aceitos");
                }
                }else{
                    System.out.println("Valores nao aceitos");
                }
            }else{
                System.out.println("Valores nao aceitos");
            }
        }else{
            System.out.println("Valores nao aceitos");
        }

    }

}
