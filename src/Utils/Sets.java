package Utils;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    // Método auxiliar para normalizar el formato de las palabras
    private String normalizarPalabra(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return palabra;
        }
        return palabra.substring(0, 1).toUpperCase() +
                palabra.substring(1).toLowerCase();
    }

    public Sets() {
        // Aquí irá la inicialización
    }

    public Set<String> construirHashSet() {
        Set<String> miHashSet = new HashSet<String>();

        miHashSet.add(normalizarPalabra("MANZANA"));
        miHashSet.add(normalizarPalabra("pErA"));
        miHashSet.add(normalizarPalabra("UvA"));
        miHashSet.add(normalizarPalabra("mAnZaNa")); // Este elemento se ignora

        return miHashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<String>();

        miLinkedHashSet.add(normalizarPalabra("mAnZaNa"));
        miLinkedHashSet.add(normalizarPalabra("PERA"));
        miLinkedHashSet.add(normalizarPalabra("uVa"));
        miLinkedHashSet.add(normalizarPalabra("SaNdIa"));
        miLinkedHashSet.add(normalizarPalabra("MaNzAnA")); // Este elemento se ignora

        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });

        miTreeSet.add(normalizarPalabra("ZaNaHoRiA"));
        miTreeSet.add(normalizarPalabra("MANZANA"));
        miTreeSet.add(normalizarPalabra("pera"));
        miTreeSet.add(normalizarPalabra("UVA"));
        miTreeSet.add(normalizarPalabra("sAnDiA"));
        miTreeSet.add(normalizarPalabra("mAnZaNa")); // Este elemento se ignora

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    return s1.compareToIgnoreCase(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);

        miTreeSetComparador.add(normalizarPalabra("ZaNaHoRiA"));
        miTreeSetComparador.add(normalizarPalabra("MANZANA"));
        miTreeSetComparador.add(normalizarPalabra("pErA"));
        miTreeSetComparador.add(normalizarPalabra("UvA"));
        miTreeSetComparador.add(normalizarPalabra("SaNdIa"));
        miTreeSetComparador.add(normalizarPalabra("mAnZaNa")); // Este elemento se ignora
        miTreeSetComparador.add(normalizarPalabra("PaPaYa"));

        return miTreeSetComparador;
    }
}