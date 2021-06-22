public class app {


        public static int sumaNumeros(int numeroUno, int numeroDos) {
            return numeroUno + numeroDos;
        }

        public static int restaNumeros(int numeroUno, int numeroDos) {
            return numeroUno - numeroDos;
        }

        public static int multipllicarNumero(int numeroUno, int numeroDos) {
            if (numeroDos >= 1) {
                return sumaNumeros(numeroUno, multipllicarNumero(numeroUno, numeroDos - 1));
            }
            return 0;
        }

        public static int dividirNumero(int dividendo, int divisor) {
            if(divisor>dividendo) {
                return 0;
            }
            else {
                return 1 + dividirNumero(restaNumeros(dividendo ,divisor), divisor);
            }
        }

        public static void main(String[] args) {
            System.out.println("La multiplicacion es: " + multipllicarNumero(3,5));
            System.out.println("La division es: " + dividirNumero(100,5));
        }
    }

