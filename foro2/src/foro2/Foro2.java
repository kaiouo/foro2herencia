
package foro2;

    import javax.swing.JOptionPane;
    import java.util.ArrayList;
    import java.util.List;

public class Foro2 {

    
    public static List<String> Equipo = new ArrayList<>();
    public static List<String> laptops = new ArrayList<>();
    public static List<String> tablets = new ArrayList<>();
   
    public static void main(String[] args) {
        
        while (true) {
            String inputEquipo = JOptionPane.showInputDialog(
                    "1. Registrar Equipo\n" +
                    "2. Ver Equipo\n" +
                    "3. Salir\n\n" +
                    "Ingrese una Opcion:");

            int opcion = Integer.parseInt(inputEquipo.trim());

            switch (opcion) {
                case 1:
                    registrarEquipo();
                    break;
               case 2:
                    mostrarDatos();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        }
        
        
    }
    
    private static void registrarEquipo() {
    String inputTipoEquipo = JOptionPane.showInputDialog(
            "1. Desktops\n" +
                    "2. Laptops\n" +
                    "3. Tablets\n\n" +
                    "Ingrese una Opcion:");

    int tipoEquipo = Integer.parseInt(inputTipoEquipo.trim());
    
    
    switch (tipoEquipo) {
        case 1:
            // Lógica para registrar Desktops
            break;
        case 2:
            // Lógica para registrar Laptops
            break;
        case 3:
                String fabricante;
                String modelo;
                String microprocesador;
                String taPantalla;
                String capacitiva;
                String meNan;
                String sistemaOp;
                do {
                   fabricante = JOptionPane.showInputDialog("Ingrese el nombre del fabricante: ");
               } while (fabricante.isEmpty());

               do {
                   modelo = JOptionPane.showInputDialog("Ingrese el nombre modelo: ");
               } while (modelo.isEmpty());

               do {
                   microprocesador = JOptionPane.showInputDialog("Ingrese el nombre microprocesador: ");
               } while (microprocesador.isEmpty());
               
                do {
                   taPantalla = JOptionPane.showInputDialog("Ingrese el tamaño de la Pantalla: ");
               } while (taPantalla.isEmpty());

               do {
                   capacitiva = JOptionPane.showInputDialog("Ingrese si es capacitiva (Sí/No): ");
               } while (capacitiva.isEmpty());

               do {
                   meNan = JOptionPane.showInputDialog("Ingrese el tamaño de memoria NAND: ");
               } while (meNan.isEmpty());

               do {
                   sistemaOp = JOptionPane.showInputDialog("Ingrese el Sistema Operativo: ");
               } while (sistemaOp.isEmpty());

                Tablets tablet = new Tablets(fabricante, modelo, microprocesador, taPantalla, capacitiva, meNan, sistemaOp);
                tablet.agregarData();
                
                break;
        default:
            JOptionPane.showMessageDialog(null, "Opción no válida");
            break;
    }
   
}
    
    private static void mostrarDatos(){
       String inputTipoEquipo = JOptionPane.showInputDialog(
                "1. Desktops\n" +
                        "2. Laptops\n" +
                        "3. Tablets\n\n" +
                        "Ingrese una Opcion:");

        int tipoEquipo = Integer.parseInt(inputTipoEquipo.trim());

        switch (tipoEquipo) {
            case 2:
                if (Equipo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Equipos Registrados.");
                } else {
                    StringBuilder equiposRegistrados = new StringBuilder();
                    equiposRegistrados.append("Equipos Registrados:\n");

                    for (String equipo : Equipo) {
                        equiposRegistrados.append(equipo).append("\n");
                    }

                    JOptionPane.showMessageDialog(null, equiposRegistrados.toString());
                }
                break;
                case 3:
                if (tablets.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Equipos Registrados.");
                } else {
                    StringBuilder equiposRegistrados = new StringBuilder();
                    equiposRegistrados.append("Equipos Registrados:\n");

                    for (String equipo : tablets) {
                        equiposRegistrados.append(equipo).append("\n");
                    }

                    JOptionPane.showMessageDialog(null, equiposRegistrados.toString());
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}