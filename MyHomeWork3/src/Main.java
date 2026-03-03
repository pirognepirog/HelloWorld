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
        var unionMass = 0.0;
        var weightDifference = 0.0;
        var remainsWeightDifference = 0.0;

        unionMass = Man1 + Man2;
            System.out.println("Общая масса = " + unionMass);
        weightDifference = Man2 - Man1;
        System.out.println("Разница веса = " + weightDifference);

        System.out.println ("              Test 7");
        remainsWeightDifference = Man2 % Man1;
        System.out.println("Остаток от деления между двумя весами = " + remainsWeightDifference);

        System.out.println ("              Test 8");
//640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
// //то сколько всего работников в компании? Выведите результат задачи в консоль в формате:
// «Всего работников в компании — … человек».
        System.out.println ("              Test 9");
        var nHours = 640;//общее количество часов
        var jobDay = 8;//рабочий день
        var x_Man = 0;//искомое количество работников
        x_Man = nHours / jobDay;
        System.out.println("Всего работников в компании " + x_Man + " человек!!!");

//Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает
// на 94 человека больше. Выведите результат задачи в консоль в формате: «Если в компании работает … человек,
// то всего … часов работы может быть поделено между сотрудниками».
        System.out.println ("              Test 10");
        var o_Man = 94;//увеличение количества людей в компании
        var x_Hours = 0;//искомое количество часов
        var unionMan = 0;//общее количество людей в компании
        x_Hours = (x_Man + o_Man) * 8;
        unionMan = x_Man + o_Man;
        //этот вариант явно не лучший, так как осуществляются лишние вычисления
        // лучше по идее так:
        //UnionMan = X_man + O_Man;
        //X_Hours = UnionMan * 8;
        //так мешьше будут затрагиваться вычислительные мощности, но для этого кода без разници, так как расчет не
        // сложный, оставил так!!! Если это не важно!
        System.out.println("Если в компании работает " + unionMan + " человека, то всего "+ x_Hours +" часов работы может быть поделено между сотрудниками");

    }
}