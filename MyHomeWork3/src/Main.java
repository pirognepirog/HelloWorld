//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println ("           Test 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper  = 763789;
            System.out.println ("Dog = " + dog);
            System.out.println ("Cat = " + cat);
            System.out.println ("Paper = " + paper);

        System.out.println ("          Test 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

            System.out.println ("Dog = " + dog);
            System.out.println ("Cat = " + cat);
            System.out.println ("Paper = " + paper);

        System.out.println ("           Test 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

            System.out.println ("Dog = " + dog);
            System.out.println ("Cat = " + cat);
            System.out.println ("Paper = " + paper);

        System.out.println ("            Test 4");
        var friend = 19;
        System.out.println ("friend = " + friend);
           friend = friend + 2;
           System.out.println ("friend = " + friend);
                friend = friend / 7;
                System.out.println ("friend = " + friend);

        System.out.println ("              Test 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println ("frog = " + frog);
            frog = frog / 3.5;
            System.out.println("frog = " + frog);
                frog = frog + 4;
                System.out.println("frog = " + frog);

        System.out.println ("              Test 6");
        var Man1 = 78.2;
        var Man2 = 82.7;
        var UnionMass = 0.0;
        var WeightDifference = 0.0;
        var RemainsWeightDifference = 0.0;

        UnionMass = Man1 + Man2;
            System.out.println("Общая масса = " + UnionMass);
        WeightDifference = Man2 - Man1;
        System.out.println("Разница веса = " + WeightDifference);

        System.out.println ("              Test 7");
        RemainsWeightDifference = Man2 % Man1;
        System.out.println("Остаток от деления между двумя весами = " + RemainsWeightDifference);

        System.out.println ("              Test 8");
//640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
// //то сколько всего работников в компании? Выведите результат задачи в консоль в формате:
// «Всего работников в компании — … человек».
        System.out.println ("              Test 9");
        var Nhours = 640;//общее количество часов
        var JobDay = 8;//рабочий день
        var X_man = 0;//искомое количество работников
        X_man = Nhours / JobDay;
        System.out.println("Всего работников в компании " + X_man + " человек!!!");

//Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает
// на 94 человека больше. Выведите результат задачи в консоль в формате: «Если в компании работает … человек,
// то всего … часов работы может быть поделено между сотрудниками».
        System.out.println ("              Test 10");
        var O_Man = 94;//увеличение количества людей в компании
        var X_Hours = 0;//искомое количество часов
        var UnionMan = 0;//общее количество людей в компании
        X_Hours = (X_man + O_Man) * 8;
        UnionMan = X_man + O_Man;
        //этот вариант явно не лучший, так как осуществляются лишние вычисления
        // лучше по идее так:
        //UnionMan = X_man + O_Man;
        //X_Hours = UnionMan * 8;
        //так мешьше будут затрагиваться вычислительные мощности, но для этого кода без разници, так как расчет не
        // сложный, оставил так!!! Если это не важно!
        System.out.println("Если в компании работает " + UnionMan + " человека, то всего "+ X_Hours +" часов работы может быть поделено между сотрудниками");

    }
}