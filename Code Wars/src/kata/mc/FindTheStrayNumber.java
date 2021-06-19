package kata.mc;


public class FindTheStrayNumber {

    public static void main(String[] args) {
        int[] numbers = {17, 17, 3, 17, 17, 17, 17};
        stray(numbers);
        System.out.println(stray(numbers));
    }

        static int liczba;
        static int stray(int[] numbers) {
            for (int i : numbers)
                if(i % 2 != i){
                    liczba = i;

                }
            return liczba;
        }

}
