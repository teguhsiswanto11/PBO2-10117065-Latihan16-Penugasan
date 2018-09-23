package pbo2.pkg10117065.latihan16.penugasan;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : 
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
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        
        // variabel c setelah dijumlahkan seperti diatas akan tersimpan
        c += a;
        System.out.println("c += a = " + c);
        
        // variabel c setelah dijumlahkan seperti diatas akan tersimpan
        c -= a;
        System.out.println("c -= a = " + c);
        
        // variabel c setelah dijumlahkan seperti diatas akan tersimpan
        c *= a;
        System.out.println("c *= a = " + c);
        
        // buat variabel baru || variabel yg sebelumnya tidak berlaku
        a =  10;
        c =  15;
        c /=  a;
        System.out.println("c /= a = " + c);
        
        a =  10;
        c =  15;
        c %=  a;
        System.out.println("c %= a = " + c);
        
        //  101 digeser 2 bit ke kiri -> 10100 (16+4=20)
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        
        //  101 digeser 2 bit ke kanan -> 00101 (4+1=5)
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        
        //  101 digeser 2 bit ke kanan -> 00101 (4+1=5)
        c >>= a;
        System.out.println("c >>= a = " + c);
        
        //  0101 & 1010 = 0 maka setiap bit dibandingkan dengan logika AND
        c &= a;
        System.out.println("c &= a = " + c);
        
        //  1010 ^ 1010 maka setiap bit dibandingkan dengan logika XOR
        c ^= a;
        System.out.println("c ^= a = " + c);
        
        // 1010 | 1010 = 1010 (10)maka setiap bit dibandingkan dengan logika OR
        c |= a;
        System.out.println("c |= a = " + c);
        
        
    }
    
}
