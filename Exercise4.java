package pl.swieczkowski.operacje_na_plikach;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj sieżkę pliku, którego zawartość chcesz odczytać:");
        String filePath = sc.nextLine();
        int day = 0;
        int month = 0;
        int year = 0;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(filePath))) {
            day = inputStream.readInt();
            month = inputStream.readInt();
            year = inputStream.readInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(day + "." + month + "." + year);
    }
}
