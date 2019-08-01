package main;

import conversion.TemperaturaLogica;

import javax.swing.*;

import static constantes.Mensajes.*;

public class Main {

    public static void main(String[] args){

        TemperaturaLogica temperaturaLogica = new TemperaturaLogica();

        String valorTemperatura = JOptionPane.showInputDialog(null, MENSAJE_ENTRADA.getMensaje());

        temperaturaLogica.setCentigrados(Double.parseDouble(valorTemperatura));

        JOptionPane.showMessageDialog(null, MENSAJE_RESULTADO.getMensaje()+
                temperaturaLogica.getCentigrados()+MENSAJE_CENTIGRADO.getMensaje()+MENSAJE_ASIGNAR.getMensaje()+
                temperaturaLogica.calcularTemperaturaFarenheit()+MENSAJE_FARENHEIT.getMensaje());


    }

}
