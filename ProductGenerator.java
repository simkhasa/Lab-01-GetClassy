import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.APPEND;
public class ProductGenerator {
    public static void main(String[] args) {
        boolean doneInput = false;
        String ID = "";
        String name = "";
        String description = "";
        double cost = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath(),"src","ProductTestData.txt");
        do {
            ID = SafeInput.getNonZeroLenString(in,"Enter the ID");
            name = SafeInput.getNonZeroLenString(in, "Enter the product name");
            description = SafeInput.getNonZeroLenString(in,"Enter the product description");
            cost = SafeInput.getDouble(in,"Enter the product cost");
            Product product = new Product(ID, name, description, cost);
            products.add(product);
            doneInput = SafeInput.getYNConfirm(in,"Are you done?");
        } while (!doneInput);
        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            for (Product product : products) {
                writer.write(product.toCSV(), 0, product.toCSV().length());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}