import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) throws IOException {
        File f = new File("src/filename2.txt");
        FileWriter fw = new FileWriter(f);

        fw.write("2.9\n" +
                "10\n" +
                "3 4 3 2 2 4 3 3 4 3");
        fw.close();
        // Tmb se puede leer directamente el fichero de antes ("filename.txt") asi: FileReader fr = new FileReader("src/filename.txt") y debajo Scanner scanner = new Scanner(fr)
        FileReader fr = new FileReader(f);
        Scanner scanner = new Scanner(fr);//.useLocale(Locale.ENGLISH); si ponemos esto no hace falta hacer casting, ya que no se ralla por la , y el .

        while (scanner.hasNextLine()) {

            float alturaCamion =Float.parseFloat(scanner.nextLine());
            int cantidadPuentes =Integer.parseInt(scanner.nextLine());

            for (int i = 0; i<cantidadPuentes; i++) {
                float alturaPuente = scanner.nextFloat();
                if (alturaCamion >= alturaPuente) {
                    System.out.println("xoca amb el pont " + (i + 1));
                    break;
                }
            }
            break;
            }
        }
    }



