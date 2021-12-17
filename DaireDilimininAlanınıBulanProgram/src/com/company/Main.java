package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
       𝜋 sayısını = 3.14 alınız.
       Formül : (𝜋 * (r*r) * 𝛼) / 360
	 */

        int r,merkezAci;
        double pi=3.14,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçap uzunluğunu giriniz: ");
        r=input.nextInt();
        System.out.print("Lütfen dairenin merkez açısını giriniz: ");
        merkezAci=input.nextInt();
        alan=(pi*(r*r)*merkezAci)/360;
        System.out.println("Daire diliminin alanı: "+alan);



    }
}
