package Problems;

public class StringOP {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Hello");
        obj.append(" world");
//        012345678910
//        hello world
        System.out.println(obj.indexOf("o"));
        System.out.println(obj.charAt(4));
        System.out.println(obj.lastIndexOf("o"));
        System.out.println(obj.substring(0,5)); //start , end=n-1
        System.out.println(obj.subSequence(0,5)); // same as substring
        System.out.println(obj.replace(6,10,"dear"));
        System.out.println(obj.insert(6,"dear "));
        System.out.println(obj.delete(10,16));
        System.out.println(obj.reverse());
//        obj="Hello word";
//        WHICH IS ERROR BZ SRINGBUILDER CAN MODIFYS TEXT INSIDE THE SAME MEMORY SLOT
//        METHOD TO  OVERCOME

        obj.setLength(0);
        System.out.println(obj.append("Hello World"));

//        or

        System.out.println(obj.replace(0,obj.length(),"Hello World"));

//       if you genuinely want to discard the old memory and create new

        obj=new StringBuffer("Hello World");
        System.out.println(obj);
    }
}
