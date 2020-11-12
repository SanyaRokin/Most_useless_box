public class Main {
    public static void main( String[] args ) {
        Box switcher = new Box();

        Thread user = new Thread(new User(switcher));
        Thread toy = new Thread(new Toy(switcher));

        user.start();
        toy.start();
        try {
            user.join();
            toy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Конец игры");
        }
    }
}
