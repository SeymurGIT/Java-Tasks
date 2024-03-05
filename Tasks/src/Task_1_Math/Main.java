package Task_1_Math;

import java.awt.desktop.SystemEventListener;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        UnitEqualsHundreds(232);
//        System.out.println();
//
//        var res = DigitSum(543);
//        System.out.print("Digitlerin cemi:" + res);
//        System.out.println();
//
//
//        var min = Min(-900, 43, 754);
//        System.out.print("3 eded arasinda minimum eded" + min);
//        System.out.println();
//
//
//        boolean result = CompareDigits(532, 107);
//        System.out.print("Digitlerin muqayisesi:" + result);
//        System.out.println();
//
//        ItHasTwoDigits(932);
//
//        var sum = Sum(2, 1);
//        System.out.print("Iki ededin cemi:" + sum);
//        System.out.println();
//
//        SignCheck((byte) 10, (byte) 0);
//
//        UnitsEqualTens(223);
//
//        var remainder = WeightRemainder(532, 43);
//        System.out.println(remainder);
    }

    // Task 1
    public static int Sum(int x, int y) {
        return x + y;
    }

    public static void UnitsEqualTens(int eded) {
        /*
          meselen 532
          units - 2
          tens - 30 (yeni 3)

          532 % 10=2(units)
          532/10 = 53
          53%10 = 3(tens)

         */

        if (eded % 10 == ((eded / 10) % 10)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //Task 2
    public static void FullName(String ad, String soyad) {
        System.out.println("My name is" + ad + "and surname is" + soyad);
    }

    public static void CheckBigger(byte num1, byte num2, byte num3) {
        var sum = num1 + num2 + num3;

        if (sum > 300) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    // Task 3
    public static int Min(int x, int y, int z) {
        int min;

        if (x < y) {
            if (x < z) {
                min = x;
            } else {
                min = z;
            }
        } else {
            if (y < z) {
                min = y;
            } else {
                min = z;
            }
        }
        return min;
    }

    public static void UnitEqualsHundreds(int eded) {
        if (!(eded >= 100)) {
            System.out.println("Zehmet olmasa 3 reqemli eded yazin");
            return;
        }
        /*
         972
         units - 2
         tens - 7
         hundreds - 9
         */
        if (eded % 10 == eded / 100) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //task 4
    public static int WeightRemainder(int w1, int w2) {

        if (w2 > 0 && w1 > w2) {
            return w1 % w2;
        } else if (w1 > 0 && w2 > w1) {
            return w2 % w1;
        } else {
            return 0;
        }
    }

    //task 7
    public static int OddNumber(int number) {
        if(number < 0) {
            return number;
        }
        return 0;
    }

    public static void MultipComparison(byte num1, byte num2, byte num3, byte num4) {
        var product = num1 * num2;
        var product2 = num3 * num4;

        if (product > product2) {
            System.out.println("yes");
        }
    }

    //task 9
    public static int Multiplication(byte num1, byte num2) {

        int sum = 0;
        int multiplication = 1;
        if (num1 > num2) {
            sum += num1 + num2;
            return sum;
        }
        multiplication = num1 * num2;
        return multiplication;
    }

    //task 12
    public static int DigitSum(int eded) {

        /*
        digits sum yeni 872 olanda 8+7+2
         */
        int sum = 0;
        while (eded != 0) {
            sum = eded % 10;
            eded /= 10;

        }
        return sum;
    }

    //task 10
    public static boolean CompareDigits(int eded1, int eded2) {

        int sum1 = 0;
        int sum2 = 0;
        while (eded1 != 0 && eded2 != 0) {
            sum1 += eded1 % 10;
            sum2 += eded2 % 10;
            eded1 /= 10;
            eded2 /= 10;
        }
        if (sum1 > sum2) {
            return true;
        } else if (sum1 < sum2) {
            return false;
        } else {
            return false;
        }

    }

    //task 11
    public static void ItHasTwoDigits(int number) {
        /*
        99
        99%100
         */
        if ((number % 100) < 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //task 12
    public static void SumComparison(byte a, byte b, byte c, byte d) {
        var sum1 = a + b;
        var sum2 = c + d;

        if (sum1 > sum2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    //task 13
    public static void SignCheck(byte a, byte b) {
        if (a < 0 && b < 0) {
            System.out.println("minus");
        } else if (a > 0 && b > 0) {
            System.out.println("positive");
        } else {
            if (a == 0 || b == 0) {
                System.out.println("biri sifirdir");
            } else {
                System.out.println("plus and minus");
            }
        }
    }

}


