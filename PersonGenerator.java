import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.APPEND;
public class PersonGenerator {
    public static void main(String[] args) {
        boolean doneInput = false;
        String ID = "";
        String fName = "";
        String lName = "";
        String title = "";
        int yob = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath(),"src","PersonData.txt");
        do {
            ID = SafeInput.getNonZeroLenString(in,"Enter ID");
            fName = SafeInput.getNonZeroLenString(in, "Enter First Name");
            lName = SafeInput.getNonZeroLenString(in,"Enter Last Name");
            title = SafeInput.getNonZeroLenString(in,"Enter Title");
            yob = SafeInput.getRangedInt(in, "Enter date of birth", 1940, 2010);
            Person person = new Person(ID, fName, lName, title, yob);
            people.add(person);
            doneInput = SafeInput.getYNConfirm(in,"you finished?");
        } while (!doneInput);
        try {OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            for (Person person : people) {
                writer.write(person.toCSV(), 0, person.toCSV().length());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}