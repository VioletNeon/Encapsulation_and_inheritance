public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);

        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void printQualities() {
        super.printQualities();
        System.out.println("Griffindor student qualities are " + "nobility - " + nobility + ", honor - " + honor + ", courage - " + courage + ";" + "\n");
    }

    public int calculateAmountOfFacultyQualities() {
        return nobility + honor + courage;
    }

    public void compareWithOtherGriffindorStudent(GriffindorStudent otherStudent) {
        int currentStudentQualitiesCount = this.calculateAmountOfFacultyQualities();
        int otherStudentQualitiesCount = otherStudent.calculateAmountOfFacultyQualities();

        if (currentStudentQualitiesCount > otherStudentQualitiesCount) {
            System.out.println(this.getName() + " is better Griffindor student than " + otherStudent.getName() + "\n");
        } else if (currentStudentQualitiesCount < otherStudentQualitiesCount) {
            System.out.println(otherStudent.getName() + " is better Griffindor student than " + this.getName() + "\n");
        } else {
            System.out.println("Griffindor students " + this.getName() + " and " + otherStudent.getName() + " are equal" + "\n");
        }
    }

    static public void compareGriffindorStudentsEachOther(GriffindorStudent firstStudent, GriffindorStudent secondStudent) {
        int firstStudentQualitiesCount = firstStudent.calculateAmountOfFacultyQualities();
        int secondStudentQualitiesCount = secondStudent.calculateAmountOfFacultyQualities();

        if (firstStudentQualitiesCount > secondStudentQualitiesCount) {
            System.out.println(firstStudent.getName() + " is better Griffindor student than " + secondStudent.getName() + "\n");
        } else if (firstStudentQualitiesCount < secondStudentQualitiesCount) {
            System.out.println(secondStudent.getName() + " is better Griffindor student than " + firstStudent.getName() + "\n");
        } else {
            System.out.println("Griffindor students " + firstStudent.getName() + " and " + secondStudent.getName() + " are equal" + "\n");
        }
    }
}
