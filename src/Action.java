public class Action {
    public static void main(String[] args) {
        Person sniff = new Person("Снифф");
        GemStone king = new GemStone("Король рубинов", Planet.MARS, 200, Gem.RUBY);
        Person wizard = new Person("Волшебник", Planet.MOON, "перчатки", "плащ", "шарф", "тёмные очки");
        Animal pant = new Animal("Пантера", Planet.MOON, Color.PINK);
        Time_of_day.NIGHT.describe("Крайне тёмная земная");
        System.out.println();
        System.out.println("Описание объектов, учавствующих в действии:");
        System.out.println(sniff);
        System.out.println(king);
        System.out.println(wizard);
        System.out.println(pant);
        System.out.println();
        sniff.sigh();
        sniff.tell("Ну и счастливцы же эти Тофсла и Вифсла!");
        wizard.rest();
        pant.sleep();
        wizard.think(king);
        wizard.notice(king.sparkle());
        System.out.println(king);
        wizard.tell("Король рубинов! Я искал его не одну сотню лет!");
        wizard.stand();
        wizard.get_dressed();
        wizard.goTo(Planet.EARTH);
    }
}