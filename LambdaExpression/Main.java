package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System Start");
//        MyInter intr=new MyInterImpl();
//        intr.seyHello();
//        MyInter i = new MyInter() {
//            @Override
//            public void seyHello() {
//                System.out.println("This is anonymous class");
//            }
//        };
//        i.seyHello();
//        MyInter i1 = new MyInter() {
//            @Override
//            public void seyHello() {
//                System.out.println("This is anonymous class 2");
//            }
//        };
//        i1.seyHello();
        MyInter i = () -> System.out.println("Functional Interface using Lambda Expression");
        i.seyHello();
        MyInter i1 = () -> System.out.println("Functional Interface using Lambda Second Time");
        i1.seyHello();

        SumInter sumInter = ( a, b) -> a + b;
        System.out.println(sumInter.sum(5, 8));

        LengthInter l=(str)->str.length();
        System.out.println(l.getLength("Sahid"));
    }
}
