import java.util.Scanner;

public class hitungBangunData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- isikan pilihan ---");
        System.out.println("1. bujursangkar");
        System.out.println("2. persegi panjang");
        
        int pilihan = sc.nextInt();
        if (pilihan == 1){
            BujurSangkar bs = new BujurSangkar(10);
            int luas = bs.hitungluas();
            int keliling = bs.hitungKeliling();
            System.out.println("luas bujur sangkar :" + luas);
            System.out.println("keliling bujur sangkar :" + keliling);
        }
        if (pilihan == 2){
            PersegiPanjang bs = new PersegiPanjang(30,25);
            int luaspersegi = bs.hitungluaspersegi();
            int kelilingpersegi = bs.hitungKelilingpersegi();
            System.out.println("luas persegi panjang :" + luaspersegi);
            System.out.println("keliling persegi panjang :" + kelilingpersegi);
            
        }
        else {
            System.out.println("input ");}
    }
    
}
