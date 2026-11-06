package FileHandling;

// import java.nio.file.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class bacaFile {
    public static void main(String[] args) {
        Path path = Paths.get("FileHandling/data.txt");
        try{
            List<String> lines = Files.readAllLines(path);
            for(String baris : lines){
                System.out.println(baris);
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        

    }
}
