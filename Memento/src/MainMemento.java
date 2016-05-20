public class MainMemento {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL_1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL_2", 50000);
        System.out.println(game);

        System.out.println("Загрузка");
        game.load(file.getSave());
        System.out.println(game);

    }
}
