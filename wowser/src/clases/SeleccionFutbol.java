/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.Asistir;
import interfaces.JugarPartido;
import interfaces.PrepararEntrenamiento;
import interfaces.ViajarYConcentrar;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author usuario
 */
public class SeleccionFutbol {

    private Plantel<Integrante> plantel;
    private static int cantidadFutbolistas;
    private static int cantidadEntrenadores;

    public SeleccionFutbol() {
        plantel = new Plantel<Integrante>();
        cantidadFutbolistas = 0;
        cantidadEntrenadores = 0;
    }

    public void agregarIntegrante(Integrante nuevoIntegrante) throws MaximaCantFutbolistasExcepction, MaximaCantEntrenadoresException {
        if (nuevoIntegrante instanceof Futbolista && cantidadFutbolistas >= 23) {
            throw new MaximaCantFutbolistasExcepction("No se pudo agregar. Max. cantidad de futbolistas en el plantel");
        }
        if (nuevoIntegrante instanceof Entrenador && cantidadEntrenadores >= 1) {
            throw new MaximaCantEntrenadoresException("No se pudo agregar. Max. cantidad de entrenadores en el plantel");
        }
        plantel.agregar(nuevoIntegrante);
        if (nuevoIntegrante instanceof Futbolista) {
            cantidadFutbolistas++;
        }
        if (nuevoIntegrante instanceof Entrenador) {
            cantidadEntrenadores++;
        }
    }

    public void cargarPlantelJson() {
        JSONArray arreglo = null;
        try {
            arreglo = new JSONArray(leer());
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        JSONObject objeto = new JSONObject();
        Integrante integrante = null; // variable donde vamos a guardar los datos que saquemos de json
        for (int i = 0; i < arreglo.length(); i++) {
            try {
                objeto = (JSONObject) arreglo.get(i);
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
            try { // 1 = futbolistas //2 = Masajista //3 = entrenadores // 4 = Ayudantes
                if (objeto.get("type").equals(1)) {
                    integrante = new Futbolista((String) objeto.get("name"), objeto.getInt("age"));
                }
                if (objeto.get("type").equals(2)) {
                    integrante = new Masajita((String) objeto.get("name"), objeto.getInt("age"));
                }
                if (objeto.get("type").equals(3)) {
                    integrante = new Entrenador((String) objeto.get("name"), objeto.getInt("age"));
                }
                if (objeto.get("type").equals(4)) {
                    integrante = new AyudanteDeCampo((String) objeto.get("name"), objeto.getInt("age"));
                }

                try {
                    agregarIntegrante(integrante);
                } catch (MaximaCantFutbolistasExcepction ex) {
                    System.out.println(ex.getMessage());
                } catch (MaximaCantEntrenadoresException ex) {
                    System.out.println(ex.getMessage());
                }
            } catch (JSONException ex) {
                System.out.println("vamo a calmarno"); // cambiar
            }
        }
    }

    public String leer() {
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(Paths.get("generated.json")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return contenido;
    }

    public void mostrarSeleccion() {
        System.out.println("//////Seleccionado/////");
        plantel.listar();
        System.out.println("//////////////////////");
    }

    public void jugarPartido() {
        System.out.println("--------- Partido  ----------");
        for (int i = 0; i < plantel.cantidadDeIntegrantes(); i++) {
            Integrante jugador = plantel.obtenerIntegrante(i);
            if (jugador instanceof JugarPartido) {
                JugarPartido j = (JugarPartido) jugador;
                j.jugarPartido();
            }
        }

    }

    public void prepararEntrenamiento() {
        System.out.println("----------- Preparacion de Entrenamiento ---------");
        for (int i = 0; i < plantel.cantidadDeIntegrantes(); i++) {
            Integrante integrante = plantel.obtenerIntegrante(i);
            if (integrante instanceof PrepararEntrenamiento) {
                PrepararEntrenamiento p = (PrepararEntrenamiento) integrante;
                p.prepararEntreneamiento();
            }
        }

    }

    public void asistir() {
        System.out.println("----------- Asistencia -------------");
        for (int i = 0; i < plantel.cantidadDeIntegrantes(); i++) {
            Integrante integrante = plantel.obtenerIntegrante(i);
            if (integrante instanceof Asistir) {
                Asistir asist = (Asistir) integrante;
                asist.asistir();
            }
        }
    }

    public void viajar() {
        System.out.println("--------- Viaje  ----------");
        for (int i = 0; i < plantel.cantidadDeIntegrantes(); i++) {
            Integrante integrante = plantel.obtenerIntegrante(i);

            if (integrante instanceof ViajarYConcentrar) {
                ViajarYConcentrar v = (ViajarYConcentrar) integrante;
                v.viajar();
            }
        }
    }

    public void concentrar() {
        System.out.println("--------- Concentracion  ----------");
        for (int i = 0; i < plantel.cantidadDeIntegrantes(); i++) {
            Integrante integrante = plantel.obtenerIntegrante(i);
            if (integrante instanceof ViajarYConcentrar) {
                ViajarYConcentrar v = (ViajarYConcentrar) integrante;
                v.concentrar();
            }
        }
    }

    public void eliminarIntegrante(String nombre) {
        Integrante integrante;
        int i = 0;
        boolean flag = false;
        while (i < plantel.cantidadDeIntegrantes() && flag == false) {
            integrante = plantel.obtenerIntegrante(i);
            if (integrante.getNombreYApellido().equalsIgnoreCase(nombre)) {
                plantel.eliminar(integrante);
                flag = true;
            }
            i++;
        }
    }

    public int cantidadDeIntegrantes() {
        return plantel.cantidadDeIntegrantes();
    }
}
