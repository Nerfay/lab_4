package com.company;

import java.time.LocalDate;

public class Utilities {
    static String correctingFirstName (String firstName) {
        String result = "";
        firstName = firstName.strip();
        char[] ch = firstName.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    result += ch[i];
                    continue;
                } else {
                    result = "Error";
                    break;
                }
            }
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
                    result += ch[i];
                } else {
                    result = "Error";
                    break;
                }
            }
        }
        return result;
    }
    static String correctingSecondName (String secondName) {
        String result = "";
        secondName = secondName.strip();
        char[] ch = secondName.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    result += ch[i];
                    continue;
                } else {
                    result = "Error";
                    break;
                }
            }
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
                    result += ch[i];
                } else {
                    result = "Error";
                    break;
                }
            }
        }
        return result;
    }
    static String correctingPatronymic (String patronymic) {
        String result = "";
        patronymic = patronymic.strip();
        char[] ch = patronymic.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    result += ch[i];
                    continue;
                } else {
                    result = "Error";
                    break;
                }
            }
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
                    result += ch[i];
                } else {
                    result = "Error";
                    break;
                }
            }
        }
        return result;
    }
    static int correctingSalary(int salary){
        if(salary > 15000 && salary < 120000){
            return salary;
        }
        else return -1;
    }
    static String correctingSellerFirstName(String sellerFistName) {
        String result = "";
        sellerFistName = sellerFistName.strip();
        char[] ch = sellerFistName.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
                    result += ch[i];
                    continue;
                } else {
                    result = "Error";
                    break;
                }
            }
            if (i != 0) {
                if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
                    result += ch[i];
                } else {
                    result = "Error";
                    break;
                }
            }
        }
        return result;
    }
    static int correctingAmount(int amount){
        if(amount >= 0 && amount < 300){
            return amount;
        }
        else return -1;
    }
    static double correctingPrice(double Price){
        if(Price > 1000 && Price < 30000){
            return Price;
        }
        else return -1;
    }
}
