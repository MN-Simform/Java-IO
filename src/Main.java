import java.io.*;

public class Main {
    File file;

    public void fileInOutStream() {
        file = new File("file.txt");
        try {
            OutputStream fout = new FileOutputStream(file);
            String str = "An Example of FileInputStream & FileOutputStream";
            byte[] byteArr = str.getBytes();
            fout.write(byteArr);
            fout.close();

            InputStream fin = new FileInputStream(file);
            int n;
            while ((n = fin.read()) != -1) {
                System.out.print((char) n);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void fileReadWrite() throws IOException {
        file = new File("file2.txt");

        Writer writer = new FileWriter(file);
        String str = "An Example of FileReader & FileWriter";
        writer.write(str);
        writer.close();

        Reader reader = new FileReader(file);
        int n;
        while ((n = reader.read()) != -1) {
            System.out.print((char) n);
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        main.fileInOutStream();
        System.out.println();
        main.fileReadWrite();
    }
}