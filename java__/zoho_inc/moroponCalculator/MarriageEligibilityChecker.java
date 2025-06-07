package moroponCalculator;

import java.util.*;

public class MarriageEligibilityChecker {
    static Map<String, person> family = new HashMap<>();

     void addParentChild(String parentName, String childName) {
        person parent = family.get(parentName);
        person child = family.get(childName);
        if (parent == null || child == null) {
            return;
        }

        if(parent.gender=='M'){
            child.father = parent;
        }else{
            child.mother = parent;
        }
        parent.children.add(child);
    
        for (person sibling : parent.children) {
            if (sibling == child) {
                continue;
            } 

            if (child.gender == 'M') {
                sibling.brothers.add(child);
                if (sibling.gender == 'M')
                    child.brothers.add(sibling);
                else 
                    child.sisters.add(sibling);
            } else {
                sibling.sisters.add(child);
                if (sibling.gender == 'F') 
                    child.sisters.add(sibling);
                else 
                    child.brothers.add(sibling);
            }
        }
    }

    public ArrayList<person> getEligibleCandidate(String name) {
        person seeker = family.get(name);

        if(seeker==null){
            System.out.println("No such person in the family: "+name);
            return new ArrayList<>();
        }

        ArrayList<person> eligibleCandidates = new ArrayList<>();
        eligibleCandidates.addAll(cousins(seeker.mother, seeker.gender, "mother"));
        eligibleCandidates.addAll(cousins(seeker.father, seeker.gender, "father"));

        return eligibleCandidates;   
    }
     ArrayList<person> cousins(person parent, char seekerGender, String side){
        ArrayList<person> cousins = new ArrayList<>();
        if (parent == null){
            return cousins;
        } 

        HashSet<person> relevantSiblings;

        if (side.equalsIgnoreCase("mother")) {
            relevantSiblings = parent.brothers; 
        } else if (side.equalsIgnoreCase("father")) {
            relevantSiblings = parent.sisters; 
        } else {
            return cousins;
        }

        for (person sibling : relevantSiblings) {
            // System.out.println(side+" "+sibling.name);
            for (person cousin : sibling.children) {
                if (cousin.gender != seekerGender) {
                    cousins.add(cousin);
                }
            }
        }
        return cousins;
    } 
}
