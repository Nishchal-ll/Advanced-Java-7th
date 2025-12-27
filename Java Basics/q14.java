import java.io.*;
import java.util.Scanner;

// Serializable class
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class FileHandlingCombined {

    // (a) FileInputStream
    static void readUsingFileInputStream() throws Exception {
        FileInputStream fis = new FileInputStream("input.txt");
        int ch;
        System.out.println("Reading using FileInputStream:");
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
        System.out.println("\n");
    }

    // (b) FileOutputStream
    static void writeUsingFileOutputStream() throws Exception {
        FileOutputStream fos = new FileOutputStream("output.txt");
        fos.write("Hello FileOutputStream".getBytes());
        fos.close();
    }

    // (c) Image copy
    static void copyImage() throws Exception {
        FileInputStream fis = new FileInputStream("img1.jpg");
        FileOutputStream fos = new FileOutputStream("img2.jpg");
        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }

    // (d) DataInputStream & DataOutputStream
    static void dataStreamDemo() throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
        dos.writeInt(100);
        dos.writeDouble(50.5);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
        System.out.println("DataInputStream values:");
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        dis.close();
    }

    // (e) RandomAccessFile
    static void randomAccessDemo() throws Exception {
        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
        raf.writeUTF("Random Access File");
        raf.seek(0);
        System.out.println("RandomAccessFile data:");
        System.out.println(raf.readUTF());
        raf.close();
    }

    // (f) FileReader
    static void fileReaderDemo() throws Exception {
        FileReader fr = new FileReader("input.txt");
        int ch;
        System.out.println("Reading using FileReader:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
        System.out.println("\n");
    }

    // (g) FileWriter
    static void fileWriterDemo() throws Exception {
        FileWriter fw = new FileWriter("writer.txt");
        fw.write("Hello FileWriter");
        fw.close();
    }

    // (h) Keyboard input to file
    static void keyboardToFile() throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("keyboard.txt");
        System.out.println("Enter text:");
        fw.write(sc.nextLine());
        fw.close();
    }

    // (i) Serialization & Deserialization
    static void serializationDemo() throws Exception {
        Student s = new Student(1, "Nishchal");

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(s);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println("Deserialized Student:");
        System.out.println(s2.id + " " + s2.name);
    }

    public static void main(String[] args) throws Exception {

        writeUsingFileOutputStream();     // (b)
        readUsingFileInputStream();       // (a)

        fileWriterDemo();                 // (g)
        fileReaderDemo();                 // (f)

        dataStreamDemo();                 // (d)
        randomAccessDemo();               // (e)

        keyboardToFile();                 // (h)
        serializationDemo();              // (i)

        // copyImage();                   // (c) Uncomment if image files exist

        System.out.println("\nAll file operations demonstrated successfully.");
    }
}
