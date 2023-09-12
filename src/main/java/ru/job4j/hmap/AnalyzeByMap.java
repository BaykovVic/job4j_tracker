package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int subjectsAmmount = 0;
        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.subjects()) {
                sum += subj.score();
                subjectsAmmount++;
            }
        }
        return sum / subjectsAmmount;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subj : pupil.subjects()) {
                sum += subj.score();
            }
            labels.add(new Label(pupil.name(), sum / pupil.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.subjects()) {
                map.merge(subj.name(), subj.score(), (oldVal, newVal) -> oldVal + subj.score());
            }
        }
        for (String name : map.keySet()) {
            labels.add(new Label(name, (double) map.get(name) / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double pupilScore = 0;
            for (Subject subj : pupil.subjects()) {
                pupilScore += subj.score();
            }
            labels.add(new Label(pupil.name(), pupilScore));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subj : pupil.subjects()) {
                map.merge(subj.name(), subj.score(), (oldVal, newVal) -> oldVal + subj.score());
            }
        }
        for (String name : map.keySet()) {
            labels.add(new Label(name, map.get(name)));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}