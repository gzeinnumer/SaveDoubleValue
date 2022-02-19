package com.gzeinnumer.savedoublevalue;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GblFunction {

    public static String saveDoubleText(String value){
        String pola = "#00.0000";
        if (!pola.contains("."))
            return "0";
        if (value.equals("0.0")){
            return "0";
        }
        String[] split = pola.split(".",-1);
        NumberFormat format = new DecimalFormat(pola);
        String finalData = String.valueOf(Double.parseDouble(format.format((double) Double.valueOf(value))));
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
