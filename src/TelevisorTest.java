public class TelevisorTest {
    public static void main(String[] args) {

        Televisor televisor = new Televisor();

        televisor.showStatus(televisor.status);

        televisor.turnOn();
        televisor.showStatus(televisor.status);

        televisor.turnOff();
        televisor.showStatus(televisor.status);
    }
}
