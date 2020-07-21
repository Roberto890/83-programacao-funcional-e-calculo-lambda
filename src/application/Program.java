package application;

import java.util.Arrays;

public class Program {

   //Transparencia referencial - quando a funcao gera o mesmo resultado sempre p/ os mesmo dados de entrada
    //nesse caso não tem porque a função change oddvalues não vai dar os mesmo valores dependendo do parametro
    //por causa da variavelglobal globalValue 
    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    public static void changeOddValues(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
            numbers[i] += globalValue;
            }
        }
    }
}