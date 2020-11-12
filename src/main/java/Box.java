public class Box implements Runnable{
    volatile private boolean switcher;
    int countIter = 10;

    public boolean isSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        this.switcher = switcher;
    }

    @Override
    public void run() {

    }
}