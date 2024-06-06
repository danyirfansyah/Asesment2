import java.util.PriorityQueue;

public class PackageQueue {
    PriorityQueue<Package> queue;

    public PackageQueue() {
        queue = new PriorityQueue<>();
    }

    public void terimaPaket(int idPaket, String namaPelanggan, int alamatPengiriman, String tanggalPengiriman, String  tipePengiriman) {
        Package paket = new Package(idPaket, namaPelanggan, alamatPengiriman, tanggalPengiriman,  tipePengiriman);
        queue.add(paket);
    }

    public void getUrutanPaket() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
