public class App {
    public static void main(String[] args) throws Exception {
        Museo m = new Museo();
        Turista t1 = new Turista(m, "alfredo");
        Turista t2 = new Turista(m, "minni");
        Turista t3 = new Turista(m, "alf");
        Turista t4 = new Turista(m, "coco");
        Turista t5 = new Turista(m, "Meratti");
        Turista t6 = new Turista(m, "ndoja<3");
        Turista t7 = new Turista(m, "ricci");
        Turista t8 = new Turista(m, "giu-senatore");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        System.out.println("FINITO");
    }
}
