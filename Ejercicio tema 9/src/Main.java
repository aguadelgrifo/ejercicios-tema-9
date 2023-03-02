public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Maria");
        cliente.setTelefono(123456789);
        cliente.setCredito(500);

        System.out.println("Edad: " + cliente.edad + ". Nombre: " + cliente.nombre + ". Telefono: " + cliente.telefono + ". Crédito: " + cliente.credito);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
        }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        }
    public String getNombre() {
        return this.nombre;
        }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
        }
    public int getTelefono() {
        return this.telefono;
        }
    }


class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
        }
    }
class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
        }
    }
