
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os números");

        int num1 = scanner.nextInt(),
                num2 = scanner.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {

            System.out.println(e.getMessage());

        }finally{
            scanner.close();
        }

    }

    static void contar(int parameter1, int parameter2) throws ParametrosInvalidosException {

        if (parameter1 > parameter2) {

            throw new ParametrosInvalidosException();
        }

        int cont = parameter2 - parameter1;

        for (int i = 1; i <= cont; i++) {
            System.out.println(i);
        }
    }

}
