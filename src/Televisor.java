public class Televisor {
    boolean status = false;

    void turnOn(){

        status = true;
    }

    void turnOff(){

        status = false;
    }

    void showStatus(boolean status){
        System.out.println("Telewizor jest włączony? " + status);
    }
}
