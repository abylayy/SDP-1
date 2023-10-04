public class FootballCoach implements IJob {
    private static FootballCoach instance;

    public static FootballCoach getInstance() {
        if(instance==null) {
            instance = new FootballCoach();
        }
        return instance;
    }

    @Override
    public void performJob() {
        System.out.println("Coach is training!");
    }
}
