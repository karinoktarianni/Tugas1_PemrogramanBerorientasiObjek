public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu ", "KUBAR ", 3, 5000.00); /* merupakan upcasting, upcasting akan dilakukan secara internal dan karena upcasting, objek hanya diizinkan untuk mengakses anggota kelas induk dan anggota kelas anak tertentu (metode yang diganti, dll) tetapi tidak semua anggota. */
        Pegawai e = new Gaji("Ini Nama ", "Samarinda ", 2, 2500.00); /*merupakan downcasting, downcasting harus dilakukan secara eksternal dan karena downcasting objek anak dapat memperoleh properti dari objek induk. */
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("");
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();

    }
    
}
