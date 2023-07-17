public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

}