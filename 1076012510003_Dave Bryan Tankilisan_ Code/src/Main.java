
public class Main {
    public static void main(String[] args) {


        Kendaraan[] daftarKendaraan = new Kendaraan[4];


        daftarKendaraan[0] = new BusKampus("Bus Kampus A", 40);
        daftarKendaraan[1] = new MobilOp("Mobil Operasional B", 5);
        daftarKendaraan[2] = new SepedaListrik("Sepeda Listrik C", 2);


        daftarKendaraan[3] = new Kendaraan("Kendaraan Event", 10) {
            @Override
            void bergerak() {
                System.out.println(nama + " hanya digunakan saat acara khusus kampus.");
            }

            @Override
            void info() {
                System.out.println("Kendaraan Event  | Nama: " + nama + " | Kapasitas: " + kapasitas);
            }
        };


        System.out.println("======================================");
        System.out.println("     SISTEM KENDARAAN KAMPUS");
        System.out.println("======================================\n");


        for (Kendaraan k : daftarKendaraan) {
            k.info();
            k.bergerak();
            System.out.println("--------------------------------------");
        }

        System.out.println("\nProgram selesai.");
    }
}