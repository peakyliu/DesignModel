package someSample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("design/input.txt");) {
            int content;
            long skip = fileReader.skip(3);
            System.out.println("the actual number of bytes skipped" + skip);
            System.out.print("the content read from file:");
            while ((content = fileReader.read()) != -1) {
                System.out.print((char)content);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
