package com.mycompany.concesionarioautos.persistencia;

import com.mycompany.concesionarioautos.logica.Auto;
import com.mycompany.concesionarioautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutoJpaController autoJpa = new AutoJpaController();

// ########################### CRUD Auto ###########################
    public void crearAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public void eliminarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int id) {
        return autoJpa.findAuto(id);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

}
