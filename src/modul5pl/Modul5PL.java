/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5pl;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Modul5PL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sudut, sudutDerajat, sudutRadian, sin, cos, tan;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan besar sudut : ");
        sudut = masuk.nextDouble();

        sudutRadian = Math.toRadians(sudut);
        sin = Math.sin(sudutRadian);
        cos = Math.cos(sudutRadian);
        tan = Math.tan(sudutRadian);

        DecimalFormat digitPresisi = new DecimalFormat("0.0");

        System.out.println(
                "Hasil : \n"
                + "Sinus dari sudut : " + sudut + " adalah " + digitPresisi.format(sin) + "\n"
                + "Cosinus dari sudut : " + sudut + " adalah " + digitPresisi.format(cos) + "\n"
                + "Tangen dari sudut : " + sudut + " adalah " + digitPresisi.format(tan)
        );

    }

}
