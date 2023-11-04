package Access_modifiers.Sub_package;

import Access_modifiers.Private_class;

public class Defaut_modifiers {
    public static void main(String[] args) {
        Private_class pv = new Private_class();
        System.out.println(pv.a);
    }
}
