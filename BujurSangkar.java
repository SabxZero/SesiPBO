
public class BujurSangkar extends sesi4 {
    
    BujurSangkar (int s) {
        super(s);
    }
    
    int hitungluas(){
        int s = super.getS();
        
        return s * s;
    }
    
    int hitungKeliling(){
        int s = super.getS();
        return s + s + s + s;
    }
    
}
