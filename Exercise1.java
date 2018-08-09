package pl.swieczkowski.operacje_na_plikach;

import java.io.*;
import java.util.Scanner;

public class Exercise1 {
    public final static String EXIT = "-";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineToWrite = "";
        System.out.println("Podaj scieżkę dostępu do pliku:");
        String filePath = sc.nextLine();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath))) {
            while (true) {
                System.out.println("Wprowadź linie tekstu do pliku lub wprowadź \"-\" aby zakończyć zapisywanie.");
                lineToWrite = sc.nextLine();
                if (lineToWrite.equals(EXIT)) {
                    System.out.println("Zakończono wprowadzanie tekstu do pliku");
                    break;
                } else {
                    fileWriter.write(lineToWrite);
                    fileWriter.write(System.lineSeparator());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
