class WashingMachine {
    static boolean isSwitchedOn;
    static boolean onOrOff() {
        if(isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("The washing machine is switched on.");
        }
        else if(isSwitchedOn == true) {
            isSwitchedOn = false;
            System.out.println("The washing machine is switched off.");
        }
        return isSwitchedOn;
    }
}

