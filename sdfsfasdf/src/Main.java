import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayiyi girniz: ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\3-vurma\4-Bölme");
        System.out.print("Seciniz ");

        select = input.nextInt();

        switch (select) {
            case 1:

                System.out.println("Toplam: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Cikarma: " + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) {
                    System.out.println("Bolme " + (n1 / n2));

                } else {
                    System.out.println("0 a bolunemez");
                }


            case 4:
                System.out.println("vurma: " + (n1 * n2));
                break;
            default:
                System.out.println("ishlem basharisiz");
        }


    }


}

