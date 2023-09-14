class Address {
    String area;
    String city;
    String state;
    int pincode;

    Address(String a, String c, String s, int p) {
        area = a;
        city = c;
        state = s;
        pincode = p;
    }

    void displayAdr() {
        System.out.println(area + " " + city);
        System.out.println(state + " " + pincode);
    }
}

class Student {
    String name;
    Address adr;

    Student(String n, Address a) {
        name = n;
        adr = a;
    }

    void display() {
        System.out.println(name);
        System.out.print("Address\n");
        adr.displayAdr();
    }
}

class MainStudent {
    public static void main(String args[]) {
        Address a = new Address("Nabapally", "Lalgola", "Murshidabad", 742148);
        Student s1 = new Student("Abdus Sahid", a);
        s1.display();
    }
}