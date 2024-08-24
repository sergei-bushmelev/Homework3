public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 10;
        byte b = -10;
        short c = 11;
        long d = 12L;
        float e = 10.1f;
        double f = -10.1;
        System.out.println("Значение переменной a с типом int равно " + a + "\n" + "Значение переменной b с типом byte равно " + b + "\n" + "Значение переменной c с типом short равно " + c + "\n" + "Значение переменной d с типом long равно " + d + "\n" + "Значение переменной e с типом float равно " + e + "\n" + "Значение переменной f с типом double равно " + f);

        //Задача 2
        float fl = 27.12f;
        long lo = 987678965549L;
        float fl1 = 2.786f;
        short sh = 569;
        short sh1 = 159;
        short sh2 = 27897;
        byte by = 67;

        //Задача 3
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        int totalStudents = classLP + classAS + classEA;
        short totalPaper = 480;
        int paperPerPerson = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerPerson + " листов бумаги");

        //Задача 4
        byte baseProductivity = 16 / 2;
        int productivity20Min = baseProductivity * 20;
        int productivityDay  = baseProductivity * 1440;
        int productivity3Days = productivityDay * 3;
        int productivityMonth = productivityDay * 30;
        System.out.println("За 20 минут машина произвела " + productivity20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");

        //Задача 5
        byte totalCans = 120;
        byte whiteCan = 2;
        byte brownCan = 4;
        int cansPerClassroom = whiteCan + brownCan;
        int totalClassrooms = totalCans / cansPerClassroom;
        int totalWhiteCans = whiteCan * totalClassrooms;
        int totalBrownCans = brownCan * totalClassrooms;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6
        short weightBanana = 80;
        short weightMilk = 105;
        short weightIce = 100;
        short weightEgg = 70;
        int totalWeightBanana = weightBanana * 5;
        int totalWeightMilk = weightMilk * 2;
        int totalWeightIce = weightIce * 2;
        int totalWeightEggs = weightEgg * 4;
        int totalWeightGr = totalWeightBanana + totalWeightMilk + totalWeightIce + totalWeightEggs;
        float totalWeightKg = (float) totalWeightGr / 1000f;
        System.out.println("Общий вес завтрака спортсмена равен " + totalWeightGr + " гр или " + totalWeightKg + " кг.");

        //Задача 7
        byte targetWeightKg = 7;
        int targetWeightGr = 7 * 1000;
        int losesWeight250 = targetWeightGr / 250;
        int losesWeight500 = targetWeightGr / 500;
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм, то у него уйдет " + losesWeight250 + " дней.");
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм, то у него уйдет " + losesWeight500 + " дней.");

        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int newSalaryMasha = (int) (67760 * 0.1) + 67760;
        int newSalaryDenis = (int) ((83690 * 0.1) + 83690);
        int newSalaryKris = (int) ((76230 * 0.1) + 76230);
        int newSalaryMashaYear = newSalaryMasha * 12;
        int newSalaryDenisYear = newSalaryDenis * 12;
        int newSalaryKrisYear = newSalaryKris * 12;
        int differenceSalaryMashaYear = newSalaryMashaYear - (salaryMasha * 12);
        int differenceSalaryDenisYear = newSalaryDenisYear - (salaryDenis * 12);
        int differenceSalaryKrisYear = newSalaryKrisYear - (salaryKris * 12);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMashaYear + " рублей");
        System.out.println("Маша теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenisYear + " рублей");
        System.out.println("Маша теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + differenceSalaryKrisYear + " рублей");

    }
}