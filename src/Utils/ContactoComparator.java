package Utils;

import java.util.Comparator;
import Models.Contacto; // Agregar esta importación

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos por apellido
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        // Si los apellidos son iguales, comparamos por nombre
        if (comparacionApellido == 0) {
            return c1.getNombre().compareToIgnoreCase(c2.getNombre());
        }

        return comparacionApellido;
    }
}
