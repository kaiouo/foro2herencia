
package foro2;

import static foro2.Foro2.tablets;
    import javax.swing.JOptionPane;
    import java.util.ArrayList;
    import java.util.List;


public class Tablets extends Equipo{
    
    private String taPantalla;
    private String capacitiva;
    private String meNan;
    private String sistemaOp;
    
    public Tablets(String fabricante, String modelo, String microprocesador, String taPantalla, String capacitiva, String meNan, String sistemaOp) {
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
    
    
    public String agregarData(){

        String equipoRegistrado = "Fabricante: " + getFabricante() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Microprocesador: " + getMicroprocesador() + "\n" +
                "Tamaño Pantalla: " + taPantalla + "\n" +
                "Capacitiva: " + capacitiva + "\n" +
                "Tamaño de memoria NAND: " + meNan + "\n" +
                "Sistema Operativo: " + sistemaOp;

        JOptionPane.showMessageDialog(null, equipoRegistrado);
        tablets.add(equipoRegistrado);
        return equipoRegistrado;
    }
    
    }
