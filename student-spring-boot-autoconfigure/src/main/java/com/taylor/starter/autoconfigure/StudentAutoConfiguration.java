/*
 * File: src\main\java\com\taylor\starter\autoconfigure\StudentAutoConfiguration.javaa
 * Project: student-spring-boot-autoconfigure
 * Created Date: Friday, March 8th 2024, 4:08:56 pm
 * Author: Rui Yu
 * -----
 * Last Modified: Friday, 8th March 2024 6:37:14 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2024 Rui Yu
 * 
 * All shall be well and all shall be well and all manner of things shall be well.
 * Nope...we're doomed!
 * -----
 * HISTORY:
 * Date      	By	Comments
 * ----------	---	----------------------------------------------------------
 */
package com.taylor.starter.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taylor.starter.models.Student;
import com.taylor.starter.models.StudentConfig;

import static com.taylor.starter.models.StudentConfigParams.*;

@Configuration
@ConditionalOnClass(Student.class)
@EnableConfigurationProperties(StudentProperties.class)
public class StudentAutoConfiguration {

    @Autowired
    private StudentProperties studentProperties;

    @Bean
    @ConditionalOnMissingBean
    public StudentConfig studentConfig() {
        String studentName = studentProperties.getName() == null ? "Taylor Yu"
                : studentProperties.getName();

        String studentSex = studentProperties.getSex() == null ? "true"
                : studentProperties.getSex();

        String studentAge = studentProperties.getAge() == null ? "18"
                : studentProperties.getAge();

        String studentScore = studentProperties.getScore() == null ? "100"
                : studentProperties.getScore();

        StudentConfig studentConfig = new StudentConfig();
        studentConfig.put(STUDENT_NAME, studentName);
        studentConfig.put(STUDENT_SEX, studentSex);
        studentConfig.put(STUDENT_AGE, studentAge);
        studentConfig.put(STUDENT_SCORE, studentScore);

        return studentConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public Student student(StudentConfig studentConfig) {
        return new Student(studentConfig);
    }
}