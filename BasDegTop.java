import java.util.Scanner;
public class BasDegTop {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int number,basDeg,tempNumber,total=0;
        System.out.print("Bir Sayi Giriniz:");
         number=in.nextInt();
         tempNumber=number;
        while(tempNumber!=0) {
            basDeg = tempNumber % 10;
            total += basDeg;
            tempNumber/=10;
        }
        System.out.print("Basamak Deger Toplami:"+total);
    }
}
