/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan unutk mengetahui target saldo kita
 * yang di bulan selanjutnya 
 * 
 */
public class PBO210118052Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double saldo = 3500000.0;
        Double target = 6000000.0;
        Integer i = 1;
        
        while(saldo <= target) {
            saldo += saldo * 0.08;
            System.out.println("Saldo di bulan ke-" + i
                    + " Rp." + PBO210118052Latihan20TargetSaldoTabungan.formatter(saldo));
            
            i++;
        }
    }
    
    public static String formatter(Double saldo) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat
                .getIntegerInstance();
        DecimalFormatSymbols formatIDR = new DecimalFormatSymbols();
        
        formatIDR.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatIDR);
        
        return kursIDR.format(saldo);
    }
    
}
