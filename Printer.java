class Printer {
    static boolean isSwitchedOn;
    static boolean onOrOff() {
        if(isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("The printer is switched on.");
        }
        else if(isSwitchedOn == true) {
            isSwitchedOn = false;
            System.out.println("The printer is switched off.");
        }
        return isSwitchedOn;
    }
}

