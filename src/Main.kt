//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    Crear un objeto de Vehículo y setear los datos de tu coche:
    Color
    Marca
    Modelo
    Placas
    * */
    val myCar = Vehiculo();
    myCar.color = "Negro";
    myCar.marca = "Tesla";
    myCar.modelo = "Model 3";
    myCar.placas = "QWERTY";
    //2. Checar si el coche está encendido (imprimiendo el status del coche), encender el coche y volver a checar.
    println("El coche está encendido: ${myCar.encendido}");
    myCar.encender();
    println("El coche está encendido: ${myCar.encendido}");
    //3. Verificar en nivel del tanque imprimiendo la cantidad de gasolina, recargar unos cuantos litros y después volver a consultar.
    println("Gasolina: ${myCar.gasolina}");
    myCar.recargarGasolina(10);
    println("Gasolina: ${myCar.gasolina}");

    //Crear un objeto de Persona y setear los datos de una persona:
    val persona = Persona("Damaris", "Diaz", "Femenino", 1.55);
    println("Nombre: ${persona.nombre}");
    println("Apellidos: ${persona.apellidos}");
    println("Sexo: ${persona.sexo}");
    println("Altura: ${persona.altura}");
}