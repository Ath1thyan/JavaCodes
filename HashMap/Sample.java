package HashMap;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class Sample {
    static boolean a =false;
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<>();
        h.put("name", "Athithyan");
        h.put("age", "22");
        h.put("gender", "male");
        h.put("hello", "world");

        System.out.println(h.keySet());
        System.out.println(h.entrySet());
        System.out.println(h.get("name"));
        System.out.println(h.get("age"));
        System.out.println(h.clone());
        System.out.println(h.containsKey("something"));
        System.out.println(h.containsKey("hello"));
        h.putIfAbsent("address", "Coimbatore");
        System.out.println(h);
        h.replace("hello", "world", "java");
        System.out.println(h);
        HashMap<String, String> j = h;
        System.out.println(j.equals(h));
        System.out.println(h.compute("name", (k , v) -> v.concat(" Balaji")));
        
        String search = "24";
        AtomicBoolean ans = new AtomicBoolean(false);
        h.forEach((k , v) -> {
            if(k.contains(search) || v.contains(search)){
                ans.set(true);
                a = true; // boolean a=fasle is declared as static otside the class
            }
        });
        // h.keySet("22");
        // h.merge("age", "22", String::concat("23"));
        System.out.println(ans);
        System.out.println(a);
    }
}
