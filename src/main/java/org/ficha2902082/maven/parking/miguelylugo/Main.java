package org.ficha2902082.maven.parking.miguelylugo;

//importar dependencias
import org.ficha2902082.maven.parking.miguelylugo.entities.Carro;
import org.ficha2902082.maven.parking.miguelylugo.entities.Cliente;
import org.ficha2902082.maven.parking.miguelylugo.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.miguelylugo.entities.Cliente;
import org.ficha2902082.maven.parking.miguelylugo.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        // crear dos instancias de la clase carro
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito2 = new Carro();
        carrito2.placa = "WRE 890";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Cliente clientecito = new Cliente();
        clientecito.nombre = "Luis";
        clientecito.apellidos = "Uran";
        clientecito.tipoDocumento = TipoDocumento.CC;
        clientecito.numeroDocumento = 1019029870L;
        clientecito.celular = 350890765L;

        // añadir carros al cliente
        // invocar, llamar, ejecutar
        // el metodo addCar
        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ASD 456", TipoVehiculo.TAXI);

        System.out.println("Cliente:" + clientecito.nombre + "  " + clientecito.apellidos);
        System.out.println("Documento:" + clientecito.numeroDocumento);
        System.out.println("Tipo de Documento:" + clientecito.tipoDocumento);
        System.out.println("Celular:" + clientecito.celular);
        System.out.println("Vehiculos:");
        for (Carro c : clientecito.misCarros) {
            System.out.println("placa: " + c.placa);
            System.out.println("tipo: " + c.tipoVehiculo);
            System.out.println("____________");

        }
    }

}