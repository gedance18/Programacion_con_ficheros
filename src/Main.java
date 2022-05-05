import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("src/filename.txt");
        Scanner scanner = new Scanner(f);
        FileWriter fw = new FileWriter(f);
        while (scanner.hasNextInt()) {
            int numeros = scanner.nextInt();
            System.out.println(numeros);

        }
        scanner.close();

        fw.write(1 + " ");
        fw.write(20 + " " + "\n");

      /*  for (int i = A; i <= B; i++) {
            if (i % 3 == 0) {
                fw.write(i+"");
                fw.write("\n");
                System.out.println(i);

            }

        }
        fw.close(); */
    }
}
