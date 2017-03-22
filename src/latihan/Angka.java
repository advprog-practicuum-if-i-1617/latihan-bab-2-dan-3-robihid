package latihan;
public class Angka {
    private final String[] huruf;
    public Angka() {
        this.huruf = new String[]{"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    }
    public String ubah(int angka) {
        if (angka < 12) {
            return huruf[angka];
        }
        if (angka >= 12 && angka < 20) {
            return huruf[angka % 10] + " belas";
        }
        if (angka >= 20 && angka < 100) {
            return ubah(angka / 10) + " puluh " + huruf[angka % 10];
        }
        if (angka >= 100 && angka < 200) {
            return "seratus " + ubah(angka % 100);
        }
        if (angka >= 200 && angka < 1000) {
            return ubah(angka / 100) + " ratus " + ubah(angka % 100);
        }
        if (angka == 1000) {
            return "seribu";
        }
        return "";
    }
    public String ubah(String huruf) {
        for (int i = 0; i <= 1000; i++) {
            if (huruf.equalsIgnoreCase(ubah(i))) {
                return Integer.toString(i);
            } 
            else if (huruf.equalsIgnoreCase(ubah(i).replaceAll("s ", "s"))) {
                return Integer.toString(i);
            }
            else if (huruf.equalsIgnoreCase(ubah(i).replaceAll("h ", "h"))) {
               return Integer.toString(i);
            }
            else if (huruf.equalsIgnoreCase("nol")) {
                return Integer.toString(0);
            } 
        }
        return "tidak terdefinisi";
    }
}
