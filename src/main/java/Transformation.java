import java.util.HashMap;

public class Transformation {
    public static void main(String[] args) {

        HashMap<Integer, Person> hm = new HashMap<>();
        hm.put(1, new Person("John Doe",20,"Ashtabula, OH", "NYN"));
        hm.put(2, new Person("Jane Doe","YNY", "N Kingsville, OH"));
        hm.put(3, new Person("Sally Jones",25,"Paris", "YYY"));

        printInfo(hm);

    }
    public static void printInfo(HashMap<Integer, Person> hm){
        // Convert HashMap object to entrySet
        var entrySet = hm.entrySet();
        for(var entry: entrySet){
            String gender;
            String student;
            String employee;

            String[] addressArray = entry.getValue().getCity().split(" ");
            String city = addressArray[0];
            if(city.length() == 1){
                city = addressArray[0]+ " " + addressArray[1];
            }
            String state = addressArray[addressArray.length-1];
            if(state == "Paris"){
                state = "N/A";
            }
            String flags = entry.getValue().getFlags();
            gender = flags.charAt(0) == 'Y'? "Female": "Male";
            student = flags.charAt(1) == 'Y'? "Yes": "No";
            employee = flags.charAt(2) == 'Y'? "Yes": "No";


            if(entry.getValue().getAge() !=0){
                System.out.println(entry.getValue().getName() + " ["+ entry.getValue().getName()+", "+gender+ "]");
            }else{
                System.out.println(entry.getValue().getName()+ " ["+gender+ "]");
            }
            System.out.println("\t\t\tCity : "+city);
            System.out.println("\t\t\tState : "+ state);
            System.out.println("\t\t\tStudent : "+ student);
            System.out.println("\t\t\tEmployee : "+ employee);
            System.out.println();
        }

    }
}
