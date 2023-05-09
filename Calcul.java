
import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rim_str = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        String sign = scanner.nextLine();
        String[] words = sign.split(" ");
        if(3 == words.length){
            try{
                int one = Integer.parseInt(words[0].trim());
                int two = Integer.parseInt(words[2].trim());
                if(one >= 1 && one <= 10){
                    if(two >= 1 && two <= 10){
                        switch(words[1]){
                            case "+":
                                System.out.println(one + two);
                                break;
                            case "-":
                                System.out.println(one - two);
                                break;
                            case "*":
                                System.out.println(one * two);
                                break;
                            case "/":
                                System.out.println(one / two);
                                break;
                            default:
                                System.out.println("throws Exception //т.к. один оператор (+, -, /, *)");
                                break;
                        }
                    } else{
                        System.out.println("throws Exception //т.к. на вход числа от 1 до 10 включительно");
                }
                } else{
                    System.out.println("throws Exception //т.к. на вход числа от 1 до 10 включительно");
                }
            } catch(Exception e){
                int one;
                switch(words[0]){
                    case "I":
                        one = 1;
                        break;
                    case "II":
                        one = 2;
                        break;
                    case "III":
                        one = 3;
                        break;
                    case "IV":
                        one = 4;
                        break;
                    case "V":
                        one = 5;
                        break;
                    case "VI":
                        one = 6;
                        break;
                    case "VII":
                        one = 7;
                        break;
                    case "VIII":
                        one = 8;
                        break;
                    case "IX":
                        one = 9;
                        break;
                    case "X":
                        one = 10;
                        break;
                    default:
                        one = 0;
                        break;
                }
                int two;
                switch(words[2]){
                    case "I":
                        two = 1;
                        break;
                    case "II":
                        two = 2;
                        break;
                    case "III":
                        two = 3;
                        break;
                    case "IV":
                        two = 4;
                        break;
                    case "V":
                        two = 5;
                        break;
                    case "VI":
                        two = 6;
                        break;
                    case "VII":
                        two = 7;
                        break;
                    case "VIII":
                        two = 8;
                        break;
                    case "IX":
                        two = 9;
                        break;
                    case "X":
                        two = 10;
                        break;
                    default:
                        two = 0;
                        break;
                }
                if(one == 0 || two == 0){
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                } else{
                    if(one >= 1 && one <= 10){
                        if(two >= 1 && two <= 10){
                            switch(words[1]){
                                case "+":
                                    System.out.println(rim_str[(one + two) - 1]);
                                    break;
                                case "-":
                                    if(one - two > 0){
                                        System.out.println(rim_str[(one - two) - 1]);
                                        break;
                                    } else{
                                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
                                        break;
                                    }
                                case "*":
                                    System.out.println(rim_str[(one * two) - 1]);
                                    break;
                                case "/":
                                    if(one / two > 0){
                                        System.out.println(rim_str[(one / two) - 1]);
                                        break;
                                    } else{
                                        System.out.println("throws Exception //т.к. в римской системе нет десятичных чисел");
                                        break;
                                    }
                                default:
                                    System.out.println("throws Exception //т.к. один оператор (+, -, /, *)");
                                    break;
                            }
                        } else{
                            System.out.println("throws Exception //т.к. на вход числа от 1 до 10 включительно");
                    }
                    } else{
                        System.out.println("throws Exception //т.к. на вход числа от 1 до 10 включительно");
                    }
                }
            }
        } else if(3 > words.length){
            System.out.println("throws Exception //т.к. строка не является математической операцией");
        } else{
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
    }
}
