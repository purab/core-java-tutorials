package in.purabtech.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/test.txt");
        String fileContent = Files.readString(path);

        // readstring and writestring is inroduced in java 11
        String newFileContent= fileContent.replace("line","purab");
        Path newPath = Paths.get("./resources/test2.txt");
        Files.writeString(newPath,newFileContent);

        System.out.println(fileContent);

    }
}
