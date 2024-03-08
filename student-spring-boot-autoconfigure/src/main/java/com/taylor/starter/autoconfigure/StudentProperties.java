/*
 * File: c:\Work\Docs\spring-boot-custom-starter\spring-boot-custom-starter\student-spring-boot-autoconfigure\src\main\java\com\taylor\starter\autoconfigure\Student
 * Project: c:\Work\Docs\spring-boot-custom-starter\spring-boot-custom-starter\student-spring-boot-autoconfigure\src\main\java\com\taylor\starter\autoconfigure
 * Created Date: Friday, March 8th 2024, 4:17:20 pm
 * Author: Rui Yu
 * -----
 * Last Modified: Friday, 8th March 2024 4:40:22 pm
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

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "taylor.student")
@Setter
@Getter
public class StudentProperties {

    private String name;
    private String sex;
    private String age;
    private String score;
}