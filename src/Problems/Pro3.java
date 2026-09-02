package Problems;

public class Pro3 {
    public static void main(String[] args) {
        String a=new String("Hello");
        String aa=new String("Heldhlo");

        String b=new String("Hello");
        System.out.println(a.hashCode());
        System.out.println(aa.hashCode());

        System.out.println(a.equals(b));
        System.out.println(a.hashCode()==b.hashCode());

    }
}
