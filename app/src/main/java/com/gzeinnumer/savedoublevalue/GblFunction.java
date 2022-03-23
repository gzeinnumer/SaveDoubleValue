package com.gzeinnumer.savedoublevalue;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class GblFunction {

    /*
    good for percetace, not for money
    * 5.0000 = 5
    * 5.1000 = 5.1
    * 5.0004 = 5.0004
    * 0.0000 = 0
    * 0.1000 = 0.1
    * 0.02000000 = 0.02
    * 29.050,00 = 29.05

    for money use this
    https://github.com/gzeinnumer/SaveMoneyValue
     */
    public static String saveDoubleText(String value){
        if (value ==null){
            return "0";
        }
        if (value.contains(",")){
            value = value.substring(0, value.indexOf(","));
        }
        String pola = "#0.00000000";
        if (!pola.contains("."))
            return "0";
        if (value.equals("0.0")){
            return "0";
        }
        if (Double.parseDouble(value)==0){
            return "0";
        }
        NumberFormat format = new DecimalFormat(pola);
        String finalData = String.valueOf((double) Double.parseDouble(format.format((double) Double.parseDouble(value))));

        String[] split = pola.split("\\.",-1);
        if (split.length==0){
            return "0";
        }

        String[] formatDecimal =split[1].split("");
        if (formatDecimal.length==0){
            return "0";
        } else {
            for (String d : formatDecimal) {
                if (finalData.endsWith("."+d))
                    finalData = finalData.replace("."+d,"");
            }
            for (String d : formatDecimal) {
                if (finalData.endsWith(d))
                    finalData = finalData.replace(d,"");
            }
            if (finalData.endsWith(".0")){
                finalData = finalData.replace(".0","");
            }
            return  finalData;
        }
    }
}
