class Solution {
    public String intToRoman(int num) {
        // StringBuilder result = new StringBuilder();
        String result = "";
        
        // Thousands place
        while (num >= 1000) {
            result += 'M';
            num -= 1000;
        }
        
        // Hundreds place
        if (num >= 900) {
            result+= "CM";
            num -= 900;
        } else if (num >= 500) {
            result+= "D";
            num -= 500;
        } else if (num >= 400) {
            result+= "CD";
            num -= 400;
        }
        while (num >= 100) {
            result+= "C";
            num -= 100;
        }
        
        // Tens place
        if (num >= 90) {
            result+= "XC";
            num -= 90;
        } else if (num >= 50) {
            result+= "L";
            num -= 50;
        } else if (num >= 40) {
            result+= "XL";
            num -= 40;
        }
        while (num >= 10) {
            result += "X";
            num -= 10;
        }
        
        // Ones place
        if (num >= 9) {
            result += "IX";
            num -= 9;
        } else if (num >= 5) {
            result += "V";
            num -= 5;
        } else if (num >= 4) {
            result+= "IV";
            num -= 4;
        }
        while (num > 0) {
            result += "I";
            num--;
        }
        
        return result.toString();
    }
}