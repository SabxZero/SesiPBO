
public class PersegiPanjang extends sesi4 {
    
    PersegiPanjang (int p, int l) {
        super(p,l);     
    }

    int hitungluaspersegi(){
        int p = super.getP();
        int l = super.getL();
        
        return p * l;
    }
    
    int hitungKelilingpersegi(){
        int p = super.getP();
        int l = super.getL();
        
        return 2 * (p + l);
    }


}
