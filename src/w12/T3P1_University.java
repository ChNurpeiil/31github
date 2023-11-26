package w12;

public class T3P1_University {
    public String name;
    public String location;
    public int establishedYear;
    public int studentCount;

    public T3P1_University(){
        this.name = "Unknown";
        this.location = "Unknown";
        this.establishedYear = 0;
        this.studentCount = 0;

    }
    public T3P1_University(String name){
        this.name = name;
        this.location = "Unknown";
        this.establishedYear = 0;
        this.studentCount = 0;
    }
    public T3P1_University(String name,String location, int establishedYear){
        this.name= name;
        this.location=location;
        this.establishedYear= establishedYear;
        this.studentCount=0;
    }
    public T3P1_University(String name, String location, int establishedYear, int studentCount){
        this.name = name;
        this.location = location;
        this.establishedYear= establishedYear;
        this.studentCount= studentCount;
    }
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static void main(String[] args) {
        T3P1_University uni1 = new T3P1_University(); // Initializes uni1 with default values: Unknown, Unknown, 0, 0
        T3P1_University uni2 = new T3P1_University("ABC University"); // Initializes uni2 with name "ABC University" and default values for other variables Unknown, 0, 0
        T3P1_University uni3 = new T3P1_University("XYZ University", "City Center", 1990); // Initializes uni3 with name "XYZ University", location "City Center", established year 1990, and default student count 0
        T3P1_University uni4 = new T3P1_University("PQR University", "Suburb Area", 2005, 5000); // Initializes uni4 with name "PQR University", location "Suburb Area", established year 2005, and student count 5000

        // Testing by printing the details of each university
        System.out.println("University 1: Name - " + uni1.getName() + ", Location - " + uni1.getLocation() +
                ", Established Year - " + uni1.getEstablishedYear() + ", Student Count - " + uni1.getStudentCount());

        System.out.println("University 2: Name - " + uni2.getName() + ", Location - " + uni2.getLocation() +
                ", Established Year - " + uni2.getEstablishedYear() + ", Student Count - " + uni2.getStudentCount());

        System.out.println("University 3: Name - " + uni3.getName() + ", Location - " + uni3.getLocation() +
                ", Established Year - " + uni3.getEstablishedYear() + ", Student Count - " + uni3.getStudentCount());

        System.out.println("University 4: Name - " + uni4.getName() + ", Location - " + uni4.getLocation() +
                ", Established Year - " + uni4.getEstablishedYear() + ", Student Count - " + uni4.getStudentCount());
    }


}
