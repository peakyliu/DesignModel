package someSample;

import java.io.*;

public class InputDemo {
    public static void main(String[] args) throws FileNotFoundException {
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

        //InputStreamReader是适配器，FileInputStream是被适配的类（适配器模式主要用于强调不同接口的工作，这里是字节流转换为字符流的接口不同）
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("design/input.txt"));
        //BufferedReader用于增强InputStreamReader的功能（装饰器模式：在不改变对象的基础上增强其功能，这里是增强，也有过滤等）
        BufferedReader reader = new BufferedReader(inputStreamReader);
    }
}
