public class Televisor {
    boolean status = false;

    boolean turnOn(){

        status = true;

        return status;
    }

    boolean turnOff(){

        status =! turnOn();

        return status;
    }

    void showStatus(boolean status){
        System.out.println("Telewizor jest włączony? " + status);
    }
}
