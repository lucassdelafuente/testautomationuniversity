package chapter12;

/*
 * You have two methods here. You have one to get the original grades and this returns a Map.
 * And these are the students, and these are their grades. Notice they didn't do so great. I got a really low score.
 * Then there's another method, getMakeupGgrades() that also returns a Map. And some folks did better in this one, some folks didn't.
 * What I would like you to do is make another class, and then you're going to make a call to these methods to get these Maps.
 * Then I want you to go through these Maps in your code and determine the final grade based on which one of these are higher.
 */

import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }
}
