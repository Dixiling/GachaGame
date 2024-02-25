public class Main {
    public static void main(String[] args) {
        String[] ids = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] names = {"Упаковка пластелина", "2hu Фумофу", "Модель - Имперского звездного разрушителя", "Модель танка Е-100 'масштаб 1/72'",
                     "Пазл","Шахматы", "Плющевая котейка", "Набор минек от GW для FB"};
        int[] frequencies = {2, 5, 3, 4, 8, 6, 1, 7};
        Toy[] toys = new Toy[ids.length];

        for (int i = 0; i < ids.length; i++) {
            toys[i] = new Toy(ids[i], names[i], frequencies[i]);
        }

        ToyQueue toyQueue = new ToyQueue(toys);
        System.out.println("Игрушки в порядке убывания частоты:");
        while (!toyQueue.isEmpty()) {
            Toy toy = toyQueue.poll();
            System.out.println("ID: " + toy.id + ", Название: " + toy.name + ", Частота: " + toy.frequency);
        }

        Lottery lottery = new Lottery(frequencies);
        String winnerId = lottery.getWinnerId();
        Toy winnerToy = toys[Integer.parseInt(winnerId) - 1];
        System.out.println("Победитель лотереи: ID: " + winnerId + ", Название: " + winnerToy.name + ", Частота: " + winnerToy.frequency);

        FileWriterUtility.writeToFile(toys, "Gacharesult.txt");
    }
}