import java.io.IOException;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numero_de_valores = scanner.nextInt();
        String array = "int[] myArray = { ";
        for (int i = 0; i<numero_de_valores - 1; i++){
            int n = scanner.nextInt();

            array += n + ", ";

        }
        array += scanner.nextInt() + " };";
        System.out.println(array);
    }

}
