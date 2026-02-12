import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStream {
    public static void main(String[] args) {
        // Define input and output file paths
        String inputFilePath = "cat.mp4";
        String outputFilePath = "output.mp4";
        System.out.println("Byte Stream File Copy....");

        try (FileInputStream fileInputStream = new FileInputStream(inputFilePath);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)) {
            int byteContent;
            int count = 0;
            // Read and write byte by byte
            while ((byteContent = fileInputStream.read()) != -1) {
                
                fileOutputStream.write(byteContent);
                count++;
            }
            System.out.println("Total bytes copied: " + count);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}