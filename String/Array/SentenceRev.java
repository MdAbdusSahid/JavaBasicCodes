public class SentenceRev {
    public static void main(String[] args) {
        String s1 = "java is very easy";
        String[] arr = s1.split(" ");
        String s2 = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            s2 += " " + arr[i];
        }
        System.out.println(s2);
    }
}
