package lt.niko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite asmens koda (11 zenklu)");
        String asmensKodas = scanner.next();

        int s = 0;
        int t;

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                t = Integer.parseInt(asmensKodas.substring(i, i + 1)) * (i - 8);
//                s = s + t;
            } else {
                t = Integer.parseInt(asmensKodas.substring(i, i + 1)) * (i + 1);
//                s = s + t;
            }
            s = s + t;
            System.out.println(t);
        }
        int k;

        System.out.println("s: " + s);

        if (s % 11 == 10) {
            s = 0;
            for (int i = 0; i < 10; i++) {
                if (i > 6) {
                    t = Integer.parseInt(asmensKodas.substring(i, i + 1)) * (i - 6);
//                    s = s + t;
                } else {
                    t = Integer.parseInt(asmensKodas.substring(i, i + 1)) * (i + 3);
//                    s = s + t;
                }
                s = s + t;
                System.out.println(t);
            }
            System.out.println(s);
            if (s % 11 == 10) {
                k = 0;
            } else {
                k = s % 11;
            }
        } else {
            k = s % 11;
        }

        System.out.println("k: " + k);

        scanner.close();
    }
}
