import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("entrades");
        File[] files = file.listFiles();

         for(File f : files) {
            FileReader fr = new FileReader(f.getPath());
            Scanner scanner = new Scanner(fr);

            int numero_de_valores = scanner.nextInt();
            String array = "int[] myArray = { ";

            for (int j = 0; j < numero_de_valores - 1; j++) { //El - 1 es para decir que no ponga la ultima ","
                int n = scanner.nextInt();

                array += n + ", ";

            }
            array += scanner.nextInt() + " };";
            System.out.println(array);
        }
    }
}
