

package controll;

import modell.EmberModell;
import view.EmberView;




public class EmberControll {
    
    EmberModell modell;
    EmberView view;
    
    
    public EmberControll(){
        
        this.modell = new EmberModell("�kos", 21, true);
        this.view = new EmberView();
        
        this.view.ki�r(this.modell.getBemutatkozasSzoveg());
        
        
        
        modell.oregedik();
        modell.nyelvetTanul("Angol");
        this.view.ki�r(this.modell.getBemutatkozasSzoveg());
        this.view.ki�r("\n");
        
        
        
        
        
        modell.nyelvetTanul("Francia");
        this.view.ki�r(this.modell.getBemutatkozasSzoveg());
        this.view.ki�r("\n");
    };
}
