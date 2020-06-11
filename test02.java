import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;


public class test02 {
    public static void main(String[] args){
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        map1.put("1","demo1");
        map1.put("2","demo2");
        map2.put("3","test1");
        map2.put("4","test2");
        System.out.println("添加map2之前，map1中所有的元素："+map1);
        System.out.println("map2中所有的元素："+map2);
        map1.putAll(map2);
        System.out.println("添加map2后，map1中所有的元素："+map1);
        map2.clear();
        System.out.println("map2被清理后剩余的元素"+map2);
        boolean b = map1.containsKey("1");
        System.out.println("判断map1中是否含有key为1的元素"+b);
        b = map1.containsKey("5");
        System.out.println("判断map2中是否含有key为5的元素"+b);
        Set set = map1.entrySet();
        System.out.println(set);

        Map<String,String> map = new HashMap<>();
        map.put("1","demo1");
        map.put("2","demo2");
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("key"+entry.getKey()+",value:" + entry.getValue());
        }
        System.out.println(map1.equals(map2));
        Object obj = map.get("1");
        System.out.print(obj);
        int hashcode = map.hashCode();
        System.out.println("map哈希值为:"+hashcode);
        Set set2 = map.keySet();
        System.out.println(set2);
        map.remove("1");
        System.out.println(map);
        int size = map.size();
        System.out.println(size);

        Collection col = map.values();
        System.out.println(col);
    }
}
