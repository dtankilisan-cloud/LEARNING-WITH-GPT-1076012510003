// ABSTRACT CLASS
abstract class Kendaraan {
    String nama;
    int kapasitas;

    // Constructor
    Kendaraan(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    // Abstract methods
    abstract void bergerak();
    abstract void info();
}

