public class Main {
    public static void main(String[] args) {

        Worker programmer = new Worker(new Programmer());
        Worker teacher = new Worker(new Teacher());
        Worker footballer = new Worker(new Footballer());
        Worker footballCoach = new Worker(FootballCoach.getInstance());

        programmer.performJob();
        teacher.performJob();
        footballer.performJob();
        footballCoach.performJob();

    }
}