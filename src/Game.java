public class Game {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            if (i == 5) {
                System.out.println("Ignite engine!");
                Thread.sleep(1000);
                continue;
            }
            if (i == 0) {
                System.out.println("Lift off!");
                continue;
            }
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Successful launch!");
    }
}
