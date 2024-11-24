public class HufflepuffStudent extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);

        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void printQualities() {
        super.printQualities();
        System.out.println("Hufflepuff student qualities are " + "hardworking - " + hardworking + ", loyal - " + loyal + ", honest - " + honest + ";" + "\n");
    }

    public int calculateAmountOfFacultyQualities() {
        return hardworking + loyal + honest;
    }

    public void compareWithOtherHufflepuffStudent(HufflepuffStudent otherStudent) {
        int currentStudentQualitiesCount = this.calculateAmountOfFacultyQualities();
        int otherStudentQualitiesCount = otherStudent.calculateAmountOfFacultyQualities();

        if (currentStudentQualitiesCount > otherStudentQualitiesCount) {
            System.out.println(this.getName() + " is better Hufflepuff student than " + otherStudent.getName() + "\n");
        } else if (currentStudentQualitiesCount < otherStudentQualitiesCount) {
            System.out.println(otherStudent.getName() + " is better Hufflepuff student than " + this.getName() + "\n");
        } else {
            System.out.println("Hufflepuff students " + this.getName() + " and " + otherStudent.getName() + " are equal" + "\n");
        }
    }

    static public void compareHufflepuffStudentsEachOther(HufflepuffStudent firstStudent, HufflepuffStudent secondStudent) {
        int firstStudentQualitiesCount = firstStudent.calculateAmountOfFacultyQualities();
        int secondStudentQualitiesCount = secondStudent.calculateAmountOfFacultyQualities();

        if (firstStudentQualitiesCount > secondStudentQualitiesCount) {
            System.out.println(firstStudent.getName() + " is better Hufflepuff student than " + secondStudent.getName() + "\n");
        } else if (firstStudentQualitiesCount < secondStudentQualitiesCount) {
            System.out.println(secondStudent.getName() + " is better Hufflepuff student than " + firstStudent.getName() + "\n");
        } else {
            System.out.println("Hufflepuff students " + firstStudent.getName() + " and " + secondStudent.getName() + " are equal" + "\n");
        }
    }
}
