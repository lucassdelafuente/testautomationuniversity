package chapter12;

/*
 * For your optional exercise for this chapter, the students were given a pop quiz and collectively they didn't do so great.
 * As a result, the instructor decided to give them a makeup exam to allow them to improve their scores.
 * Given two Maps of test scores, which I'm going to give to you, I would like you to update the student's grades only if they did better on the makeup exam. Then print the final grades.
 * Let me show you the two maps that I'm providing to you.
 *  for Lizzy she got an 80 on the 1st test, but a 76 on the 2nd one. So, she should keep her 80 score.
 */

import java.util.*;

public class FinalExercise {

    public static void main(String[] args) {

        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrades();

        Set<Map.Entry<String, Integer>> set = test2.entrySet();

        for (Map.Entry<String, Integer> student : set) {
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey());

            if (secondGrade > firstGrade) {
                gradeBook.put((String) student.getKey(), secondGrade);
            }
        }

        /*
            The forEach is used here to demonstrate another approach to looping.
            However, in reality, I would have added a print statement inside of
            the loop above so that the program does not have to loop over this map
            for a second time. This would be a more efficient approach:
            System.out.println("Student: " + student.getKey() + ", Grade:" + gradeBook.get(student.getKey()));
        */
        System.out.println("Final Grades:");
        gradeBook.forEach(
                (k, v) -> System.out.println("Student: " + k + ", Grade: " + v));
    }
}

