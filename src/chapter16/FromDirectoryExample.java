package chapter16;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;



/**
 * Created by eluticaa on 2016-05-25.
 */
public class FromDirectoryExample {


    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/eluticaa/IdeaProjects/thisisjava/src");
        Stream<Path> stream = Files.list(path);
        stream.forEach( p -> System.out.println(p.getFileName()) );
    }

}
