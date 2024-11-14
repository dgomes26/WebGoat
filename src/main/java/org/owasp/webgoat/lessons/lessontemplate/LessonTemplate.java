package org.owasp.webgoat.lessons.lessontemplate;

import org.owasp.webgoat.lessons.Lesson;
import org.springframework.stereotype.Component;
import org.owasp.webgoat.assignments.Category;

@Component
public class LessonTemplate extends Lesson {
    
    @Override
    public Category getDefaultCategory() {
        return Category.GENERAL;
    }

    @Override
    public String getTitle() {
        return "lesson-template.title";
    }
}

