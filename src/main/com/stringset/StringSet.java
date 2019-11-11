package main.com.stringset;

import java.util.HashSet;

public class StringSet {

    HashSet set = new HashSet<String>();

    public void add(String s) {
        set.add(s);
    }

    public int size() {
        return set.size();  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean contains(String s) {
        return set.contains(s);  //To change body of created methods use File | Settings | File Templates.
    }

    public void remove(String s) throws Exception {

        if (set.contains(s)) {
            set.remove(s);
        } else {
            throw new Exception();
        }
    }


    public void print() {

        for (Object o : set) {
            System.out.println((String)o);
        }
    }
}
