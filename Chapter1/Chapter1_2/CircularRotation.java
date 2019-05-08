package Chapter1.Chapter1_2;

import java.util.Scanner;
public class CircularRotation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("s:");
        String m = s.nextLine();
        System.out.println("m:");
        String n = s.nextLine();
        if (m.length() == n.length() && m.concat(m).indexOf(n)>=0){
            System.out.println(m + "is the circular rotation of " + n);
        }
        else System.out.println(m + "is not the circular rotation of " + n);
    }
}
