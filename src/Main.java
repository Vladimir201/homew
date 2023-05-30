public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1");
        byte byteValue = 127;
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
        short shortValue = 32767;
        System.out.println("Значение переменной shortValue с типом byte равно " + shortValue);
        int intValue = 2147483647;
        System.out.println("Значение переменной intValue с типом byte равно " + intValue);
        long longValue = 9223372036854775807L;
        System.out.println("Значение переменной longValue с типом byte равно " + longValue);
        float floatValue = 34028254654654.654F;
        System.out.println("Значение переменной floatValue с типом byte равно " + floatValue);
        double doubleValue = 54654312164.44444D;
        System.out.println("Значение переменной doubleValue с типом byte равно " + doubleValue);
    }
    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");
        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        char d = 569;
        short i = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int paper = 480;
        int forOneStudentPaper = paper / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + forOneStudentPaper + " листов бумаги");
    }
    public static void task4(){
        System.out.println(" ");
        System.out.println("Exercise 4");
        int bottleInATwoMinutes = 16;
        int timeMinutes = 2;
        int bottleInAOneMinutes = bottleInATwoMinutes / timeMinutes;
        int bottleInATwentyMinutes = bottleInAOneMinutes * 20;
        System.out.println("За 20 минту машина произвела " + bottleInATwentyMinutes + " штук бутылок");
        int bottleInADay = bottleInAOneMinutes * 60 * 24;
        System.out.println("За день машина произвела " + bottleInADay + " штук бутылок");
        int bottleInAThreeDay = bottleInADay * 3;
        System.out.println("За три дня машина произвела " + bottleInAThreeDay + " штук бутылок");
        int bottleInAMonth = bottleInADay * 30;
        System.out.println("За месяц машина произвела " + bottleInAMonth + " штук бутылок");
    }
    public static void task5(){
        System.out.println(" ");
        System.out.println("Exercise 5");
        int allJar = 120;
        int whiteJar = 2;
        int brownJar = 4;
        int spentOneClass = 6;
        int classes = allJar / spentOneClass;
        int whiteJarTotal = classes * whiteJar;
        int brownJarTotal = classes * brownJar;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteJarTotal + " банок белой краски и " +brownJarTotal + " банок коричневой краски");
    }
    public static void task6(){
        System.out.println(" ");
        System.out.println("Exercise 6");
        int banana = 5;
        int weightBanana = 80;
        int milkMl = 200;
        int weightMilkOneHundredMl = 105;
        int iceCreamBloсks = 2;
        int weightIceCreamBlock = 100;
        int eggs = 4;
        int weightEgg = 70;
        int totalWeight = (banana * weightBanana) + ((milkMl / 100) * weightMilkOneHundredMl) + (iceCreamBloсks * weightIceCreamBlock)
                + (eggs * weightEgg);
        System.out.println("Вес завтрака в граммах равен " + totalWeight);
        double totalWeightInKg = totalWeight / 1000;
        System.out.println("Вес завтрака в килограммах равен " + totalWeightInKg);
    }
    public static void task7(){
        System.out.println(" ");
        System.out.println("Exercise 7");
        byte extraWeight = 7;
        double leaveMinWeight = 0.250;
        double leaveMaxWeight = 0.500;
        double dayMaxLoseWeight = extraWeight / leaveMinWeight;
        double dayMinLoseWeight = extraWeight / leaveMaxWeight;
        double mediumDayForLoseWeight = (dayMinLoseWeight + dayMaxLoseWeight) / 2;
        System.out.println("Если спортсмен будет худеть по " + leaveMinWeight + " кг, то он похудеет за " + dayMaxLoseWeight +
                " дней, если спортсмен будет худеть по " + leaveMaxWeight +  " кг, то он похуйеет за " + dayMinLoseWeight +
                " дней, спортсмен в средгнем похуйдеет за " + mediumDayForLoseWeight + " дней");

    }
    public static void task8(){
        System.out.println(" ");
        System.out.println("exercise 8");
        int salaryMasha = 67760;
        double indexing = 0.1;
        double newSalaryMasha = salaryMasha + (salaryMasha * indexing);
        int oldYearlySalaryMasha = salaryMasha * 12;
        int newYearlySalaryMasha = (int)newSalaryMasha * 12;
        int diffYearlySalaryMasha = newYearlySalaryMasha % oldYearlySalaryMasha;
        System.out.println("Маша теперь получает в месяц " + newSalaryMasha + " ,годовой доход составляет " + diffYearlySalaryMasha);
        int salaryDen = 83690;
        double newSalaryDen = salaryDen + (salaryDen * indexing);
        int oldYearlySalaryDen = salaryDen * 12;
        int newYearlySalaryDen = (int)newSalaryDen * 12;
        int diffYearlySalaryDen = newYearlySalaryDen % oldYearlySalaryDen;
        System.out.println("Денис теперь получает в месяц " + newSalaryDen + " ,годовой доход составляет " + diffYearlySalaryDen);
        int salaryKristin = 76230;
        double newSalaryKristin = salaryKristin + (salaryKristin * indexing);
        int oldYearlySalaryKristin = salaryKristin * 12;
        int newYearlySalaryKristin = (int)newSalaryKristin * 12;
        int diffYearlySalaryKristin = newYearlySalaryKristin % oldYearlySalaryKristin;
        System.out.println("Кристина теперь получает в месяц " + newSalaryKristin + " ,годовой доход составляет " + diffYearlySalaryKristin);


    }

}