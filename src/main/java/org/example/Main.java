package org.example;

import java.util.Scanner;
 /*
 Klavyeden kütlesi ve molekül ağırlığı girilen maddenin mol sayısını hesaplayan program.

 n : Mol sayısı (mol) ----- m : Maddenin kütlesi (gram) ---- Ma: Molekül ağırlığı (gram/mol)
 Hidrojen gazının kütlesi 2.016 gram ve molekül ağırlığı 1.008 gram/mol'dür.
 Bu sonuç, 2.016 gram hidrojen gazının 1 mol hidrojene eşit olduğunu ve dolayısıyla 2.0 mol hidrojen gazı olduğunu gösterir.
*/
public class Main {
    public static void main(String[] args) {

        double kutle;
        double molekulAgirligi;
        double molSayisi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Maddenin kütlesini (gram) ve molekül ağırlığını (g/mol) giriniz : ");

        System.out.print("Kütle (gram): ");
        kutle = scanner.nextDouble();

        System.out.print("Molekül Ağırlığı (g/mol): ");
        molekulAgirligi = scanner.nextDouble();

        // Mol sayısını hesapla: m / Ma
        molSayisi = kutle / molekulAgirligi;

        System.out.println("Mol Sayısı: " + molSayisi + " mol");

        scanner.close();
    }
}