public class Package implements Comparable<Package> {
    int idPaket;
    String namaPelanggan;
    String  tipePengiriman;
    int  alamatPengiriman;
    String tanggalPengiriman;

    public Package(int idPaket, String namaPelanggan, int  alamatPengiriman, String tanggalPengiriman, String  tipePengiriman) {
        this.idPaket = idPaket;
        this.namaPelanggan = namaPelanggan;
        this. tipePengiriman =  tipePengiriman;
        this. alamatPengiriman =  alamatPengiriman;
        this.tanggalPengiriman = tanggalPengiriman;
    }

    public int getPriority() {
        switch (tanggalPengiriman) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            case "kilat":
                return 1;
            case "Same Day":
                return 0;
            default:
                return 0;
        }
    }
    

    @Override
    public String toString() {
        return "ID Paket: " + idPaket + " namaPelanggan: " + namaPelanggan + " alamatPelanggan: " +  tipePengiriman;
    }

    @Override
    public int compareTo(Package other) {
        int paket = this.getPriority() + this. alamatPengiriman;
        int otherPackage = other.getPriority() + other. alamatPengiriman;
        
        if (paket < otherPackage) {
            return -1;
        } else if (paket > otherPackage) {
            return 1;
        } else {
            return 0;
        }
    }
}
