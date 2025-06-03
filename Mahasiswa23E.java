
import java.util.Scanner;



public class Mahasiswa23E {

    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("1.Tampilkan Data Mahasiswa");
        System.out.println("2.Input Data Mahasiswa");
        System.out.println("3.Cari Data Mahasiswa");
        System.out.println("4.Ubah Data Mahasiswa");
        System.out.println("5.Hapus Data Mahasiswa");
        System.out.println("6.Keluar");
        System.out.println("-------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda: ");
        int pilihan = sc.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Tampilkan Data Mahasiswa");
            Mahasiswa m23 = new Mahasiswa();
            m23.readMahasiswa();
            return;
        }
        if (pilihan == 2) {
            System.out.println("Input Data Mahasiswa");
            Mahasiswa m23 = new Mahasiswa();
            m23.insertMahasiswa("20230040044", "Dapid", "Sunda", "L");
            m23.readMahasiswa();
            return;
        }

        if (pilihan == 3) {
            System.out.println("Cari Data Mahasiswa");
            Mahasiswa m23 = new Mahasiswa();
            m23.readMahasiswa();
            System.out.println("Masukkan NIM yang ingin dicari: ");
            String nim = sc.next();
            boolean result = m23.findMahasiswa(nim);
            if (result) {
                System.out.println("Nim Sudah Pakai.");
            } else {
                System.out.println("Nim Tidak Ditemukan.");
            }
            return;
        }
        if (pilihan == 4) {
            System.out.println("Ubah Data Mahasiswa");
            Mahasiswa m23 = new Mahasiswa();
            m23.readMahasiswa();
            System.out.println("Masukkan NIM yang ingin diubah: ");
            String nim = sc.next();
            m23.updateMahasiswa("Mugi", "Jakarta", "L", nim);
            m23.readMahasiswa();
            return;
        }
        if (pilihan == 5) {
            System.out.println("Hapus Data Mahasiswa");
            Mahasiswa m23 = new Mahasiswa();
            m23.readMahasiswa();
            System.out.println("Masukkan NIM yang ingin dihapus: ");
            String nim = sc.next();
            m23.deleteMahasiswa(nim);
            m23.readMahasiswa();
            return;
        }
        if (pilihan == 6) {
            System.out.println("Keluar");
            return;
        }
    }
}    