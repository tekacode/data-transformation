import java.util.ArrayList;
import java.util.HashMap;

public class Transformation {
    public static void main(String[] args) {

        HashMap<Integer, Person> hm = new HashMap<>();
        hm.put(1, new Person("John Doe",20,"Ashtabula, OH", "NYN"));
        hm.put(2, new Person("Jane Doe","YNY", "N Kingsville, OH"));
        hm.put(3, new Person("Sally Jones",25,"Paris", "YYY"));

        var entrySet = hm.entrySet();
        for(var entry: entrySet){
            String gender;
            String student;
            String employee;

            String[] addressArray = entry.getValue().city.split(" ");
            String city = addressArray[0];
            String state = addressArray[addressArray.length-1];
            if(state == "Paris"){
                state = "N/A";
            }
            String flags = entry.getValue().flags;
            if(flags.charAt(0) == 'Y'){
                 gender = "Female";
            }else{
                 gender = "Male";
            }
            if(flags.charAt(1) == 'Y'){
                 student = "Yes";
            }else{
                 student = "NO";
            }
            if(flags.charAt(2) == 'Y'){
                 employee = "Yes";
            }else {
                employee = "No";
            }

            System.out.println(entry.getValue().name + "["+ entry.getValue().age+",Male]");
            System.out.println("\t\t\tCity : "+city);
            System.out.println("\t\t\tState : "+ state);
            System.out.println("\t\t\tStudent : "+ student);
            System.out.println("\t\t\tEmployee : "+ employee);
            System.out.println();
        }
    }
}
