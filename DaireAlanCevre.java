package Giris;

import java.util.Scanner;

public class DaireAlanCevre{

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double pi = 3.14, yaricap, cevre, alan, dilimY�zdesi;

            System.out.println("Dairenin yar��ap�n� giriniz : ");
            yaricap = input.nextDouble();
            System.out.println("Daire dilimi de�ilse 360, dilim ise a��s�n� yaz�n�z : ");
            dilimY�zdesi = input.nextDouble();
            boolean yuzde = dilimY�zdesi >= 360;


            cevre = yuzde ? 2 * pi * yaricap : 2 * yaricap + 2 * yaricap * pi * dilimY�zdesi / 360;
            alan = pi * Math.pow(yaricap,2);

            System.out.println("Dairenin �evresi : " + cevre);
            System.out.println("Dairenin alan� : " + alan * dilimY�zdesi / 360);


        }





}
