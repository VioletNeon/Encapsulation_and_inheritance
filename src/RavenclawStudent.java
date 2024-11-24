public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);

        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void printQualities() {
        super.printQualities();
        System.out.println("Ravenclaw student qualities are " + "smart - " + smart + ", wise - " + wise + ", witty - " + witty + ", creativity - " + creativity + ";" + "\n");
    }

    public int calculateAmountOfFacultyQualities() {
        return smart + wise + witty + creativity;
    }

    public void compareWithOtherRavenclawStudent(RavenclawStudent otherStudent) {
        int currentStudentQualitiesCount = this.calculateAmountOfFacultyQualities();
        int otherStudentQualitiesCount = otherStudent.calculateAmountOfFacultyQualities();

        if (currentStudentQualitiesCount > otherStudentQualitiesCount) {
            System.out.println(this.getName() + " is better Ravenclaw student than " + otherStudent.getName() + "\n");
        } else if (currentStudentQualitiesCount < otherStudentQualitiesCount) {
            System.out.println(otherStudent.getName() + " is better Ravenclaw student than " + this.getName() + "\n");
        } else {
            System.out.println("Ravenclaw students " + this.getName() + " and " + otherStudent.getName() + " are equal" + "\n");
        }
    }

    static public void compareRavenclawStudentsEachOther(RavenclawStudent firstStudent, RavenclawStudent secondStudent) {
        int firstStudentQualitiesCount = firstStudent.calculateAmountOfFacultyQualities();
        int secondStudentQualitiesCount = secondStudent.calculateAmountOfFacultyQualities();

        if (firstStudentQualitiesCount > secondStudentQualitiesCount) {
            System.out.println(firstStudent.getName() + " is better Ravenclaw student than " + secondStudent.getName() + "\n");
        } else if (firstStudentQualitiesCount < secondStudentQualitiesCount) {
            System.out.println(secondStudent.getName() + " is better Ravenclaw student than " + firstStudent.getName() + "\n");
        } else {
            System.out.println("Ravenclaw students " + firstStudent.getName() + " and " + secondStudent.getName() + " are equal" + "\n");
        }
    }
}
