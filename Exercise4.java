package pl.swieczkowski.operacje_na_plikach;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj sieżkę pliku, którego zawartość chcesz odczytać:");
        String filePath = sc.nextLine();
        int day;
        int month;
        int year;
        DataInputStream inputStream = null;

        try {
            inputStream = new DataInputStream(new FileInputStream(filePath));
            day = inputStream.readInt();
            month = inputStream.readInt();
            year = inputStream.readInt();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        System.out.println(day + "." + month + "." + year);
    }
}
