package moroponCalculator;
import java.util.*;

public class moroponnu { 
    public static void main(String[] args) {
        MarriageEligibilityChecker checker = new MarriageEligibilityChecker();
        Map<String, person> family = checker.family;

        family.put("A", new person("A", 'M'));
        family.put("B", new person("B", 'F'));
        family.put("C", new person("C", 'M'));
        family.put("D", new person("D", 'F'));
        family.put("E", new person("E", 'M'));
        family.put("F", new person("F", 'F'));
        family.put("G", new person("G", 'M'));
        family.put("H", new person("H", 'F'));
        family.put("I", new person("I", 'M'));
        family.put("J", new person("J", 'F'));
        family.put("K", new person("K", 'M'));
        family.put("L", new person("L", 'F'));
        family.put("S", new person("S", 'M'));

        checker.addParentChild("A", "C");
        checker.addParentChild("B", "C");
        checker.addParentChild("A", "D");
        checker.addParentChild("B", "D");
        checker.addParentChild("C", "E");
        checker.addParentChild("D", "F");
        checker.addParentChild("E", "G");
        checker.addParentChild("A", "I");
        checker.addParentChild("B", "I");
        checker.addParentChild("I", "K");
        checker.addParentChild("H", "K");
        checker.addParentChild("I", "L");
        checker.addParentChild("H", "L");
        checker.addParentChild("D", "J");
        checker.addParentChild("E", "S");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter person name to check eligible marriage options: ");
        String name = obj.nextLine().trim();

        for(person per: family.values()) {
            System.out.println("name: " +per.name+" "+per.gender+" \n children");
            for(person child: per.children) {
                System.out.println(child.name+" "+child.gender);
            }
            System.out.println("brothers and sisters");
            for(person brother: per.brothers) {
                System.out.println(brother.name+" "+brother.gender);
            }
            System.out.println("sisters");
            for(person sister: per.sisters) {
                System.out.println(sister.name+" "+sister.gender);
            }
            System.out.println();
        }
        
        List<person> eligible = checker.getEligibleCandidate(name);

        if (eligible.isEmpty()) {
            System.out.println("No eligible candidates found for " + name);
        } else {
            System.out.println("Eligible candidates for " + name + ":");
            for (person p : eligible) {
                System.out.println(p.name);
            }
        }
    }
}
