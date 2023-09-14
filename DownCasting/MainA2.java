class AAA {

}

class BBB extends AAA {

}

class CCC extends AAA {

}

class MainA2 {
    public static void main(String[] args) {
        AAA a1 = new CCC();
        BBB b1 = (BBB) a1;
    }
}
