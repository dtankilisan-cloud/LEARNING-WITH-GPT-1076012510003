// CLASS TURUNAN 3
class SepedaListrik extends Kendaraan {

    SepedaListrik(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " berjalan menggunakan tenaga listrik.");
    }

    @Override
    void info() {
        System.out.println("Sepeda Listrik   | Nama: " + nama + " | Kapasitas: " + kapasitas);
    }
}
