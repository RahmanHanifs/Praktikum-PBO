import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<String>();
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("Generic");

        strings.remove("Generic");

        for(String s : strings ){
            System.out.println( s +" ");
        }

    }
}