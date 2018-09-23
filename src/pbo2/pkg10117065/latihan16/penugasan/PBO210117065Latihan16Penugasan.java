package pbo2.pkg10117065.latihan16.penugasan;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menggunakan operator penugasan yang berfungsi untuk 
 * melakukan pengisian data,
 * jadi variabel c bisa berubah-ubah nilainya sesuai dengan hasil operasi 
 * terakhir yang dilakukan oleh variabel c
 * 
 */
public class PBO210117065Latihan16Penugasan {

    public static void main(String[] args) {
        // deklarasi variabel
        int a = 10;
        int b = 20;
        int c = 0;
        
        //output
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c + "\n");
        
        c = a + b; // 20 + 10 = 30
        System.out.println("c = a + b = " + c);
        
        // variabel c setelah dijumlahkan seperti diatas akan tersimpan
        c += a; // 30 + 10 = 40
        System.out.println("c += a = " + c);
        
        // variabel c setelah dijumlahkan seperti diatas akan tersimpan
        c -= a; // 40 - 10 = 30
        System.out.println("c -= a = " + c);
        
        // variabel c setelah dijumlahkan seperti diatas akan tersimpan
        c *= a; // 30 * 10 = 300
        System.out.println("c *= a = " + c);
        
        // buat variabel baru || variabel yg sebelumnya tidak berlaku
        a =  10;
        c =  15;
        
        c /=  a; // 15 / 10 = 1 (kalau di pascal DIV)
        System.out.println("c /= a = " + c);
        
        // buat variabel baru || variabel yg sebelumnya tidak berlaku
        a =  10;
        c =  15;
        
        // 15 mod 10 = 5 (sisa hasil bagi -> %)
        c %=  a;
        System.out.println("c %= a = " + c);
        
        //  101 digeser 2 bit ke kiri -> 10100 (16 + 4 = 20)
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        
        //  20 = 10100 digeser 2 bit ke kanan -> 00101 (4 + 1 = 5)
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        
        //  5 = 101 digeser 2 bit ke kanan -> 001 (isinya = 1)
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        
        //  0101 & 1010 = 0 maka setiap bit dibandingkan dengan logika AND
        c &= a;
        System.out.println("c &= a = " + c);
        
        /*  1010 ^ 1010 maka setiap bit dibandingkan dengan logika XOR 
        (cari yang sama) */
        c ^= a;
        System.out.println("c ^= a = " + c);
        
        // 1010 | 1010 = 1010 (10) maka setiap bit dibandingkan dengan logika OR
        c |= a;
        System.out.println("c |= a = " + c);
        
        
    }
    
}
