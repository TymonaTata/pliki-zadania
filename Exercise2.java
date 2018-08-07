package pl.swieczkowski.operacje_na_plikach;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj sieżkę pliku, którego zawartość chcesz odczytać:");
        String filePath = sc.nextLine();
        BufferedReader fileReader = null;
        String fileContent = "";
        int counter = 0;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            while ((fileContent = fileReader.readLine()) != null) {
                System.out.println(fileContent);
                counter++;
            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }

        }
        System.out.println("Ilość linii pliku " + filePath + ": " + counter);

    }
}
