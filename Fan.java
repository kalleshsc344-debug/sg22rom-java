class Fan {
    static boolean isSwitchedOn;
    static boolean onOrOff() {
        if(isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("The fan is switched on.");
        }
        else if(isSwitchedOn == true) {
            isSwitchedOn = false;
            System.out.println("The fan is switched off.");
        }
        return isSwitchedOn;
    }
}

