public class Squirrel {
    public void collectingNuts(Nut[] nuts)
        {
        double totalWeight = 0.0;
        System.out.println("У Белочки появился орех");
        for (Nut nut1 : nuts)
        {
            System.out.println("Ура, еще орех!");
            totalWeight += nut1.getWeight(); // суммируем вес орехов
        }
        System.out.println("Общий вес собранных орехов: " + totalWeight);
    }
}


