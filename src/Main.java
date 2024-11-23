public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Griffindor:" + "\n");
        GriffindorStudent harryPotter = new GriffindorStudent("Harry Potter", 300, 200, 90, 90, 95);
        GriffindorStudent hermioneGranger = new GriffindorStudent("Hermione Granger", 280, 220, 80, 85, 90);
        GriffindorStudent ronWeasley = new GriffindorStudent("Ron Weasley", 250, 190, 85, 90, 90);

        harryPotter.printQualities();
        hermioneGranger.printQualities();
        ronWeasley.printQualities();

        GriffindorStudent.compareGriffindorStudentsEachOther(harryPotter, hermioneGranger);
        GriffindorStudent.compareGriffindorStudentsEachOther(harryPotter, ronWeasley);
        GriffindorStudent.compareGriffindorStudentsEachOther(hermioneGranger, ronWeasley);

        HogwartsStudent.compareHogwartsStudentsEachOther(harryPotter, hermioneGranger);
        HogwartsStudent.compareHogwartsStudentsEachOther(harryPotter, ronWeasley);

        System.out.println("\n" + "Slytherin:" + "\n");
        SlytherinStudent dracoMalfoy = new SlytherinStudent("Draco Malfoy", 275, 190, 90, 90, 95, 90, 80);
        SlytherinStudent grahamMontague = new SlytherinStudent("Graham Montague", 245, 170, 80, 90, 85, 70, 85);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Gregory Goyle", 240, 173, 75, 95, 80, 70, 80);

        dracoMalfoy.printQualities();
        grahamMontague.printQualities();
        gregoryGoyle.printQualities();

        SlytherinStudent.compareSlytherinStudentsEachOther(dracoMalfoy, grahamMontague);
        SlytherinStudent.compareSlytherinStudentsEachOther(dracoMalfoy, gregoryGoyle);
        SlytherinStudent.compareSlytherinStudentsEachOther(grahamMontague, gregoryGoyle);

        HogwartsStudent.compareHogwartsStudentsEachOther(dracoMalfoy, harryPotter);
        HogwartsStudent.compareHogwartsStudentsEachOther(dracoMalfoy, grahamMontague);

        System.out.println("\n" + "Hufflepuff:" + "\n");
        HufflepuffStudent zachariahSmith = new HufflepuffStudent("Zachariah Smith", 250, 190, 80, 85, 90);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Cedric Diggory", 290, 210, 90, 90, 95);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Justin Finch-Fletchley", 250, 190, 85, 80, 90);

        zachariahSmith.printQualities();
        cedricDiggory.printQualities();
        justinFinchFletchley.printQualities();

        HufflepuffStudent.compareHufflepuffStudentsEachOther(zachariahSmith, cedricDiggory);
        HufflepuffStudent.compareHufflepuffStudentsEachOther(zachariahSmith, justinFinchFletchley);
        HufflepuffStudent.compareHufflepuffStudentsEachOther(cedricDiggory, justinFinchFletchley);

        HogwartsStudent.compareHogwartsStudentsEachOther(zachariahSmith, dracoMalfoy);
        HogwartsStudent.compareHogwartsStudentsEachOther(cedricDiggory, harryPotter);

        System.out.println("\n" + "Ravenclaw:" + "\n");
        RavenclawStudent choChang = new RavenclawStudent("Cho Chang", 275, 210, 80, 90, 85, 70);
        RavenclawStudent padmaPatil = new RavenclawStudent("Padma Patil", 285, 230, 85, 85, 85, 75);
        RavenclawStudent marcusBelby = new RavenclawStudent("Marcus Belby", 280, 225, 85, 80, 90, 70);

        choChang.printQualities();
        padmaPatil.printQualities();
        marcusBelby.printQualities();

        RavenclawStudent.compareRavenclawStudentsEachOther(choChang, padmaPatil);
        RavenclawStudent.compareRavenclawStudentsEachOther(choChang, marcusBelby);
        RavenclawStudent.compareRavenclawStudentsEachOther(padmaPatil, marcusBelby);

        HogwartsStudent.compareHogwartsStudentsEachOther(choChang, justinFinchFletchley);
        HogwartsStudent.compareHogwartsStudentsEachOther(grahamMontague, marcusBelby);
    }
}