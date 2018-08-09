package pl.swieczkowski.operacje_na_plikach;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj sieżkę pliku, którego zawartość chcesz odczytać:");
        String filePath = sc.nextLine();
        String line = "";
        int counter = 0;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ilość linii pliku " + filePath + ": " + counter);

    }
}
