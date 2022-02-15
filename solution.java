/*
  Ödev
  Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
  
  Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi 
  sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme 
  işleminde sayının son değerini ekrana yazdırın.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a num: ");
        num = input.nextInt();
        
        pattern(num);
    }
        
    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        } 
        
        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }
    
}
