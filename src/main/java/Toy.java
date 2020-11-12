public class Toy extends Box {
    final Box switcher;

    public Toy(Box switcher) {
        this.switcher=switcher;
        System.out.println("Игрушка готова к игре");
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            setSwitcherOff();
        }
    }

    public void setSwitcherOff() {
        synchronized (switcher) {
            try {
                while (!switcher.isSwitcher()) {
                    switcher.wait();
                }
                switcher.setSwitcher(false);
                System.out.println("Тумблер выключен");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}