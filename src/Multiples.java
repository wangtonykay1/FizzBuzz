public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000; i++){
            if (i % 5 == 0 || i % 3 == 0){
                total += 1;
            }
        }
        System.out.println(total);
    }
}
