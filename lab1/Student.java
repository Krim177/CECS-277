public class Student {
    private String name;
    private String id;
    
    // constructor with two arguments
    public Student (String name, String id)
    {
        this.name = name;
        this.id = id;

    }

    //copy constructor
    public Student (Student other)
    {
      this.name = other.name;
      this.id = other.id;
    }
        
    public String getName() {
        return this.name;
    }
        
        
    public String getID(){
        return this.id;
    }

    public void setName(String newName) {
        System.out.println(" -- Changing "+ this.name + " to " + newName);
        this.name = newName;
    }
        
        
    public void setID(String newID){
        System.out.println(" -- Changing "+ this.id + " to " + newID);
        this.id = newID;
    }
        
    public String toString()
    {   	//ENTER CODE to return name and id
        return ("Name: " + this.name + " ID: " + this.id);
    }

        
    public boolean equals(Object other){
                            
        boolean result = false;
        if (other instanceof Student) {
        Student otherStudent = (Student) other;
        result = id.equals(otherStudent.id);
        }
        return result;
    } 
}

    
    
