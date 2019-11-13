package main.com.stringset;

import java.util.HashSet;

public class StringSet {

    HashSet<String> set = new HashSet<String>();

    //tested
    public void add(String s) {
        set.add(s);
    }

    //tested
    public int size() {
        return set.size();
    }

    //tested
    public void remove(String s) throws Exception {
        if (set.contains(s)) {
            set.remove(s);
        } else {
            throw new Exception();
        }
    }
}
