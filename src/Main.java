public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int age = 18;
        System.out.println("Человеку " + age);
        if(age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека меньше " + age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2(){
        System.out.println("Задача 2");
        byte temperatureOutside = 5;
        System.out.println("Температура " + temperatureOutside);
        if(temperatureOutside < 5){
            System.out.println("На улице  " + temperatureOutside +  " градусов, нужно надеть шапку.");
        }else {
            System.out.println("На улице " + temperatureOutside +  " градусов, можно идти без шапки.");
        }

    }

    public static void task3(){
        System.out.println("Задача 3");
        short driverSpeed = 61;
        if(driverSpeed > 60){
            System.out.println("Если скорость " + driverSpeed + " , то придется заплатить штраф.");
        }else {
            System.out.println("Если скорость " + driverSpeed + " , то можно ездить спокойно.");
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        byte age = 11;
        if(age < 2){
            System.out.println("Если возраст человека равен " + age + " , то ему пора спать.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему можно не спать.");
        }
        if (age >=2 && age <6){
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не должен ходить в детский сад.");
        }
        if (age >=7 && age < 18){
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он может не ходить в школу.");
        }
        if (age > 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + " , то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то его место не в университете.");
        }
        if (age > 24){
            System.out.println("Если возраст человека равен " + age + " , то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему может не ходить на работу.");
        }
        if (age > 60){
            System.out.println("Если возраст человека равен " + age + " , то он может отдохнуть.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему не стоит отдохнуть.");
        }

    }

    public static void task5(){
        System.out.println("Задача 5");
        byte age = 5;
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься на аттракционе.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься на аттракционе.");
        }
        if (age >5 && age <14){
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе в сопровождении взрослого)");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься на аттракционе без сопровождения взрослого)");
        }
        if (age > 14){
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься без сопровождения взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " , то он не может кататься без сопровождения взрослого");
        }
    }

    public static void task6(){
        System.out.println("Задача 6");
        short capacityOfOneTrain = 102;
        short seatPlace = 60;
        int standingPlaces = capacityOfOneTrain - seatPlace;
//        System.out.println(standingPlaces);
        boolean thereAreNoSeatsInTheTrain = seatPlace >= 60 && standingPlaces >= 42;
        if (thereAreNoSeatsInTheTrain){
            System.out.println("В вагоне нет мест: сидячих мест " + seatPlace + " , стоячих мест " + standingPlaces);
        } else {
            System.out.println("В вагоне есть места: сидячих мест " + seatPlace + " , стоячих мест " + standingPlaces);
        }

    }

    public static void task7(){
        System.out.println("Задача 7");
        int one = 7;
        int two = 3;
        int three = 5;
        boolean oneMoreThanAll = one > two && one > three;
        boolean twoMoreThanAll = two > one && two > three;
        boolean threeMoreThanAll = three > one && three > two;
        if (oneMoreThanAll){
            System.out.println("Переменная one больше, ее значение: " + one);
        } else if (twoMoreThanAll) {
            System.out.println("Переменная two больше, ее значение: " + two);
        } else if (threeMoreThanAll){
            System.out.println("Переменная three больше, ее значение: " + three);
        }

    }


}