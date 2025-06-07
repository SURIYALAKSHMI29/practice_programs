package moroponCalculator;

import java.util.*;

public class person {
    String name;
    char gender;
    person mother;
    person father;
    
    HashSet<person> sisters = new HashSet<>();
    HashSet<person> brothers = new HashSet<>();
    ArrayList<person> children = new ArrayList<>();
    
    public person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

}
