
public class studentMain{

    public static void main(String[] args) {
        sop("");
        sop("");
        System.out.println(" -- Starting Program");
        sop("");
        sop("");
        sop(" Making a student 's1' - Jacob, ID#001...");
        Student s1 = new Student("Jakob", "001");
        sop("");
        sop("");
        sop(" Printing 's1' Name...");
        sop(s1.getName());
        sop(" Printing 's1' ID...");
        sop(s1.getID());
        sop("");
        sop("");
        sop(" Making a student 's2' - Cloning 's1'...");
        Student s2 = new Student(s1);
        sop(" Printing 's2' Name...");
        sop(s2.getName());
        sop(" Printing 's2' ID...");
        sop(s2.getID());
        sop("");
        sop("");
        sop(" Compring the students 's1' and 's2' via ID using '.equals()'...");
        sop(" Is 's2' a copy of 's1'?");
        sop(" " + s1.equals(s2));
        sop("");
        sop("");
        sop(" Changing student 's2' name - 'Brenda'...");
        sop("");
        s2.setName("Brenda");
        sop("");
        sop(" Printing 's2' Name...");
        sop(s2.getName());
        sop("");
        sop(" Changing student 's2' ID - '002'...");
        s2.setID("002");
        sop("");
        sop(" Printing 's2' ID...");
        sop(s2.getName());
        sop("");
        sop("");
        System.out.println(" -- Ending Program...");



        
    }

    public static void sop(String output){
        System.out.println(" > " + output);
    }

    
}
