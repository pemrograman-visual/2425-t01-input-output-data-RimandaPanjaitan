// 12S24009 - Kezia Vania Pasaribu
// 12S24049 - Rimanda Santa Risa Panjaitan 


import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulBuku, penulis, penerbit, formatBukuElektranik;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        iSBN = input.nextLine();
        judulBuku = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextInt();
        penerbit = input.nextLine();
        formatBukuElektranik = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + minimumMargin + "|" + stok + "|" + rating + "|");
    }
}
