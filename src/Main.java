public class Main {
    public static void main(String[] args) {

        Worker programmer = new Worker(new Programmer());
        Worker teacher = new Worker(new Teacher());
        Worker footballer = new Worker(new Footballer());

        programmer.performJob();
        teacher.performJob();
        footballer.performJob();

    }
}