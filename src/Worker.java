public class Worker {
    private IJob job;

    public Worker(IJob job) {
        this.job = job;
    }

    public void performJob() {
        job.performJob();
    }
}
