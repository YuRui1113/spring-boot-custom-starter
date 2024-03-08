/*
 * File: src\main\java\com\taylor\starter\models\Student.java
 * Project: student-library
 * Created Date: Friday, March 8th 2024, 2:52:17 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Friday, 8th March 2024 4:22:56 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2024 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Friday, March 8th 2024	Rui Yu		Initial version
 */

package com.taylor.starter.models;

import lombok.Getter;
import lombok.Setter;

import static com.taylor.starter.models.StudentConfigParams.*;;

@Setter
@Getter
public class Student {

    private String name;
    private Boolean sex;
    private Integer age;
    private Integer score;

    private final StudentConfig studentConfig;

    public Student(StudentConfig studentConfig) {
        this.studentConfig = studentConfig;

        this.setName(this.studentConfig.get(STUDENT_NAME).toString());
        this.setSex(Boolean.valueOf(this.studentConfig.get(STUDENT_SEX).toString()));
        this.setAge(Integer.valueOf(this.studentConfig.get(STUDENT_AGE).toString()));
        this.setScore(Integer.valueOf(this.studentConfig.get(STUDENT_SCORE).toString()));
    }

    @Override
    public String toString() {
        return String.format("The student name is %s, sex is %s, age is %s, score is %s",
                this.getName(),
                this.getSex() ? "Man" : "Woman",
                this.getAge().toString(),
                this.getScore().toString());
    }
}