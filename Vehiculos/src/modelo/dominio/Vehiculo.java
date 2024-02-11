//En resumen, este código define una clase Vehiculo que representa un vehículo con varias características y proporciona métodos para acceder y modificar estas características, así como para formatear la documentación del vehículo y representar el objeto como una cadena.

//Se define una clase llamada Vehiculo en el paquete modelo.dominio.
package modelo.dominio;

//Se especifica que la clase Vehiculo está en el paquete modelo.dominio.

//Importo las clases SimpleDateFormat y Date del paquete java.text y java.util
import java.text.SimpleDateFormat;
import java.util.Date;

//Declaro la clase Vehiculo.
public class Vehiculo {

    //Declaro variables miembro para representar las características de un vehículo.
    private String marca;
    private String modelo;
    private int año;
    private String carroceria;
    private String motorizacion;
    private String transmision;
    private String equipamiento;
    private String color;
    private String historia_manteniminto;
    private int millaje_kilometraje;
    private String condicion;
    private Date documentacion;

    //A continuacion se define un constructor para la clase Vehiculo que toma todos los atributos del vehículo como argumentos y los asigna a las variables miembro correspondientes.

    //Constructor que inicializa todas las variables de la clase Vehiculo
    public Vehiculo(String marca, String modelo, int año, String carroceria, String motorizacion, String transmision, String equipamiento, String color, String historia_manteniminto, int millaje_kilometraje, String condicion, Date documentacion) {

        //Se asigna los valores recibidos a las variables miembro correspondientes
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.carroceria = carroceria;
        this.motorizacion = motorizacion;
        this.transmision = transmision;
        this.equipamiento = equipamiento;
        this.color = color;
        this.historia_manteniminto = historia_manteniminto;
        this.millaje_kilometraje = millaje_kilometraje;
        this.condicion = condicion;
        this.documentacion = documentacion;
    }

    //A continuacion se define otro constructor para la clase Vehiculo que toma solo algunas características del vehículo y las asigna a las variables miembro correspondientes.

    //Constructor que solo inicializa algunas variables
    public Vehiculo(String marca, String modelo, int año, String carroceria, int millaje_kilometraje, String condicion) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.carroceria = carroceria;
        this.millaje_kilometraje = millaje_kilometraje;
        this.condicion = condicion;
    }

    //A continuacion se define métodos getters y setters para todas las variables miembro, lo que permite acceder y modificar sus valores.

    //Métodos getters y setters para acceder y modificar las variables miembro
    public String getMarca() {
        return marca;
    }

    public void setMarca(String nombre) {
        this.marca = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getMotorizacion() {
        return motorizacion;
    }

    public void setMotorizacion(String motorizacion) {
        this.motorizacion = motorizacion;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHistoria_manteniminto() {
        return historia_manteniminto;
    }

    public void setHistoria_manteniminto(String historia_manteniminto) {
        this.historia_manteniminto = historia_manteniminto;
    }

    public int getMillaje_kilometraje() {
        return millaje_kilometraje;
    }

    public void setMillaje_kilometraje(int millaje_kilometraje) {
        this.millaje_kilometraje = millaje_kilometraje;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Date getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(Date documentacion) {
        this.documentacion = documentacion;
    }

    //A continuacion creamos un StringBuilder para almacenar la documentación formateada

    //Método para formatear la documentación del vehículo
    public String formatearDocumentacion() {
        //Creamos un StringBuilder para almacenar la documentación formateada
        StringBuilder documentacionFormateada = new StringBuilder();

        //Agregamos cada tipo de documentación a la cadena resultante, separándolos por "/"
        documentacionFormateada.append("Título de propietario/")
                .append("Registro del vehículo/")
                .append("Certificado de matriculación o tarjetas de circulación/")
                .append("Informe de historial del vehículo/")
                .append("Póliza de seguro/")
                .append("Certificado de emisiones (si es aplicable)/")
                .append("Contrato de venta o factura de compra");

        //Devolvemos la cadena resultante
        return documentacionFormateada.toString();
    }

    //A continuacion se define un método toString() que devuelve una representación de cadena del objeto Vehiculo, mostrando sus características principales.

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Vehiculo {" +
                "Marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", carroceria='" + carroceria + '\'' +
                ", millaje_kilometraje=" + millaje_kilometraje +
                ", condicion='" + condicion + '\'' +
                '}';
    }

}
