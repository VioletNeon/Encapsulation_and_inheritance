public class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int calculateAmountOfQualities() {
        return transgressionDistance + magicPower;
    }

    public void printQualities() {
        System.out.println("Hogwarts student " + this.getName() + " qualities are " + "power of magic - " + magicPower + ", transgression distance - " + transgressionDistance + ";");
    }

    public void compareWithOtherHogwartsStudent(HogwartsStudent otherStudent) {
        int currentStudentQualitiesCount = this.calculateAmountOfQualities();
        int otherStudentQualitiesCount = otherStudent.calculateAmountOfQualities();

        if (currentStudentQualitiesCount > otherStudentQualitiesCount) {
            System.out.println("Hogwarts student " + this.getName() + " is more powerful than student " + otherStudent.getName() + "\n");
        } else if (currentStudentQualitiesCount < otherStudentQualitiesCount) {
            System.out.println("Hogwarts student " + otherStudent.getName() + " is more powerful than student " + this.getName() + "\n");
        } else {
            System.out.println("Hogwarts students " + this.getName() + " and " + otherStudent.getName() + " are equal" + "\n");
        }
    }

    static public void compareHogwartsStudentsEachOther(HogwartsStudent firstStudent, HogwartsStudent secondStudent) {
        int firstStudentQualitiesCount = firstStudent.calculateAmountOfQualities();
        int secondStudentQualitiesCount = secondStudent.calculateAmountOfQualities();

        if (firstStudentQualitiesCount > secondStudentQualitiesCount) {
            System.out.println("Hogwarts student " + firstStudent.getName() + " is more powerful than student " + secondStudent.getName() + "\n");
        } else if (firstStudentQualitiesCount < secondStudentQualitiesCount) {
            System.out.println("Hogwarts student " + secondStudent.getName() + " is more powerful than student " + firstStudent.getName() + "\n");
        } else {
            System.out.println("Hogwarts students " + firstStudent.getName() + " and " + secondStudent.getName() + " are equal" + "\n");
        }
    }
}
