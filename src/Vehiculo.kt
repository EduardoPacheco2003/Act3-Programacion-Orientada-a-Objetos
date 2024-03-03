class Vehiculo {
    /*
    1. Crear una clase que represente un vehículo, que tenga las siguientes propiedades y métodos:
        Propiedades:
    Color
    Marca
    Modelo
    Placas
    Encendido (Prendido o Apagado)
    Gasolina

      Métodos:
    Encender
    Apagar
    Recargar
    */

    var color ="";
    var marca ="";
    var modelo = "";
    var placas = "";
    var gasolina = 0;
    var encendido = false;

    fun encender(){
        if(gasolina <= 0){
            println("No hay gasolina");
            return;
        }
        println("El vehiculo se ha encendido");
        gasolina--;
        encendido = true;
    }

    fun apagar(){
        println("El vehiculo se ha apagado");
        encendido = false;
    }

    fun recargarGasolina(litros: Int){
        gasolina += litros;
    }
}