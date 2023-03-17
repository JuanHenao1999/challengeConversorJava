import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorApp {

    public static void main(String[] args) throws Exception {

        Object[] options = {"Convertir Divisas", "Convertir Temperatura", "salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Convesor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {"Pesos a Euros", "Pesos a Dolares", "Pesos a Libras Esterlinas", "Pesos a Yen", "Pesos a Won"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos:");
                double pesos = 0.00;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }

                if (cambio.equals("Pesos a Euros")) {
                    double euros = pesos / 5.170;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos colombianos son: " + formatearDivisa.format(euros) + " Euros.");
                } else if (cambio.equals("Pesos a Dolares")) {
                    double dolares = pesos / 4.842;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos colombianos son: " + formatearDivisa.format(dolares) + " Dolares.");
                } else if (cambio.equals("Pesos a Libras Esterlinas")) {
                    double libras = pesos / 5.903;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos colombianos son: " + formatearDivisa.format(libras) + " Libras Esterlinas.");
                } else if (cambio.equals("Pesos a Yen")) {
                    double yen = pesos / 36.76;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos colombianos son: " + formatearDivisa.format(yen) + " Yen.");
                } else if (cambio.equals("Pesos a Won")) {
                    double won = pesos / 3.70;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos colombianos son: " + formatearDivisa.format(won) + " Won.");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea seguir utilizando el programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (confirma == JOptionPane.NO_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }
        }

        if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
                int opcion = JOptionPane.showOptionDialog(null, "Elija una opción:", "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0] );

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                double valor = 0.0;
                try{
                    valor = Double.parseDouble(valorNominal);
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor *9/5)+32;
                    JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + resultado + " Grados Fahrenheit");
                }else if(opcion == 1) {
                    resultado = (valor - 32) *5/9;
                    JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + resultado + " Grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir utilizando el programa", "", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }
        }
    }
}
