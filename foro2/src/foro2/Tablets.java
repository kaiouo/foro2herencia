
package foro2;


public class Tablets extends Equipo{
    
    private String taPantalla;
    private String capacitiva;
    private String meNan;
    private String sistemaOp;
    
    public Tablets(String fabricante, String modelo, String microprocesador) {
        super(fabricante, modelo, microprocesador);
        
        this.taPantalla = taPantalla;
        this.capacitiva = capacitiva;
        this.meNan = meNan;
        this.sistemaOp = sistemaOp;
    }
    
    public String mostrarData(){
         String data = ("Fabricante: "+getFabricante()+"\nModelo: "+getModelo()+"Microprocesador: "+getMicroprocesador()
                 +"\nTamaño diagonal de pantalla: "+taPantalla+"\nCapacitiva: "+capacitiva+"\nTamaño de memoria NAND: "+meNan
                 +"\nSistema Operativo: "+sistemaOp+"\n\n");  
        return data;
    }
    
}
