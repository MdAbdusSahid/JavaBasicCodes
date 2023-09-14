interface Phone {
    void switchOn();

    void call();
}

interface Camera {
    void switchOn();

    void takePhoto();
}

interface SmartPhone {
    void interNet();
}

class Samsung implements Phone, Camera, SmartPhone {
    public void switchOn() {
        System.out.println("Phone Switch on");
    }

    public void call() {
        System.out.println("Call connect");
    }

    public void takePhoto() {
        System.out.println("Take photo");
    }

    public void interNet() {
        System.out.println("Connect to internet");
    }
}

class MainPhone {
    public static void main(String[] args) {
        Phone p = new Samsung();
        p.switchOn();
        SmartPhone s = new Samsung();
        s.interNet();
    }
}
