public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        var friend = 19;

        System.out.println(dog+" Задача 1");
        System.out.println(cat+" Задача 1");
        System.out.println(paper+" Задача 1");

         dog = dog +2;
          cat = cat +2;
          paper = paper +2;
           System.out.println(dog+" Задача 2");
           System.out.println(cat+" Задача 2");
           System.out.println(paper+" Задача 2");

            dog = dog -3.5;
            cat = cat -1.6;
            paper = paper -7639;
             System.out.println(dog+" Задача 3");
             System.out.println(cat+" Задача 3");
             System.out.println(paper+" Задача 3");

              System.out.println(friend+" Задача 4");
              friend = friend +2;
              System.out.println(friend+" Задача 4");
              friend = friend /7;
              System.out.println(friend+" Задача 4");

        var frog = 3.5;
        System.out.println(frog+" Задача 5");
        frog = frog *10;
        System.out.println(frog+" Задача 5");
        frog = frog /3.5;
        System.out.println(frog+" Задача 5");
        frog = frog +4;
        System.out.println(frog+" Задача 5");

        var liftingBox1 = 78.2;
        var liftingBox2 = 82.7;
        System.out.println("Вес первого бойца "+ liftingBox1+ " Задача 6");
        System.out.println("Вес второго бойца "+liftingBox2+ " Задача 6");
        var ollBox = liftingBox1+liftingBox2;
        System.out.println("Общий вес бойцов "+ollBox+ " Задача 6");
        var differenceBox = liftingBox2-liftingBox1;
        System.out.println("Рзница в весе бойцов "+differenceBox+" Задача 6-7 ");
        var differenceBox1 = liftingBox2 % liftingBox1;
        System.out.println("Рзница в весе бойцов "+differenceBox1+" Задача 7");

        var workTime = 640;
        var workStaff = workTime/8;
        System.out.println("Всего сотрдников "+workStaff+" человек"+" Задача 8");
        var workersStuff = 94;
        var workTimeWork = workTime/workersStuff;
        System.out.println("Если в компании работает "+workersStuff+" человек,то всего "+workTimeWork+" часов работы может быть поделено между сотрудниками"+ " Задача 8");











    }
}