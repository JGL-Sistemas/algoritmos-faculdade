
package estacionamento;

public class Estacionamento {
    public static void main(String args[]) {
        conectar bd = new conectar();
        new base().setVisible(true);
        new Carros(bd);
        new Clientes(bd);
        new Vagas(bd);
        new Precos(bd);
        new estacionamentos(bd);
        new Alugueis(bd);
    }

    Estacionamento(conectar bd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
