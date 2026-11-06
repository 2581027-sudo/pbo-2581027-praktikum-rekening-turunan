public class BankTurunan {
    private static String hasil(boolean berhasil) {
        return berhasil ? "Berhasil" : "Ditolak";
    }

    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro giro = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        tabungan.cetakInfo();
        giro.cetakInfo();

        System.out.println();
        System.out.println("============ TRANSAKSI ============");
        System.out.printf("%-25s: %s%n", "Tabungan tarik 1.500.000", hasil(tabungan.tarik(1500000)));
        System.out.printf("%-25s: %s%n", "Giro tarik 500.000", hasil(giro.tarik(500000)));
        System.out.printf("%-25s: %s%n", "Giro tarik 300.000", hasil(giro.tarik(300000)));
        System.out.printf("%-25s: %s%n", "Giro setor 100.000", hasil(giro.setor(100000)));
        int bunga = tabungan.tambahBunga();
        System.out.printf("%-25s: %s%n", "Bunga tabungan", Rekening.formatRupiah(bunga));

        System.out.println();
        System.out.println("========== REKENING AKHIR =========");
        tabungan.cetakInfo();
        giro.cetakInfo();
    }
}