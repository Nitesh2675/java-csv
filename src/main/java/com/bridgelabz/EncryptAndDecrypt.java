package com.bridgelabz;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EncryptAndDecrypt {
    public static void main(String[] args) {
        WriteData.writeData();
        ReadData.readData();
    }
}

class EncryptAndDecryptUtil {
    public static String encrypt(String input) {
        StringBuilder encrypt = new StringBuilder();
        for (char ch : input.toCharArray()) {
            encrypt.append((char)(ch + 3));
        }
        return encrypt.toString();
    }

    public static String decrypt(String input) {
        StringBuilder encrypt = new StringBuilder();
        for (char ch : input.toCharArray()) {
            encrypt.append((char)(ch - 3));
        }
        return encrypt.toString();
    }
}

class WriteData {
    public static void writeData() {
        try (Scanner sc = new Scanner(System.in);
             CSVWriter writer = new CSVWriter(new FileWriter("encrypted.csv", true))) {

            System.out.println("How many entries?");
            int count = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            for (int i = 0; i < count; i++) {
                System.out.print("Enter name: ");
                String name = EncryptAndDecryptUtil.encrypt(sc.nextLine());

                System.out.print("Enter ID: ");
                String id = EncryptAndDecryptUtil.encrypt(sc.nextLine());

                writer.writeNext(new String[]{name, id});
            }

        } catch (IOException e) {
            System.out.println("❌ Write error: " + e.getMessage());
        }
    }
}

class ReadData {
    public static void readData() {
        try (CSVReader reader = new CSVReader(new FileReader("encrypted.csv"))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                String name = EncryptAndDecryptUtil.decrypt(line[0]);
                String id = EncryptAndDecryptUtil.decrypt(line[1]);
                System.out.println("Name: " + name + ", ID: " + id);
            }

        } catch (Exception e) {
            System.out.println("❌ Read error: " + e.getMessage());
        }
    }
}
