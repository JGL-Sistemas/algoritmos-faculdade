/*
* Soma de Dois Valores
* Autor: Dieisson Martins
*/
package calculos;
import javax.swing.JOptionPane;

public class Calculos{
    
    private String var1;
    private String var2;
    
    public static void main(String[] args) {
        Calculos c1 = new Calculos();
        
        String v1 = JOptionPane.showInputDialog("Informe valor 1");
        String v2 = JOptionPane.showInputDialog("Informe valor 2");
        
        c1.setVar1(v1);
        c1.setVar2(v2);
        
        JOptionPane.showMessageDialog(null, "Soma: "+c1.soma()+"\n" );
    }
    
    public String getVar1() {
        return var1;
    }
    
    public String getVar2() {
        return var2;
    }
    
    public void setVar1(String v1){
        this.var1 = v1;
    }
    
    public void setVar2(String v2){
        this.var2 = v2;
    }
    public String soma(){
        return this.var1 + this.var2; 
    }

}
