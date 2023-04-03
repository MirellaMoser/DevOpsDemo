package ch.zhaw.iwi.devops.RomanNumerals;

public class RomanNumeralsConverter {
    public String convert(int zahl) {

        
        if(zahl<=0) {
            return "Dieser Wert ist zu tief";
        }
        if(zahl>50) {
            return "Dieser Wert ist zu hoch";
        }

        
        String roman = "";

        // Arrays zur Darstellung der römischen Ziffern
        String[] römischeZiffern = {"I", "IV", "V", "IX", "X", "XL", "L"};
        int[] zahlen = {1, 4, 5, 9, 10, 40, 50};

        // Schleife zur Konvertierung von arabic zu roman
        int i = 6;
        while (zahl > 0) {
            if (zahl >= zahlen[i]) {
                roman += römischeZiffern[i];
                zahl -= zahlen[i];
            } else {
                i--;
            }
        }

        return roman;
    }
}
