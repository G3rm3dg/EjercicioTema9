public class App {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente ();
        cliente1.setEdad(45);
        cliente1.setNombre("Jaime");
        cliente1.setTelefono(21458785);

        System.out.println("CLASE CLIENTE........");
        System.out.println("El credito del cliente es: $" + cliente1.credito);
        System.out.println("La edad del cliente es: " + cliente1.getEdad());
        System.out.println("El Nombre del cliente es: " + cliente1.getNombre());
        System.out.println("El Telefono del cliente es: " +  cliente1.getTelefono() + "\n");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(70);
        trabajador.setNombre("Gerley");
        trabajador.setTelefono(8569854);
        
        System.out.println("CLASE TRABAJADOR........");
        System.out.println("El salario del trabajador es: $" + trabajador.salario);
        System.out.println("La edad del trabajador es: " + trabajador.getEdad());
        System.out.println("El Nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("El Telefono del trabajador es: " + trabajador.getTelefono());        
        
    }

}

class Persona{

    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    int credito = 60000;

    // set y get para edad
    public void setEdad (int edadCliente) {
        this.edad = edadCliente; 
    }
    public int getEdad (){
        return this.edad;
    }

    // set y get para nombre
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }

    // set y get para Telefono
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono (){
        return this.telefono;
    }
}


class Trabajador extends Persona {
    int salario = 800000;

    // set y get para edad
    public void setEdad (int edadTrabajador) {
        this.edad = edadTrabajador; 
    }
    public int getEdad (){
        return this.edad;
    }

    // set y get para nombre
    public void setNombre (String nombreTrabajador) {
        this.nombre = nombreTrabajador;
    }
    public String getNombre (){
        return this.nombre;
    }

    // set y get para Telefono
    public void setTelefono (int telefonoTrabajador) {
        this.telefono = telefonoTrabajador;
    }
    public int getTelefono (){
        return this.telefono;
    }

}
