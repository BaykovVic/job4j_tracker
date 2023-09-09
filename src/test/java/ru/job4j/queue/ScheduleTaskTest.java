package ru.job4j.queue;

import org.junit.jupiter.api.Test;
import ru.job4j.queue.ScheduleTask;
import ru.job4j.queue.Task;
import ru.job4j.queue.TaskByPositionAsc;
import ru.job4j.queue.TaskByUrgencyDesc;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.queue.Position.*;

class ScheduleTaskTest {
    @Test
    void whenTwoDirectorTaskThenReadMethodTest() {
        Comparator<ru.job4j.queue.Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
        ScheduleTask scheduleTask = new ScheduleTask(comparator);
        scheduleTask.addTask(new ru.job4j.queue.Task(DEPARTMENT_HEAD, "description_1", 10));
        scheduleTask.addTask(new ru.job4j.queue.Task(DIRECTOR, "description_2", 4));
        scheduleTask.addTask(new ru.job4j.queue.Task(DIRECTOR, "description_3", 8));
        String expected = "description_3";
        String result = scheduleTask.readTask().description();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoDepartmentHeadTaskAndEqualUrgencyThenGetMethodTest() {
        Comparator<ru.job4j.queue.Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
        ScheduleTask scheduleTask = new ScheduleTask(comparator);
        scheduleTask.addTask(new ru.job4j.queue.Task(DEPARTMENT_HEAD, "description_1", 7));
        scheduleTask.addTask(new ru.job4j.queue.Task(MANAGER, "description_2", 10));
        scheduleTask.addTask(new Task(DEPARTMENT_HEAD, "description_3", 7));
        String expected = "description_1";
        String result = scheduleTask.getTask().description();
        assertThat(result).isEqualTo(expected);
        scheduleTask.getTask();
        expected = "description_2";
        result = scheduleTask.getTask().description();
        assertThat(result).isEqualTo(expected);
    }
}