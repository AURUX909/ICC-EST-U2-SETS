package Main;

import Models.Contacto;
import Utils.ContactoComparator;
import Utils.Sets;
import java.util.Set;
import java.util.TreeSet;

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

        System.out.println("\n----- Prueba de Agenda Contactos -----");
        runEjercicio();
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

    public static void runEjercicio(){
        //Ser<Contacto> agenda = new TransSet<>(new ContactoComparator(x));

        Contacto c1 = new Contacto("Pedro", "Lopez", "1234567809");
        Contacto c2 = new Contacto("Pedro", "Lopez", "9876543210");

        // Imprimimos los contactos
        System.out.println(c1);
        System.out.println(c2);

        // Comparación por referencia de memoria
        System.out.println("\nComparación por referencia de memoria:");
        boolean comparacionReferencia = c1 == c2;
        System.out.println(comparacionReferencia);
        System.out.println("c1:"+ c1 + "== c2:" + c2+ "=" + comparacionReferencia);

        // Comparación usando equals
        System.out.println("\nComparación usando equals:");
        System.out.println(c1.equals(c2));
        boolean comparacionEquals = c1.equals(c2);
        System.out.println(comparacionEquals);
        System.out.println("c1: " + c1 + " == c2: " + c2 + " = " + comparacionEquals);

        // Comparación de hashCode
        System.out.println("\nComparación de hashCode:");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);
        System.out.println("c1: " + c1.hashCode() + " == c2: " + c2.hashCode() + " = " + comparacionHashCode);

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222222"));
        agenda.add(new Contacto("Luis", "Perez", "333333333333"));
        agenda.add(new Contacto("Ana", "Perez", "444444444444"));
        agenda.add(new Contacto("Pedro", "Lopez", "555555555555"));

        System.out.println("Contacos en la agenda (ordenada)");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
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