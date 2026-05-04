class MobilOp extends Kendaraan {

MobilOp(String nama, int kapasitas) {
    super(nama, kapasitas);
    System.out.println("Constructor MobilOp dipanggil");
}

    @Override
    void bergerak() {
        System.out.println(nama + " digunakan untuk operasional kampus.");
    }

    @Override
    void info() {
        System.out.println("Mobil Operasional | Nama: " + nama + " | Kapasitas: " + kapasitas);
    }
}