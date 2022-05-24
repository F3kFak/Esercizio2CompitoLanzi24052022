public class Turista extends Thread{
    private String name;
    private Museo museo;

    public Turista(Museo museo, String name)
    {
        this.museo = museo;
        this.name = name;
    }

    @Override
    public void run() {
        museo.entrata(name);
        try {
            sleep(((int)((Math.random()*10))+1)*1000);
        } catch (Exception e) {
           
        }
        museo.uscita(name);
    }
}
