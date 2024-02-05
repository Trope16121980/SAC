/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe.menuPrincipal;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author Gustavo_Senorans
 */
public class Backup {

    String user = System.getProperty("user.name");
    //VARIABLE PARA FICHERO
    File bd = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\bd.csv");
    File bd_card_null = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\bdSinTarjeta.csv");
    File entrada = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\entrada.csv");
    File envio_paquetes = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\envio_paquetes.csv");
    File lista_llaves = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\lista_llaves.csv");
    File lista_telf = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\lista_telf.csv");
    File listado_mercancia = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\listado_mercancia.csv");
    File llaves = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\llaves.csv");
    File recepcion_paquetes = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\recepcion_paquetes.csv");
    File salida_ropa = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\salida_ropa.csv");
    File stockropa = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\stockropa.csv");
    File user2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\user.csv");
    File userEntrada = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\userEntrada.csv");
    File almacen = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\almacen.csv");
    File alarmas = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\alarmas.csv");

    File bd2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_base_de_datos_con_tarjeta.csv");
    File bd_card_null2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_base_de_datos_sin_tarjeta.csv");
    File entrada2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\horario_de_entrada_salida.csv");
    File envio_paquetes2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\envio_paquetes.csv");
    File lista_llaves2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_llaves.csv");
    File lista_telf2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_telf.csv");
    File listado_mercancia2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\listado_mercancia.csv");
    File llaves2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\llaves.csv");
    File recepcion_paquetes2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\recepcion_paquetes.csv");
    File salida_ropa2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\salida_ropa.csv");
    File stockropa2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\stockropa.csv");
    File user3 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\user.csv");
    File userEntrada2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\userEntrada.csv");
    File almacen2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\almacen.csv");
    File alarmas2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\alarmas.csv");

    public void ficheroApp() {
        if (bd.exists()) {
            bd = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\bd.csv");
            bd_card_null = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\bdSinTarjeta.csv");
            entrada = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\entrada.csv");
            envio_paquetes = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\envio_paquetes.csv");
            lista_llaves = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\lista_llaves.csv");
            lista_telf = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\lista_telf.csv");
            listado_mercancia = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\listado_mercancia.csv");
            llaves = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\llaves.csv");
            recepcion_paquetes = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\recepcion_paquetes.csv");
            salida_ropa = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\salida_ropa.csv");
            stockropa = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\stockropa.csv");
            user2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\user.csv");
            userEntrada = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\userEntrada.csv");
            almacen = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\almacen.csv");
            alarmas = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\alarmas.csv");

            bd2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_base_de_datos_con_tarjeta.csv");
            bd_card_null2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_base_de_datos_sin_tarjeta.csv");
            entrada2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\horario_de_entrada_salida.csv");
            envio_paquetes2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\envio_paquetes.csv");
            lista_llaves2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_llaves.csv");
            lista_telf2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_telf.csv");
            listado_mercancia2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\listado_mercancia.csv");
            llaves2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\llaves.csv");
            recepcion_paquetes2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\recepcion_paquetes.csv");
            salida_ropa2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\salida_ropa.csv");
            stockropa2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\stockropa.csv");
            user3 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\user.csv");
            userEntrada2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\userEntrada.csv");
            almacen2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\almacen.csv");
            alarmas2 = new File("C:\\Users\\Gustavo Señorans\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\alarmas.csv");
            copias();
        } else if (!bd.exists()) {
            String user = System.getProperty("user.name");
            bd = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\bd.csv");
            bd_card_null = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\bdSinTarjeta.csv");
            entrada = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\entrada.csv");
            envio_paquetes = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\envio_paquetes.csv");
            lista_llaves = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\lista_llaves.csv");
            lista_telf = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\lista_telf.csv");
            listado_mercancia = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\listado_mercancia.csv");
            llaves = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\llaves.csv");
            recepcion_paquetes = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\recepcion_paquetes.csv");
            salida_ropa = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\salida_ropa.csv");
            stockropa = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\stockropa.csv");
            user2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\user.csv");
            userEntrada = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\userEntrada.csv");
            almacen = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\almacen.csv");
            alarmas = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\alarmas.csv");

            bd2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_base_de_datos_con_tarjeta.csv");
            bd_card_null2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_base_de_datos_sin_tarjeta.csv");
            entrada2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\horario_de_entrada_salida.csv");
            envio_paquetes2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\envio_paquetes.csv");
            lista_llaves2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_llaves.csv");
            lista_telf2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\lista_telf.csv");
            listado_mercancia2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\listado_mercancia.csv");
            llaves2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\llaves.csv");
            recepcion_paquetes2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\recepcion_paquetes.csv");
            salida_ropa2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\salida_ropa.csv");
            stockropa2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\stockropa.csv");
            user3 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\user.csv");
            userEntrada2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\userEntrada.csv");
            almacen2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\almacen.csv");
            alarmas2 = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros\\alarmas.csv");
            copias();
        } else {
            JOptionPane.showMessageDialog(null, "\nHay un error en los fichero\nhable con el administrador.");
            return;
        }
    }

    public String copias() {

        try {
            OutputStream out;
            InputStream in2;
            OutputStream out2;
            InputStream in3;
            OutputStream out3;
            InputStream in4;
            OutputStream out4;
            InputStream in5;
            OutputStream out5;
            InputStream in6;
            OutputStream out6;
            InputStream in7;
            OutputStream out7;
            InputStream in8;
            OutputStream out8;
            InputStream in10;
            OutputStream out10;
            InputStream in11;
            OutputStream out11;
            InputStream in12;
            OutputStream out12;
            InputStream in13;
            OutputStream out13;
            InputStream in14;
            OutputStream out14;
            InputStream in15;
            OutputStream out15;
            InputStream in16;
            OutputStream out16;

            try (InputStream in = new FileInputStream(bd)) {
                out = new FileOutputStream(bd2);

                in2 = new FileInputStream(bd_card_null);
                out2 = new FileOutputStream(bd_card_null2);

                in3 = new FileInputStream(entrada);
                out3 = new FileOutputStream(entrada2);

                in4 = new FileInputStream(envio_paquetes);
                out4 = new FileOutputStream(envio_paquetes2);

                in5 = new FileInputStream(lista_llaves);
                out5 = new FileOutputStream(lista_llaves2);

                in6 = new FileInputStream(lista_telf);
                out6 = new FileOutputStream(lista_telf2);

                in7 = new FileInputStream(listado_mercancia);
                out7 = new FileOutputStream(listado_mercancia2);

                in8 = new FileInputStream(llaves);
                out8 = new FileOutputStream(llaves2);

                in10 = new FileInputStream(recepcion_paquetes);
                out10 = new FileOutputStream(recepcion_paquetes2);

                in11 = new FileInputStream(salida_ropa);
                out11 = new FileOutputStream(salida_ropa2);

                in12 = new FileInputStream(stockropa);
                out12 = new FileOutputStream(stockropa2);

                in13 = new FileInputStream(user2);
                out13 = new FileOutputStream(user3);

                in14 = new FileInputStream(userEntrada);
                out14 = new FileOutputStream(userEntrada2);

                in15 = new FileInputStream(alarmas);
                out15 = new FileOutputStream(alarmas2);

                in16 = new FileInputStream(almacen);
                out16 = new FileOutputStream(almacen2);

//               long size = entrada.length();
//               long size2 = entrada2.length();
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }

                while ((len = in2.read(buf)) > 0) {
                    out2.write(buf, 0, len);
                }
                while ((len = in3.read(buf)) > 0) {
                    out3.write(buf, 0, len);
                }
                while ((len = in4.read(buf)) > 0) {
                    out4.write(buf, 0, len);
                }
                while ((len = in5.read(buf)) > 0) {
                    out5.write(buf, 0, len);
                }
                while ((len = in6.read(buf)) > 0) {
                    out6.write(buf, 0, len);
                }
                while ((len = in7.read(buf)) > 0) {
                    out7.write(buf, 0, len);
                }
                while ((len = in8.read(buf)) > 0) {
                    out8.write(buf, 0, len);
                }
                while ((len = in10.read(buf)) > 0) {
                    out10.write(buf, 0, len);
                }
                while ((len = in11.read(buf)) > 0) {
                    out11.write(buf, 0, len);
                }
                while ((len = in12.read(buf)) > 0) {
                    out12.write(buf, 0, len);
                }
                while ((len = in13.read(buf)) > 0) {
                    out13.write(buf, 0, len);
                }
                while ((len = in14.read(buf)) > 0) {
                    out14.write(buf, 0, len);
                }
                while ((len = in15.read(buf)) > 0) {
                    out15.write(buf, 0, len);
                }
                while ((len = in16.read(buf)) > 0) {
                    out16.write(buf, 0, len);
                }
            }
            out.close();
            in2.close();
            out2.close();
            in3.close();
            out3.close();
            in4.close();
            out4.close();
            in5.close();
            out5.close();
            in6.close();
            out6.close();
            in7.close();
            out7.close();
            in8.close();
            out8.close();
            in10.close();
            out10.close();
            in11.close();
            out11.close();
            in12.close();
            out12.close();
            in13.close();
            out13.close();
            in14.close();
            out14.close();
            in15.close();
            out15.close();
            in16.close();
            out16.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "\nError: " + e);
        }
        return "";
    }

}
