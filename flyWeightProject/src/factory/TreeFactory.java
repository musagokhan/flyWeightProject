package factory;

import java.util.HashMap;
import java.util.Map;

import special.TreeType;

public class TreeFactory {
	
	private static final  Map<String, TreeType> treeType = new HashMap<String, TreeType>();
	
	
	public static TreeType getTreeType(String name, int age, double length) {
        String key = name + "_" + age + "_" + length;
        if (!treeType.containsKey(key)) {
            treeType.put(key, new TreeType(name, age, length));
            System.out.println("!!!! Yeni Agac nesnesi olusturuldu : " + key);
        }
        return treeType.get(key);
    }
	
	
}
