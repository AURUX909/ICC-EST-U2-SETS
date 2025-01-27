package Models;

public class Contacto {
    private final String nombre;
    private final String apellido;
    private final String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " - " + telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equalsIgnoreCase(contacto.nombre) &&
            apellido.equalsIgnoreCase(contacto.apellido) &&
               telefono.equals(contacto.telefono);  // Agregamos comparación del teléfono
    }

    @Override
    public int hashCode() {
        return (nombre.toLowerCase() + apellido.toLowerCase() + telefono).hashCode();  // Incluimos teléfono en el hash
    }
}