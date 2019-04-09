package by.itacademy.java.dserbunou.classroom.JDK8;

import java.util.Arrays;
import java.util.Collection;

public class Streams1 {

    private enum Status {
        OPEN, CLOSED
    };

    private final Status status;
    private final Integer points;

    public Streams1(Status status, Integer points) {
        this.status = status;
        this.points = points;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getPoints() {
        return points;
    }

    public static void main(String[] args) {
        final Collection<Streams1> tasks = Arrays.asList(new Streams1(Status.OPEN, 5), new Streams1(Status.OPEN, 13),
                new Streams1(Status.CLOSED, 8));

        final long totalPointsOfOpenTasks = tasks.stream().parallel().filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(Streams1::getPoints).sum();

        System.out.printf("Total points: %s", totalPointsOfOpenTasks);
    }

}
