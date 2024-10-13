

package modell;

import java.util.ArrayList;



public class EmberModell {
    
    private String nev;
    private int kor;
    private ArrayList<String> nyelvek;
    private boolean szuletesnap;
    
    public EmberModell(String nev, int kor){
        this(nev, kor, new ArrayList<>(), false);
    };
    
    public EmberModell(String nev, int kor, ArrayList<String> nyelvek){
        this(nev, kor, nyelvek, false);
    };
    
    public EmberModell(String nev, int kor, boolean szuletesnap){
        this(nev, kor, new ArrayList<>(), szuletesnap);
    };
    
    public EmberModell(String nev, int kor, ArrayList<String> nyelvek, boolean szuletesnap){
        this.nev = nev;
        this.nyelvek = nyelvek;
        this.szuletesnap = szuletesnap;
        
        this.kor = this.szuletesnap ? kor++ : kor;
    };
    
    
    
    public void oregedik(){
        this.kor++;
    };
    
    public void nyelvetTanul(String nyelv){
        this.nyelvek.add(nyelv);
    };
    
    
    public String getBemutatkozasSzoveg(){
        
        String szoveg = "Az én nevem:";
        szoveg += this.nev + "\nA korom:";
        szoveg += this.kor;
        
        if(nyelvek.size() > 0){
            szoveg += nyelvek.size() == 1
                    ? "\nEzt a nyelvet beszélem:"
                    : "\nEzeket a nyelveket beszélem";
            
            szoveg += this.nyelvek;
        };
        
        return szoveg;
    };
}
