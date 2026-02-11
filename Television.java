class Television {
    static boolean isSwitchedOn;
    static boolean onOrOff() {
        if(isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("The television is switched on.");
        }
        else if(isSwitchedOn == true) {
            isSwitchedOn = false;
            System.out.println("The television is switched off.");
        }
        return isSwitchedOn;
    }
}

