public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, magicPower, transgressionDistance);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

    public void printQualities() {
        super.printQualities();
        System.out.println("Slytherin student qualities are " + "cunning - " + cunning + ", determination - " + determination + ", ambition - " + ambition + ", resourcefulness - " + resourcefulness + ", lust for power - " + lustOfPower + ";" + "\n");
    }

    public int calculateAmountOfFacultyQualities() {
        return cunning + determination + ambition + resourcefulness + lustOfPower;
    }

    public void compareWithOtherSlytherinStudent(SlytherinStudent otherStudent) {
        int currentStudentQualitiesCount = this.calculateAmountOfFacultyQualities();
        int otherStudentQualitiesCount = otherStudent.calculateAmountOfFacultyQualities();

        if (currentStudentQualitiesCount > otherStudentQualitiesCount) {
            System.out.println(this.getName() + " is better Slytherin student than " + otherStudent.getName() + "\n");
        } else if (currentStudentQualitiesCount < otherStudentQualitiesCount) {
            System.out.println(otherStudent.getName() + " is better Slytherin student than " + this.getName() + "\n");
        } else {
            System.out.println("Slytherin students " + this.getName() + " and " + otherStudent.getName() + " are equal" + "\n");
        }
    }

    static public void compareSlytherinStudentsEachOther(SlytherinStudent firstStudent, SlytherinStudent secondStudent) {
        int firstStudentQualitiesCount = firstStudent.calculateAmountOfFacultyQualities();
        int secondStudentQualitiesCount = secondStudent.calculateAmountOfFacultyQualities();

        if (firstStudentQualitiesCount > secondStudentQualitiesCount) {
            System.out.println(firstStudent.getName() + " is better Slytherin student than " + secondStudent.getName() + "\n");
        } else if (firstStudentQualitiesCount < secondStudentQualitiesCount) {
            System.out.println(secondStudent.getName() + " is better Slytherin student than " + firstStudent.getName() + "\n");
        } else {
            System.out.println("Slytherin students " + firstStudent.getName() + " and " + secondStudent.getName() + " are equal" + "\n");
        }
    }
}
