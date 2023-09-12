public class Reduce {

    public static void main(String[] args) {
        int curr = 100;
        int steps = 0;
        while (curr != 0) {
            if (curr % 2 == 0) {
                curr /= 2;
            }else{
                curr -= 1;
            }
            steps++;
        }
        System.out.println(steps);
    }

}
