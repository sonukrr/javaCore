import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedHashMap;

class MapDemo
{
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        Instant inst = Instant.now();  //by default us time zone
        System.out.println(inst);

        HashMap<String,String> mapObject = new LinkedHashMap<String,String>();  //linked so that output displays as the values are inserted and not randomly
        mapObject.put("Sonu_krr","Pass@1");
        mapObject.put("Abhishek_krr","Pass@2");
        mapObject.put("Rishika","Pass@3");
        mapObject.put("JJ_krr","Pass@4");
        
        Set<String> keySet = mapObject.keySet();
        System.out.println(keySet);
        System.out.println("\n");

        Collection<String> values = mapObject.values();
        System.out.println(values);
        System.out.println("\n");

        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext()){

            String key = iter.next();
            String value = mapObject.get(key);
            System.out.println(key +" -> "+value);
        }

        
    }
}