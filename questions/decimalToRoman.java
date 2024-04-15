import java.util.*; 
public class decimalToRoman {
    static int digit(char ch , int n , int i , char[] c){
        for(int j = 0 ; j< n ; j++){
            c[i++] = ch; 
        }
        return i ; 
    }

    static int sub_digit(char num1 , char num2, int i, char[] c){
        c[i++] = num1; 
        c[i++] = num2; 
        return i ; 
    }
    static void printRoman(int number){
        char c[] = new char[10001];
        int i = 0 ; 
        int remainder; 
        if(number <= 0){
            System.out.println("Invalid number");
            return;
        }
        
        while (number != 0){
            if(number >= 1000){
                remainder = number / 1000; 
                i = digit('M', remainder, i, c); 
                number = number % 1000; 
            }
            else if(number >= 500){
                if(number < 900){
                    remainder = number / 500; 
                    i = digit('D', remainder, i, c); 
                    number = number % 500; 
                }

                else {
                    i = sub_digit('C', 'M', i, c); 
                    number = number % 100; 
                }
            }
            else if(number >= 100){
                if(number < 400){
                    remainder = number / 100; 
                    i = digit('C', remainder, i, c); 
                    number = number % 100; 
                }
                else{
                    i = sub_digit('C', 'D', i, c);
                    number = number % 100; 
                }
            }
            else if(number >= 50){
                if(number < 90){
                    remainder = number / 50; 
                    i = digit('L' , remainder , i , c); 
                    number = number % 50; 
                }
                else {
                    i = sub_digit('X', 'C', i, c);
                    number = number % 10; 
                }
            }
            else if(number >= 10 ){
                if(number < 40){
                    remainder = number / 10; 
                    i = digit('X', remainder, i, c);
                    number = number % 10;
                }
                else{
                    i = sub_digit('X', 'L', i, c);
                    number = number % 10;
                }
            }
            else if(number >= 5 ){
                if(number < 9){
                    remainder = number / 5; 
                    i = digit('X', remainder, i, c);
                    number = number % 5;
                }
                else{
                    i = sub_digit('I', 'X', i, c);
                    number = 0;
                }
            }
            else if(number >= 1 ){
                if(number < 4){
                    // remainder = number / 5; 
                    i = digit('I', number, i, c);
                    number = 0;
                }
                else{
                    i = sub_digit('I', 'V', i, c);
                    number = 0;
                }
            }
        }

        for(int j = 0 ; j< i ; j++){
            System.out.print(c[j]);
        }
    }
        public static void main(String[] args) {
            int number = 3549;
     
            printRoman(number);
        }
    
}
