//En resumen, este código crea una lista de vehículos, agrega dos vehículos a la lista, imprime toda la información de los vehículos y luego imprime solo el año de cada vehículo.

//Estas lineas importan la clase Vehiculo del paquete modelo.dominio y la clase ArrayList del paquete java.util, lo cual permite utilizarlas en el código.
package controlador;

import modelo.dominio.Vehiculo;

import java.util.ArrayList;

//Estas líneas definen la clase Main y el método main, que es el punto de entrada del programa.
public class Main {
    public static void main(String[] args) {

        //Aquí se crea un nuevo ArrayList llamado listaDeVehiculos que va a contener objetos de la clase Vehiculo.
        ArrayList<Vehiculo> listaDeVehiculos=new ArrayList<Vehiculo>();

        //Se crean dos objetos de la clase Vehiculo con diferentes atributos y se asignan a las variables veh1 y veh2 respectivamente.
        Vehiculo veh1=new Vehiculo("Toyota","Camry",2018,"Sedan",35000,"Usado");
        Vehiculo veh2=new Vehiculo("Ford","F-150",2020,"Camioneta",20000,"Seminuevo");

        //Los objetos veh1 y veh2 se agregan a la lista de vehículos listaDeVehiculos.
        listaDeVehiculos.add(veh1);
        listaDeVehiculos.add(veh2);

        //En la siguiente linea de codigo este bucle itera a través de la lista de vehículos usando un índice y muestra la información de cada vehículo mediante el método toString()

        //A continuacion se itera a través de la lista de vehículos y se muestra la información de cada vehículo
        for(int i=0; i<listaDeVehiculos.size();i++) {
            System.out.println(listaDeVehiculos.get(i));
        }

        //En la siguiente linea de codigo se hace otra forma de poder hacer el ciclo. Este bucle for-each itera a través de la lista de vehículos y muestra solo el año de cada vehículo utilizando el método getAño().

        //A continuacion se iterar a través de la lista de vehículos y mostrar solo el año de cada vehículo
        for (Vehiculo a : listaDeVehiculos) {
            System.out.println(a.getAño());
        }

    }
}
