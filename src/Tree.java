public class Tree {
    public Nut[] arrayOfNuts(int count)
        {
        Nut[] nuts = new Nut[count];
        for (int i = 0; i < count; i++)
        {
            nuts[i] = new Nut(); // создаем новый орешек
        }
        return nuts;
        }
}


