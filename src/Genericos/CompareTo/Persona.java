package Genericos.CompareTo;
// compareTo() se usa para comparar objetos y determinar si uno es mayor, menor o igual a otro.

    class Persona implements Comparable<Persona> {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public int compareTo(Persona otra) {
            return Integer.compare(this.edad, otra.edad);  // Comparación por edad
//                    Double.compare(double d1, double d2)
                    // return this.tiempo - otra.tiempo;
        }
    }


