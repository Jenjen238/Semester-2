public class Rasional {
private int pembilang, penyebut; 
public Rasional(){ 
pembilang=0; 
penyebut=0; 
} 
public Rasional(int pbl, int pyb){ 
pembilang=pbl; 
penyebut=pyb; 
} 
//mengecek suatu bilangan adalah rasional atau bukan 
public boolean isRasional(){ 
    return (penyebut!= 0);

} 
//menyederhanakan bilangan rasional 
public void Sederhana(){ 
int temp, A, B; 
if (penyebut ==0){ 
return; 
} 
A = (pembilang<penyebut) ? penyebut:pembilang; 
B = (pembilang<penyebut) ? pembilang:penyebut; 
while (B != 0){ 
temp= A % B; 
A = B; 
B = temp; 
} 
 
pembilang /=A; 
penyebut /=A; 
} 
    public double Cast(){ 
    return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }

//oprator > 
        public boolean moreThan (Rasional A){ 
        return (pembilang * A.penyebut > penyebut * A.pembilang ); 
        } 

        public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
        }
        public boolean lessOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
        }
        public boolean moreOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
        }
        // ── operator -= (pengurangan) ────────────────────────────
        public void unaryMinus(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    // ── operator *= (perkalian) ──────────────────────────────
    public void unaryKali(Rasional A) {
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
    }

    // ── operator /= (pembagian) ──────────────────────────────
    public void unaryBagi(Rasional A) {
        if (A.pembilang == 0) {
            System.out.println("Error : Tidak bisa membagi dengan nol!");
            return;
        }
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
    }


//operator Unary- ---> A = -A 
public void negasi(){ 
pembilang = - pembilang; 
} 
//operator unary += \ 
public void unaryPlus(Rasional A){ 
pembilang = pembilang * A.penyebut + penyebut * A.pembilang; 
penyebut *=A.penyebut; 
} 
public void cetak(){ 
System.out.println(pembilang + "/" + penyebut); 
} 
}
