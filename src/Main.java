public class Main {
    private static double result;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box =5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityWeight = liftingCapacity - stuffWeight;
        System.out.println( "Еще можно положить " + capacityWeight + " кг вещей ");

        var appleWheight = 2;
        var orangesWeight = 3;
        var fruitsWheith = appleWheight + orangesWeight;
        System.out.println(fruitsWheith);

        var appleTest = 54;
        var orangeTest = 44;
        var capscityTest = appleTest * orangeTest;
        System.out.println(" умножить " + capscityTest + " штук ");

        var vodka = 4;
        var meat = 5;
        var bear = 30;
        var bread = 3;
        var millWheight =  vodka + meat + bear + bread;
        System.out.println(" чтобы нахуяриться нунжо купить" + vodka + meat + bear + bread + "позиций " + "штук");

        var vodkaWheight = 8;
        var meatWheight = 10;
        var bearWheight = 60;
        var breadWheth = 6;
        var eatWheight  = vodkaWheight + meatWheight + bearWheight + breadWheth;
        System.out.println("общий вес попойки" + eatWheight + " кг!");

        eatWheight = eatWheight * 2;
        System.out.println( "Теперь нужно взять больше бухла" +eatWheight );
        var overload = (eatWheight+ meatWheight) % liftingCapacity;
        System.out.println(" хуй его знает" + overload + "штук" );

        short banans = 110;
        System.out.println( "Бананов " + banans + "кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сазара весит" + onePortion + "кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println("дробь" + d );

        int g = (int) (a + 1f);
        System.out.println( "ласт" + g);

        // задача 2
        double boxer1Wheight = 78.2;
        double boxer2Wheight = 82.7;
        double generalWheith = boxer1Wheight +boxer2Wheight;
        System.out.println(" общий вес боксеров" + generalWheith);
        // Задача 3
         int bananas = 5;
         int milk = 200 / 100 * 105;
         int icecream = 100 * 2;
         int eggs = 4 * 70;
         int generalWheighCoctail = bananas + milk + icecream + eggs;
         System.out.println(" общий вес коктейля " + generalWheighCoctail +"грамм");

         double generalWheightCoctailKg = 695;
         double kg = 1000;
         double change = generalWheightCoctailKg / kg;
         System.out.println("Вес коктейля в киллограмах" + generalWheightCoctailKg);

         System.out.println("Вес коктейля в киллограмах" + generalWheightCoctailKg);
        // задача 4
        double loseWheith = 7 * 1000;
        System.out.println(loseWheith);
        double firsProgramm = 250;
        double secondProgramm = 500;
        double result = loseWheith / firsProgramm;
        System.out.println("Время для похудения по первой программе" + result + "дней");
        double Result = loseWheith / secondProgramm;
        System.out.println("Время похудения по второй программе" + Result + "дней");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int  MashaPlus = 67760 / 100 * 10;
        System.out.println("зарплата Маши увеличится на "+ MashaPlus +"рублей");
        int MashaNextyear = Masha + MashaPlus;
        System.out.println("Маша будет получать в следущем году" + MashaNextyear + "рублей");
        int DenisPlus = 83690 / 100 * 10;
        System.out.println("Зарплата Дениса увеличится на" + DenisPlus + "Рублей");
        int DenisNextYear = Denis + DenisPlus;
        System.out.println("Денис будет получать в следующем году" + DenisNextYear + "Рублей");
        int KristinaPlus = 76230 / 100 * 10;
        System.out.println("Кристина будет получать больше на "+ KristinaPlus + "Рублей");
        int KristinaNextYeat = Kristina + KristinaPlus;
        System.out.println("Кристина будет получать в следующем году" + KristinaNextYeat + "Рублей");









    }
}