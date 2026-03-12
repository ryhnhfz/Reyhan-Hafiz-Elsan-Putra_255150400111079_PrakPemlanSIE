public class Mobil {

    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private int jarakTempuh;
    private double kecepatanMS;
    
    public void setNopol(String n) {
        nopol = n;
    }
    
    public void setWarna(String s) {
        warna = s;
    }

    public void setMerk(String m) {
        merk = m;
    }   

    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public void setJarakTempuh (int j){
        jarakTempuh = j;
    }

    public void hitungJarak(int waktu) {
        jarakTempuh = kecepatan * waktu;
    }

    public void ubahKecepatanMeterPerSecond() {
        kecepatanMS = kecepatan / 3.6;
    }
    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memililki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
        System.out.println("Kecepatan mobil dalam meter per second: " + kecepatanMS + " m/s");
        System.out.println("jarak tempuh mobil " + jarakTempuh + " km");
    }
}