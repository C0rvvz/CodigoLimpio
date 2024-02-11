package controlador;

import modelo.dominio.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaDeVehiculos=new ArrayList<Vehiculo>();
        Vehiculo veh1=new Vehiculo("Toyota","Camry",2018,"Sedan",35000,"Usado");
        Vehiculo veh2=new Vehiculo("Ford","F-150",2020,"Camioneta",20000,"Seminuevo");

        listaDeVehiculos.add(veh1);
        listaDeVehiculos.add(veh2);

        for(int i=0; i<listaDeVehiculos.size();i++) {
            System.out.println(listaDeVehiculos.get(i));
        }

        for (Vehiculo a : listaDeVehiculos) {
            System.out.println(a.getAño());
        }

    }
}
