package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug1", 1),
                new Job("Fix bug2", 4),
                new Job("Fix bug3", 2),
                new Job("X task", 0)
        );
        Comparator<Job> cmpNamePriority = new JobAscByName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("Asc name: " + rsl);

        cmpNamePriority = new JobDescByName();
        rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("Desc name: " + rsl);

        cmpNamePriority = new JobAscByPriority();
        rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("Asc priority: " + rsl);

        cmpNamePriority = new JobDescByPriority();
        rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        System.out.println("Desc priority: " + rsl);
    }
}