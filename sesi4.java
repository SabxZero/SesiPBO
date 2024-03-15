public class sesi4 {
    private int p,l,s;
    
    sesi4 (int s){
        this.s = s;
    }
    
    sesi4(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setpl(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setsisi(int s){
        this.s = s;
    }
    
    int getP(){
        return p;
    }
    
    int getL(){
        return l;
    }
    
    int getS(){
        return s;
    }
}
