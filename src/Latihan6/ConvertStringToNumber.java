/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author PERSONALISE NOTEBOOK
 */
public class ConvertStringToNumber {
    public static void main(String[] args) {
        try {
            // intentional error
            String s = "LIMA";
            int i = Integer.parseInt(s);

            // this line of code will never be reached
            System.out.println("int value = " + i);
        }
        catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }   

}
