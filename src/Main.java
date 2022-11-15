public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 4");
        System.out.println(" ");
        System.out.println("Part 1");
        System.out.println("Task 1");
        int michael = 18;
        if (michael >= 18) {
            System.out.println("Michael, поздравляем с совершеннолетием!");
        }
        if (michael < 18) {
            System.out.println("Michael, подождите немного, скоро вы станете совсем взрослым");
        }
        int liza = 17;
        if (liza >= 18) {
            System.out.println("Liza, поздравляем с совершеннолетием");
        }
        if (liza < 18) {
            System.out.println("Liza, подождите немного, скоро вы станете совсем взрослой");
        }
        System.out.println(" ");

        System.out.println("Task 2");
        int masha = 7;
        if (masha >= 7 && masha < 18) {
            System.out.println("Маша ходит в школу");
        }
        if (masha >= 18 && masha < 24) {
            System.out.println("Маша уже закончила школу и может поступать в университет");
        }
        if (masha >= 24) {
            System.out.println("Маша уже закончила университет и может устраиваться на работу");
        }
        int sasha = 18;
        if (sasha >= 7 && sasha < 18) {
            System.out.println("Саша ходит в школу");
        }
        if (sasha >= 18 && sasha < 24) {
            System.out.println("Саша уже закончила школу и может поступать в университет");
        }
        if (sasha >= 24) {
            System.out.println("cаша уже закончила университет и может устраиваться на работу");
        }
        int dasha = 24;
        if (dasha >= 7 && dasha < 18) {
            System.out.println("Даша ходит в школу");
        }
        if (dasha >= 18 && dasha < 24) {
            System.out.println("Даша уже закончила школу и может поступать в университет");
        }
        if (dasha >= 24) {
            System.out.println("Даша уже закончила университет и может устраиваться на работу");
        }
        System.out.println(" ");
        System.out.println("Task 3");
        int capacity = 102;
        int seatsPlaces = 60;
        int standingPlaces = capacity - seatsPlaces;

        int seatsUsed = 60;
        int standingUsed = 42;
        if (seatsPlaces > seatsUsed) {
            System.out.println("В вагоне есть сидячие места в количестве " + (seatsPlaces - seatsUsed));
        }
        if (seatsPlaces == seatsUsed) {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (standingPlaces > standingUsed) {
            System.out.println("В вагоне есть стоячие места в количестве " + (standingPlaces - standingUsed));
        }
        if (standingPlaces == standingUsed) {
            System.out.println("В вагоне нет стоячих мест");
        }
        if (standingPlaces == standingUsed && seatsPlaces <= seatsUsed) {
            System.out.println("Вагон полностью забит. Пожалуйста, пройдите в другой вагон.");
        }
        System.out.println(" ");


        System.out.println("Part 2");
        System.out.println("Task 1");
        int michael1 = 18;
        if (michael1 >= 18) {
            System.out.println("Michael, поздравляем с совершеннолетием!");
        } else {
            System.out.println("Michael, подождите немного, скоро вы станете совсем взрослым");
        }
        int liza1 = 17;
        if (liza1 >= 18) {
            System.out.println("Liza, поздравляем с совершеннолетием");
        } else {
            System.out.println("Liza, подождите немного, скоро вы станете совсем взрослой");
        }
        System.out.println("");
        System.out.println("Task 2");
        int masha1 = 7;
        if (masha1 >= 7 && masha1 < 18) {
            System.out.println("Маша ходит в школу");
        } else if (masha1 >= 18 && masha1 < 24) {
            System.out.println("Маша уже закончила школу и может поступать в университет");
        } else {
            System.out.println("Маша уже закончила университет и может устраиваться на работу");
        }
        int sasha1 = 18;
        if (sasha1 >= 7 && sasha1 < 18) {
            System.out.println("Саша ходит в школу");
        } else if (sasha1 >= 18 && sasha1 < 24) {
            System.out.println("Саша уже закончила школу и может поступать в университет");
        } else {
            System.out.println("Даша уже закончила университет и может устраиваться на работу");
        }
        int dasha1 = 24;
        if (dasha1 >= 7 && dasha1 < 18) {
            System.out.println("Даша ходит в школу");
        } else if (dasha1 >= 18 && dasha1 < 24) {
            System.out.println("Даша уже закончила школу и может поступать в университет");
        } else {
            System.out.println("Даша уже закончила университет и может устраиваться на работу");
        }
        System.out.println(" ");

        System.out.println("Task 3");
        int capacity1 = 102;
        int seatsPlaces1 = 60;
        int standingPlaces1 = capacity1 - seatsPlaces1;

        int seatsUsed1 = 59;
        int standingUsed1 = 42;
        if (seatsPlaces1 > seatsUsed1) {
            System.out.println("В вагоне есть сидячие места в количестве " + (seatsPlaces1 - seatsUsed1));
        } else {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (standingPlaces1 > standingUsed1) {
            System.out.println("В вагоне есть стоячие места в количестве " + (standingPlaces1 - standingUsed1));
        } else {
            System.out.println("В вагоне нет стоячих мест");
        }
        if (standingPlaces1 == standingUsed1 && seatsPlaces1 <= seatsUsed1) {
            System.out.println("Вагон полностью забит. Пожалуйста, пройдите в другой вагон.");
        }
        System.out.println(" ");


        System.out.println("Part 3");
        System.out.println("Task 1");
        int age = 27;
        boolean needToGoKindergarten = age >= 2 && age <= 6;
        boolean needToGoToSchool = age >= 7 && age <= 18;
        boolean needToGoToUniversity = age > 18 && age <= 24;
        boolean needToGoToWork = age > 24;
        if (needToGoKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (needToGoToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (needToGoToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (needToGoToWork) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        System.out.println("");

        System.out.println("Part 3");
        System.out.println("Task 2");
        int baby = 17;
        boolean ridesAreNotAllowed = baby < 5;
        boolean youCanRideOnlyWithAdults = baby >= 5 && baby < 14;
        boolean youCanRideSingle = baby >= 14;
        if (ridesAreNotAllowed) {
            System.out.println("Если возраст ребенка равен " + baby + ", то ему нельзя кататься на аттракционах");
        } else if (youCanRideOnlyWithAdults) {
            System.out.println("Если возраст ребенка равен " + baby + ", то ему можно кататься на аттракционах только в присутствии взрослых");
        } else if (youCanRideSingle) {
            System.out.println("Если возраст ребенка равен " + baby + ", то ему можно кататься на аттракционах без сопровождения взрослых");
        }
        System.out.println("");

        System.out.println("Task 3");
        int one = -456;
        int two = 856;
        int three = 46;

        if (one > two) {
            if (one > three) {
                System.out.println("Самое большое число = " + one);
            } else if (one == three) {
                System.out.println("Числа one и three равны, значение каждого из них = " + one);
            } else {
                System.out.println("Самоебольшое число = " + three);
            }
        }
        if (two > one) {
            if (two > three) {
                System.out.println("Самое большое число = " + two);
            } else if (two == three) {
                System.out.println("Числа two и three равны, значение каждого из них = " + two);
            } else {
                System.out.println("Самоебольшое число = " + three);
            }
        }
        if (one == two && one == three) {
            System.out.println("Числа one, two и three равны, значение каждого из них = " + two);
        }
        if (one == two && one > three) {
            System.out.println("Числа one и two равны, значение каждого из них = " + two);
        }
        if (one == two && three > one){
            System.out.println("Самое большое число = " + three);
        }
    }
}
