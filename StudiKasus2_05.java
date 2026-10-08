import java.util.Scanner;

public class StudiKasus2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_Mahasiswa, jenis_Kegiatan;
        int jumlah_Dokumen_Yang_Diaploud, peringkat_Juara, status_Pendanaan_PKM;
        int kurang;

        System.out.print("Nama mahasisiwa\t : ");
        nama_Mahasiswa = sc.next();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenis_Kegiatan = sc.next();

        System.out.print("Jumlah dokumen\t : ");
        jumlah_Dokumen_Yang_Diaploud = sc.nextInt();

           if (jenis_Kegiatan.equalsIgnoreCase("BELMAWA") || jenis_Kegiatan.equalsIgnoreCase("BAKORMA") || jenis_Kegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Masukkan Peringkat Juara (1/2/3, 0 jika bukan juara) : ");
            peringkat_Juara = sc.nextInt();
            
            if (jumlah_Dokumen_Yang_Diaploud < 4) {
                System.out.println("--- Hasil ---");
                System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
                System.out.println("Status Dana         : TIDAK DIBERIKAN");
                System.out.println("Alasan              : Dokumen Tidak Lengkap");
                System.out.println("Dokumen Kurang      : " + (4 - jumlah_Dokumen_Yang_Diaploud));
            } else {
                if (peringkat_Juara >= 1 && peringkat_Juara <= 3) {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
                    System.out.println("Status Dana         : DIBERIKAN");
                    System.out.println("Alasan              : Mendapat juara " + peringkat_Juara + " dan dokumen lengkap");
                } else {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
                    System.out.println("Status Dana         : TIDAK DIBERIKAN");
                    System.out.println("Alasan              : Bukan Juara 1, 2, atau 3");
                }
            }
        } else if (jenis_Kegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan Status pendanaan PKM (1 = Lolos, 0 = Tidak Lolos) : ");
            status_Pendanaan_PKM = sc.nextInt();

            if (jumlah_Dokumen_Yang_Diaploud < 4) {
                System.out.println("--- Hasil ---");
                System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
                System.out.println("Status Dana         : TIDAK DIBERIKAN");
                System.out.println("Alasan              : Dokumen Tidak Lengkap");
                System.out.println("Dokumen Kurang      : " + (4 - jumlah_Dokumen_Yang_Diaploud));
            } else {
                if (status_Pendanaan_PKM == 1) {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
                    System.out.println("Status Dana         : DIBERIKAN");
                    System.out.println("Alasan              : PKM lolos pendanaan dan dokumen lengkap");
                } else {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
                    System.out.println("Status Dana         : TIDAK DIBERIKAN");
                    System.out.println("Alasan              : PKM tidak lolos pendanaan");
                }
            }
        } else {
            System.out.println("--- Hasil ---");
            System.out.println("Nama Mahasiswa      : " + nama_Mahasiswa);
            System.out.println("Status Dana         : TIDAK DIBERIKAN");
            System.out.println("Alasan              : Jenis Kegiatan Tidak Valid");   
            }
    }
}
