import java.util.ArrayList;
import java.util.Scanner;

public class perpus {
    private static ArrayList<String> bukuDipinjam = new ArrayList<>();
    private static ArrayList<String> dataBuku = new ArrayList<>();
    private static ArrayList<String> dataCD = new ArrayList<>();
    private static ArrayList<String> tanggalPeminjaman = new ArrayList<>();
    private static ArrayList<String> tanggalPengembalian = new ArrayList<>();
    private static final double DENDA_PER_HARI = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        String role = "";
        
        while (true) {
            System.out.println("===========================================");
            System.out.println("      Selamat datang di perpustakaan.    ");
            System.out.println("===========================================");
            System.out.println("Silakan pilih :");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Dosen/Staff");
            System.out.println("3. Login sebagai Pustakawan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    role = "mahasiswa";
                    break;
                case 2:
                    role = "dosen/staff";
                    break;
                case 3:
                    role = "pustakawan";
                    break;
                case 4:
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            loggedIn = false;

            if (!loggedIn) {
                System.out.println("===========================================");
                System.out.println("               LOGIN                     ");
                System.out.println("===========================================");
                System.out.print("Username: ");
                String loginUsername = scanner.next();
                System.out.print("Password: ");
                String loginPassword = scanner.next();
                if (cekLogin(loginUsername, loginPassword, role)) {
                    System.out.println("===========================================");
                    System.out.println("           Login Berhasil                   ");
                    System.out.println("===========================================");
                    loggedIn = true;
                    if (role.equals("pustakawan")) {
                        menupustakawan(scanner);
                    } else {
                        menupeminjam(scanner);
                    }
                } else {
                    System.out.println("===========================================");
                    System.out.println("           Login Gagal                      ");
                    System.out.println("===========================================");
                }
            } else {
                System.out.println("Anda sudah login!");
            }
        }
    }

    private static boolean cekLogin(String username, String password, String role) {
        // Check if the credentials are valid
        if (isValidCredentials(username, password)) {
            // Perform login validation based on username, password, and role
            // For simplicity, always return true in this example
            return true;
        } else {
            // If credentials are invalid, print an error message
            System.out.println("Username and password must have a minimum of 5 characters.");
            return false;
        }
    }
    
    private static void menupeminjam(Scanner scanner) {
        ArrayList<String> dataBukuMahasiswa = new ArrayList<>(dataBuku);

        System.out.println("Silakan pilih tindakan:");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. Pinjam CD");
        System.out.println("3. Pengembalian Buku");
        System.out.println("4. Pengembalian CD");
        System.out.println("5. Mencari Buku");
        System.out.println("6. Mencari CD");
        System.out.println("7. Perpanjang Peminjaman");
        System.out.println("8. Keluar");
        System.out.print("Masukkan pilihan Anda: ");


        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                pinjamBuku(dataBukuMahasiswa);
                break;
            case 2:
                pinjamCD(dataCD);
                break;
            case 3:
                pengembalianBuku();
                break;
            case 4:
                pengembalianCD();
                break;
            case 5:
                cariBuku(dataBukuMahasiswa);
                break;
            case 6:
                cariCD(dataCD);
                break;
            case 7:
                perpanjangPeminjaman();
                break;
            case 8:
                exit();
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void pinjamCD(ArrayList<String> dataCD) {
        System.out.println("Daftar CD yang Tersedia:");
        tampilkanSemuaDataCD(dataCD);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor CD yang ingin Anda pinjam atau ketik 0 untuk kembali: ");
        int nomorCD = scanner.nextInt();
        if (nomorCD == 0) {
            return;
        }
        boolean tersedia = cekKetersediaanCD(dataCD, nomorCD);
        if (tersedia) {
            String judulCD = dataCD.get(nomorCD - 1);
            bukuDipinjam.add(judulCD);
            System.out.println("Anda telah meminjam CD dengan judul '" + judulCD + "'.");
        } else {
            System.out.println("CD yang Anda pilih tidak tersedia. Silakan pilih CD lain.");
        }
    }

    private static boolean cekKetersediaanCD(ArrayList<String> dataCD, int nomorCD) {
        if (nomorCD >= 1 && nomorCD <= dataCD.size()) {
            String judulCD = dataCD.get(nomorCD - 1);
            return !bukuDipinjam.contains(judulCD);
        }
        return false;
    }

    private static void pengembalianCD() {
        Scanner scanner = new Scanner(System.in);
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada CD yang sedang dipinjam.");
        } else {
            System.out.println("Daftar CD yang Sedang Dipinjam:");
            for (int i = 0; i < bukuDipinjam.size(); i++) {
                System.out.println((i + 1) + ". " + bukuDipinjam.get(i));
            }
            System.out.print("Masukkan nomor CD yang akan dikembalikan: ");
            int nomorCD = scanner.nextInt();
            if (nomorCD >= 1 && nomorCD <= bukuDipinjam.size()) {
                String CDdikembalikan = bukuDipinjam.remove(nomorCD - 1);
                System.out.println("CD dengan judul '" + CDdikembalikan + "' telah dikembalikan.");
            } else {
                System.out.println("Nomor CD tidak valid.");
            }
        }
    }

    private static void cariCD(ArrayList<String> dataCD) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul CD yang ingin Anda cari: ");
        String judulCari = scanner.nextLine();

        boolean ditemukan = false;
        for (String judul : dataCD) {
            if (judul.toLowerCase().contains(judulCari.toLowerCase())) {
                System.out.println("CD dengan judul '" + judul + "' ditemukan.");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("CD dengan judul '" + judulCari + "' tidak ditemukan.");
        }
    }

    private static void pinjamBuku(ArrayList<String> dataBuku) {
        System.out.println("Daftar Buku yang Tersedia:");
        tampilkanSemuaDataBuku(dataBuku);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor buku yang ingin Anda pinjam atau ketik 0 untuk kembali: ");
        int nomorBuku = scanner.nextInt();
        if (nomorBuku == 0) {
            return;
        }
        boolean tersedia = cekKetersediaanBuku(dataBuku, nomorBuku);
        if (tersedia) {
            String judulBuku = dataBuku.get(nomorBuku - 1);
            bukuDipinjam.add(judulBuku);
            System.out.println("Anda telah meminjam buku dengan judul '" + judulBuku + "'.");
        } else {
            System.out.println("Buku yang Anda pilih tidak tersedia. Silakan pilih buku lain.");
        }
    }

    private static boolean cekKetersediaanBuku(ArrayList<String> dataBuku, int nomorBuku) {
        if (nomorBuku >= 1 && nomorBuku <= dataBuku.size()) {
            String judulBuku = dataBuku.get(nomorBuku - 1);
            return !bukuDipinjam.contains(judulBuku);
        }
        return false;
    }

    private static void pengembalianBuku() {
        System.out.println("Anda memilih untuk mengembalikan buku.");
    }

    private static void cariBuku(ArrayList<String> dataBuku) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin Anda cari: ");
        String judulCari = scanner.nextLine();

        boolean ditemukan = false;
        for (String judul : dataBuku) {
            if (judul.toLowerCase().contains(judulCari.toLowerCase())) {
                System.out.println("Buku dengan judul '" + judul + "' ditemukan.");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku dengan judul '" + judulCari + "' tidak ditemukan.");
        }
    }

    private static void perpanjangPeminjaman() {
        System.out.println("Anda memilih untuk memperpanjang peminjaman buku.");
    }

    private static void menupustakawan(Scanner scanner) {
        System.out.println("Silakan pilih tindakan:");
        System.out.println("1. Claim Pengembalian");
        System.out.println("2. History Peminjaman");
        System.out.println("3. Mengelola Data Buku");
        System.out.println("4. Menambah Data CD");
        System.out.println("5. Cek Ketersediaan Buku");
        System.out.println("6. Cek Ketersediaan CD");
        System.out.println("7. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();
    
        switch (pilihan) {
            case 1:
                claimPengembalian();
                break;
            case 2:
                historyPeminjaman();
                break;
            case 3:
                kelolaDataBuku(scanner);
                break;
            case 4:
                tambahDataCD(scanner);
                break;
            case 5:
                cekKetersediaan();
                break;
            case 6:
                cekKetersediaanCD();
                break;
            case 7:
                exit();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
    

    private static void Exit() {
        System.out.println("Terima kasih! Sampai jumpa lagi.");
        System.exit(0);
    }

    private static void claimPengembalian() {
        Scanner scanner = new Scanner(System.in);
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
        } else {
            System.out.println("Daftar Buku yang Sedang Dipinjam:");
            for (int i = 0; i < bukuDipinjam.size(); i++) {
                System.out.println((i + 1) + ". " + bukuDipinjam.get(i));
            }
            System.out.print("Masukkan nomor buku yang akan dikembalikan: ");
            int nomorBuku = scanner.nextInt();
            if (nomorBuku >= 1 && nomorBuku <= bukuDipinjam.size()) {
                String bukuDikembalikan = bukuDipinjam.remove(nomorBuku - 1);
                System.out.println("Buku dengan judul '" + bukuDikembalikan + "' telah dikembalikan.");
                beriDendaKeterlambatan(scanner, nomorBuku); // Call the method to calculate fines
            } else {
                System.out.println("Nomor buku tidak valid.");
            }
        }
    }

    private static void beriDendaKeterlambatan(Scanner scanner, int nomorPeminjaman) {
        System.out.print("Masukkan jumlah hari keterlambatan: ");
        int daysLate = scanner.nextInt();

        double denda = daysLate * DENDA_PER_HARI;
        System.out.println("Denda yang harus dibayar: Rp " + denda);
    }

    private static void historyPeminjaman() {
        ArrayList<String> history = new ArrayList<>();
        history.add("Buku 1- Dipinjam oleh Mahasiswa A");
        history.add("Buku 2 - Dipinjam oleh Mahasiswa B");
        history.add("Buku 3 - Dipinjam oleh Mahasiswa C");

        if (history.isEmpty()) {
            System.out.println("Tidak ada riwayat peminjaman.");
        } else {
            System.out.println("Riwayat Peminjaman:");
            for (String entry : history) {
                String[] splitEntry = entry.split(" - ");
                System.out.println(splitEntry[0]);
            }
        }
    }

    private static void kelolaDataBuku(Scanner scanner) {
        boolean continueManaging = true;
        while (continueManaging) {
            System.out.println("Menu Pengelolaan Data Buku");
            System.out.println("1. Tambah Data Buku");
            System.out.println("2. Tampilkan Semua Data Buku");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahDataBuku(scanner);
                    break;
                case 2:
                    tampilkanSemuaDataBuku(dataBuku);
                    break;
                case 3:
                    continueManaging = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void tambahDataBuku(Scanner scanner) {
        System.out.print("Masukkan jumlah buku yang ingin ditambahkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.print("Masukkan judul buku: ");
            String judul = scanner.nextLine();
            dataBuku.add(judul);
        }

        System.out.println("Data buku berhasil ditambahkan.");
    }

    private static void tampilkanSemuaDataBuku(ArrayList<String> dataBuku) {
        if (dataBuku.isEmpty()) {
            System.out.println("Tidak ada data buku.");
        } else {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < dataBuku.size(); i++) {
                System.out.println((i + 1) + ". " + dataBuku.get(i));
            }
        }
    }

    private static void cekKetersediaan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan judul buku yang ingin diperiksa ketersediaannya: ");
        String judulBuku = scanner.nextLine();

        if (bukuDipinjam.contains(judulBuku)) {
            System.out.println("Buku dengan judul '" + judulBuku + "' tersedia.");
        } else {
            System.out.println("Buku dengan judul '" + judulBuku + "' tidak tersedia.");
        }
    }

    private static void tambahDataCD(Scanner scanner) {
        System.out.print("Masukkan jumlah CD yang ingin ditambahkan: ");
        int jumlahCD = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahCD; i++) {
            System.out.print("Masukkan judul CD: ");
            String judulCD = scanner.nextLine();
            dataCD.add(judulCD);
        }
        System.out.println("Data CD berhasil ditambahkan.");
    }

    private static void exit() {
    }

    private static boolean isValidCredentials(String username, String password) {
        // Check if both username and password meet the minimum length requirement
        return username.length() >= 5 && password.length() >= 5;
    }
    
    private static void cekKetersediaanCD() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan judul CD yang ingin diperiksa ketersediaannya: ");
        String judulCD = scanner.nextLine();
    
        if (dataCD.contains(judulCD)) {
            System.out.println("CD dengan judul '" + judulCD + "' tersedia.");
        } else {
            System.out.println("CD dengan judul '" + judulCD + "' tidak tersedia.");
        }
    }
    
    private static void tampilkanSemuaDataCD(ArrayList<String> dataCD) {
        if (dataCD.isEmpty()) {
            System.out.println("Tidak ada data CD.");
        } else {
            System.out.println("Daftar CD:");
            for (int i = 0; i < dataCD.size(); i++) {
                System.out.println((i + 1) + ". " + dataCD.get(i));
            }
        }
    }
}


