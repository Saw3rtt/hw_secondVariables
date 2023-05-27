public class Main {
    public static void main(String[] args) {
        int bananaVasya = 555555555;
        byte bananaOleg = 100;
        short bananaValery = 30000;
        long bananaIgor = 9000000000000L;
        float bananaMisha = 3.666f;
        double bananaOlya = 5.66644444;
        System.out.println(bananaVasya);
        System.out.println(bananaOleg);
        System.out.println(bananaValery);
        System.out.println(bananaIgor);
        System.out.println(bananaMisha);
        System.out.println(bananaOlya);
        System.out.println();

        float firstValue = 27.12f;
        long secondValue = 987_678_965_549l;
        float thirdMeaning = 2.786f;
        short fourthMeaning = 569;
        short fifthMeaning = -159;
        short sixthValue = 27897;
        byte seventhMeaning = 67;
        System.out.println();

        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short totalPaper = 480;
        int totalStudents = totalPaper / (firstTeacher + secondTeacher + thirdTeacher);
        System.out.println("На каждого ученика рассчитано " + totalStudents + " листов бумаги");
        System.out.println();

        byte machinePerformance = 16;
        byte machineWorkTime = 2;
        byte timeWork = 20;
        short timeWork_2 = 24 * 60;
        short timeWork_3 = 3 * 24 * 60;
        int timeWork_4 = 30 * 24 * 60;
        int bottlePerformance = machinePerformance * timeWork / machineWorkTime;
        int bottlePerformance_1 = machinePerformance * timeWork_2 / machineWorkTime;
        int bottlePerformance_2 = machinePerformance * timeWork_3 / machineWorkTime;
        int bottlePerformance_3 = machinePerformance * timeWork_4 / machineWorkTime;
        System.out.println("За " + timeWork + " минут машина произвела " + bottlePerformance + " бутылок");
        System.out.println("За " + timeWork_2 + " минут машина произвела " + bottlePerformance_1 + " бутылок");
        System.out.println("За " + timeWork_3 + " минут машина произвела " + bottlePerformance_2 + " бутылок");
        System.out.println("За " + timeWork_4 + " минут машина произвела " + bottlePerformance_3 + " бутылок");
        System.out.println();

        byte totalCans = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int schoolClasses = totalCans/(whitePaintPerClass + brownPaintPerClass);
        int whitePaint = whitePaintPerClass * schoolClasses;
        int brownPaint = brownPaintPerClass * schoolClasses;
        System.out.println("В школе, где " + schoolClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");
        System.out.println();

        short bananaWeight = 5 * 80;
        short milkWeight = 200 / 100 * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int totalWeight = bananaWeight + milkWeight  + iceCreamWeight + eggsWeight;
        float kilogramsWeight = totalWeight / 1000f;
        System.out.println(totalWeight + " грамм");
        System.out.println(kilogramsWeight + " килограмм");


    }
}