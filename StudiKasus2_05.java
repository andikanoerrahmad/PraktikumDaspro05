import java.util.Scanner;

public class StudiKasus2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_Mahasiswa, jenis_Kegiatan;
        int jumlah_Dokumen_Yang_Diaploud, peringkat_Juara, status_Pendanaan_PKM;
        int kurang;

        System.out.print("Nama mahasisiwa\t : ");
        nama_Mahasiswa = sc.next();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenis_Kegiatan = sc.next();

        System.out.print("Jumlah dokuman\t : ");
        jumlah_Dokumen_Yang_Diaploud = sc.nextInt();
    }
}
