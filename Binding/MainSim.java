class Sim {
    void connectCall() {

    }

    void sms() {

    }
}

class Phone {
    Sim sim;

    Phone(Sim s) {
        this.sim = s;
    }

    void dial() {
        sim.connectCall();
    }

    void sendSMS() {
        sim.sms();
    }
}

class AirtelSim extends Sim {
    void connectCall() {
        System.out.println("Airtel Network");
    }

    void sms() {
        System.out.println("Airtel SMS");
    }
}

class JioSim extends Sim {
    void connectCall() {
        System.out.println("Jio Network");
    }

    void sms() {
        System.out.println("Jio SMS");
    }
}

class MainSim {
    public static void main(String args[]) {
        Phone p1 = new Phone(new AirtelSim());
        p1.dial();
        p1.sendSMS();
        Phone p2 = new Phone(new JioSim());
        p2.dial();
        p2.sendSMS();
    }
}
