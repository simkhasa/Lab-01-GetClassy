import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String record = "";
        ArrayList<Product> products = new ArrayList<>();

        final int COLUMNS = 4;
        String id, name, description;
        double cost;

        try {
            File currentFolder = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(currentFolder);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                while(reader.ready()) {
                    record = reader.readLine();
                    String[] fields = record.split(",");
                    if(fields.length == COLUMNS) {
                        id = fields[0].trim();
                        name = fields[1].trim();
                        description = fields[2].trim();
                        cost = Double.parseDouble(fields[3].trim());
                        Product product = new Product(id, name, description, cost);
                        products.add(product);
                    }
                    else {
                        System.out.println("Found a record that may be corrupt: ");
                        System.out.println(record);
                    }
                }
                reader.close();
                System.out.println("\n\nData file read!");

                System.out.println("ID#           Name          Description                 Cost");
                System.out.println("==============================================================");
                for (Product product : products) {
                    System.out.printf("\n%-14s%-14s%-28s%-12.2f", product.getID(), product.getName(), product.getDescription(), product.getCost());
                }
            }
            else {
                System.out.println("Failed to choose a file to process");
                System.out.println("Run the program again");
                System.exit(0);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}