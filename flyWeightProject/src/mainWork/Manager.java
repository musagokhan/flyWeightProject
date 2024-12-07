package mainWork;

import java.util.ArrayList;
import java.util.List;

import factory.TreeFactory;
import special.Tree;
import special.TreeType;

public class Manager {

    public static void main(String[] args) {
    	
    	List<Tree> forest = new ArrayList<>();
    	
    	// Agac uretimi sadece 1 kez. Burada FACTORY onemi aynı nesneyi dondurur, yoksa icindeki yapi ile uretir.
        TreeType cinar = TreeFactory.getTreeType("Cam", 10 , 8);
        TreeType kavak = TreeFactory.getTreeType("Kavak", 3 , 12);
    	
        // agaclardan olusan orman
        forest.add(new Tree(100,50,cinar)); //AYNI cinar agaci farkli yerlerde.
        forest.add(new Tree(110,50,cinar));
        forest.add(new Tree(120,50,cinar));
        forest.add(new Tree(130,50,cinar));
        forest.add(new Tree(140,50,cinar));
        
        forest.add(new Tree(100,60,kavak)); //AYNI kavak agaci farkli yerlerde.
        forest.add(new Tree(110,60,kavak));
        forest.add(new Tree(120,60,kavak));
        forest.add(new Tree(130,60,kavak));
        forest.add(new Tree(140,60,kavak));
    }
}
