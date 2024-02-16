package org.ficha2902082.maven.parking.miguelylugo.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public long numeroDocumento;
    public long celular;

    public List<Carro> misCarros = new ArrayList<Carro>();

    // metodo 1: añadir carro al cliente
    // definir metodo (firma del metodo - Signature):
    // -modificador acceso
    // -tipo de dato de retorno
    // -nombre del metodo
    // parametros(entradas, inputs):
    // 1. ripo de dato del parametro
    // 2.Nombre del parametro
    public void addCar(Carro c) {
        this.misCarros.add(c);

    }

    public void addCar(String placa, TipoVehiculo tipoVehiculo) {
        // contruir(instanciar)
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);

    }
    // sobrecarga de metodos:
    // en una clase se permiten metodos con el mismo nombre pero
    // con diferente firma

}
