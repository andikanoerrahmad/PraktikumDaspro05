import java.util.Scanner;

public class StudiKasus1_05 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup \t: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar \t: ");
        uangBayar = sc.nextInt();  

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga            \t: Rp. " + totalHarga);
        System.out.println("Diskon                 \t: Rp. " + diskon);
        System.out.println("Total Bayar            \t: Rp. " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian                \t: Rp. " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. " + kurang);
        }
    }
}
