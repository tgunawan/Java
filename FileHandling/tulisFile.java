package FileHandling;


// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
import java.nio.file.*;
import java.io.IOException;

public class tulisFile {
    public static void main(String[] args) {
        Path path = Paths.get("FileHandling/data.txt");
        String konten = "Baris 1\nBaris 2\nBaris 3";

        try{
            Files.writeString(path, konten);
            System.out.println("Berhasil menulis file");
        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
