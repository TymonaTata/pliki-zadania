package pl.swieczkowski.operacje_na_plikach;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        String filePath = "";
        System.out.println("Podaj sicieżkę do pliku:");
        filePath = sc.nextLine();
        System.out.println("Podaj dzień swoich urodzin:");
        day = sc.nextInt();
        System.out.println("Podaj miesiąc swoich urodzin:");
        month = sc.nextInt();
        System.out.println("Podaj rok swoich urodzin:");
        year = sc.nextInt();

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeInt(day);
            outputStream.writeInt(month);
            outputStream.writeInt(year);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
