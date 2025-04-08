package com.mycompany.concesionarioautos.logica;

import com.mycompany.concesionarioautos.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();
    
    public void crearAuto(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantPuertas);
        
        controlPersist.crearAuto(auto);
    }
    
    public List<Auto> traerAutos() {
        return controlPersist.traerAutos();
    }
    
    public void eliminarAuto(int idAuto) {
        controlPersist.eliminarAuto(idAuto);
    }
    
    public Auto traerAuto(int idAuto) {
        return controlPersist.traerAuto(idAuto);
    }

    public void editarAuto(Auto auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantPuertas);
        controlPersist.editarAuto(auto);
    }
}
