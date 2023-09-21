package ch15.formatted;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
    private static ObjectInputStream inputStream;

    public static void main(String[] args) {
        openFile();
        readFile();
        closeFile();
    }

    public static void openFile() {
        try {
            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Ошибка открытия файла");
            System.exit(1);
        }
    }

    public static void readFile() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");

        try {
            while (true) {
                Account record = (Account) inputStream.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException eofException) {
            System.out.printf("%nНет записей в файле%n");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Неправильный тип объекта");
        } catch (IOException ioException) {
            System.err.println("Ошибка чтения файла");
        }
    }

    public static void closeFile() {
        try {
            if (inputStream != null)
                inputStream.close();
        } catch (IOException ioException) {
            System.err.println("Ошибка закрытия файла");
            System.exit(1);
        }
    }
}
