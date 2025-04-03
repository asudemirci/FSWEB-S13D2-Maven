package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome(121): " + isPalindrome(121));
        System.out.println("isPalindrome(-1221): " + isPalindrome(-1221));
        System.out.println("isPalindrome(123): " + isPalindrome(123));

        System.out.println("isPerfectNumber(6): " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28): " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5): " + isPerfectNumber(5));

        System.out.println("numberToWords(123): " + numberToWords(123));
        System.out.println("numberToWords(1010): " + numberToWords(1010));
        System.out.println("numberToWords(-12): " + numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String numberStr = String.valueOf(number);
        String reversedStr = "";

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr += numberStr.charAt(i);
        }

        return numberStr.equals(reversedStr);
    }


    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }


    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String numberStr = String.valueOf(number);
        String result = "";

        for (int i = 0; i < numberStr.length(); i++) {
            char ch = numberStr.charAt(i);

            switch (ch) {
                case '0':
                    result += "Zero ";
                    break;
                case '1':
                    result += "One ";
                    break;
                case '2':
                    result += "Two ";
                    break;
                case '3':
                    result += "Three ";
                    break;
                case '4':
                    result += "Four ";
                    break;
                case '5':
                    result += "Five ";
                    break;
                case '6':
                    result += "Six ";
                    break;
                case '7':
                    result += "Seven ";
                    break;
                case '8':
                    result += "Eight ";
                    break;
                case '9':
                    result += "Nine ";
                    break;
            }
        }
            return result.trim();
        }
    }
