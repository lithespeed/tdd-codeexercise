package main.com.stringset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringSet {

    private HashSet<String> set = new HashSet<String>();

    public void add(String s) {
        set.add(s);
    }

    public int size() {
        return set.size();
    }

    public boolean contains(String string) {
        return set.contains(string);
    }

    public void remove(String s) throws Exception {
        if (set.contains(s)) {
            set.remove(s);
        } else {
            throw new Exception();
        }
    }

    public StringSet union(StringSet otherSet) {
        StringSet newSet = new StringSet();
        newSet.set.addAll(this.set);
        newSet.set.addAll(otherSet.set);
        return newSet;
    }

    public StringSet intersection(StringSet otherSet) {
        StringSet newSet = new StringSet();
        for (String string : this.set) {
            if (otherSet.contains(string)) {
                newSet.add(string);
            }
        }
        return newSet;
    }

    public void clear() {
        set.clear();
    }

    public List<String> enumerate() {
        return new ArrayList<>(set);
    }
}
