public class Museo {
    private String nome = "UFFIZI";
    private int d = 0;
    private final int maxpersone = 3;
    public synchronized void entrata( String n)
    {
        while (d >= maxpersone) {
            try {
                System.out.println("sta aspettando = " + n);
                wait();
            } catch (Exception e) {}
        }
        d++;
        System.out.println("entra in " + nome + " " + n);
    }

    public synchronized void uscita(String n)
    {
        d--;
        System.out.println("esce dagli " + nome + " " + n);
        notifyAll();
    }
    

}
