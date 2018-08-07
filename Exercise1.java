package pl.swieczkowski.operacje_na_plikach;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
    public final static String EXIT = "-";
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String lineToWrite = "";
        FileWriter fileWriter = null;
        boolean nextLine = true;
        System.out.println("Podaj scieżkę dostępu do pliku:");
        String filePath = sc.nextLine();
        try{
            fileWriter = new FileWriter(filePath);
            while(nextLine){
                System.out.println("Wprowadź linie tekstu do pliku lub wprowadź \"-\" aby zakończyć zapisywanie." );
                lineToWrite = sc.nextLine();
                if(lineToWrite.equals(EXIT)){
                    System.out.println("Zakończono wprowadzanie tekstu do pliku");
                    nextLine = false;
                } else {
                    fileWriter.write(lineToWrite);
                    fileWriter.write(System.lineSeparator());
                }
            }
        } finally {
            if (fileWriter != null){
                fileWriter.close();
            }
        }
    }
}
