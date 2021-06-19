package kata.mc;

public class Sum {


    public static void main(String[] args) {
        double[] tablica = {1.1, 2.2, 3.3};
        sum(tablica);
        System.out.println(sum(tablica));

    }

    
    public static double sum(double[] numbers) {
        double suma = 0;
        for (double i : numbers) {
            suma += i;
        }
        return suma;
    }

}


