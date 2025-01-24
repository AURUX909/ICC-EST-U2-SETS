package Main;

import java.util.Set;
import java.util.TreeSet;

import Models.Contacto;
import Utils.ContactoComparator;
import Utils.Sets;

public class App {
    private static Set<Contacto> agenda;

    public static void main(String[] args) throws Exception {
        // Inicializamos la agenda con TreeSet y nuestro comparador personalizado
        agenda = new TreeSet<>(new ContactoComparator());

        // Agregamos algunos contactos de prueba
        agenda.add(new Contacto("Juan", "Pérez", "123456789"));
        agenda.add(new Contacto("Ana", "Pérez", "987654321"));
        agenda.add(new Contacto("María", "López", "456789123"));

        // Mostramos la agenda
        System.out.println("----- Agenda de Contactos -----");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

        System.out.println("\n----- Pruebas de Sets -----");
        // Mantenemos las pruebas originales
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
    }

    // Métodos para manejar la agenda
    public static void agregarContacto(Contacto contacto) {
        agenda.add(contacto);
    }

    public static void eliminarContacto(Contacto contacto) {
        agenda.remove(contacto);
    }

    public static Set<Contacto> obtenerContactos() {
        return agenda;
    }

    public static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elementos del HashSet (no se garantiza orden):");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("\n----- LinkedHashSet -----");
        System.out.println("Elementos del LinkedHashSet (mantiene orden de inserción):");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("\n----- TreeSet -----");
        System.out.println("Elementos del TreeSet (ordenado alfabetico ):");
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparador = sets.construirTreeSetConComparador();
        System.out.println("\n----- TreeSet con Comparador -----");
        System.out.println("Elementos del TreeSet (ordenados por longitud y alfabéticamente):");
        for (String elemento : ejemploTreeSetComparador) {
            System.out.println(elemento + " (longitud: " + elemento.length() + ")");
        }
    }
}