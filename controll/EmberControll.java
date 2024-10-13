

package controll;

import modell.EmberModell;
import view.EmberView;




public class EmberControll {
    
    EmberModell modell;
    EmberView view;
    
    
    public EmberControll(){
        
        this.modell = new EmberModell("Ákos", 21, true);
        this.view = new EmberView();
        
        this.view.kiír(this.modell.getBemutatkozasSzoveg());
        
        
        
        modell.oregedik();
        modell.nyelvetTanul("Angol");
        this.view.kiír(this.modell.getBemutatkozasSzoveg());
        this.view.kiír("\n");
        
        
        
        
        
        modell.nyelvetTanul("Francia");
        this.view.kiír(this.modell.getBemutatkozasSzoveg());
        this.view.kiír("\n");
    };
}
