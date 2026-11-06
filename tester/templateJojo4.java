import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class templateJojo4 {
    static void loadFile(Path path, ArrayList<String> kata){
        try{
            List<String> lines = Files.readAllLines(path);
            for(String baris : lines){
                kata.add(baris);
            }
            System.out.println("Load Completed");
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    static void saveFile(Path path, ArrayList<String> kata){
        try{
            Files.write(path, kata);      
            System.out.println("Save Completed");
        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Path path = Paths.get("TextHandlinB/NotesApp/File.txt");
        ArrayList<String> kata= new ArrayList<>();
        Scanner input = new Scanner(System.in);


        System.out.println("1. Add Note");
        System.out.println("2. Save Note");
        System.out.println("3. Load Note");
        System.out.print("Enter Choice: ");
        int choice = input.nextInt();
        input.nextLine(); // buat hapus baris baru yang terinput
        switch (choice) {
            case 1:
                System.out.print("Enter a note: ");
                String note = input.nextLine();
                kata.add(note);
                break;
            case 2:
                saveFile(path, kata);
                break;
            case 3:
                loadFile(path, kata);
                for(String baris : kata){
                    System.out.println(baris);
                }
                break;
            default:
                break;
        }

        input.close();
        // kata.add("Nah its all a lie tbh");

        // saveFile(path, kata);

        // System.out.println(kata.get(1));

    }   
}
