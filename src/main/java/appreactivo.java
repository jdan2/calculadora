import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class appreactivo {

        public static void main(String[] args) {
            BiFunction<Integer,Integer,Integer> sumar = (x,y) -> x+y;
            BiFunction<Integer,Integer,Integer> restar = (x,y) -> x-y;

            BiFunction<Integer,Integer, Integer> multiplicar = (x,y) -> IntStream
                    .range(0,y+1)
                    .reduce((acumulador, numero) -> sumar.apply(acumulador, x)).getAsInt();

            BiFunction<Integer,Integer,Integer> dividir = (x,y) -> IntStream.range(0,x)
                    .reduce((acumulador, numero)->
                            multiplicar.apply(numero,y)<=x?sumar.apply(acumulador,1):acumulador).getAsInt();


            System.out.println(sumar.apply(4,8));
            System.out.println(restar.apply(4,9));
            System.out.println(multiplicar.apply(6,8));
            System.out.println(dividir.apply(12,4));

        }
}
