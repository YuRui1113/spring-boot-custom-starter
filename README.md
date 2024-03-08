# 自定义Spring Boot Starter
 
## 概述
这里使用Maven多模块项目来实现自定义starter，共有四个子模块：
- student-library：功能库模块
- student-spring-boot-autoconfigure：自动装配功能模块
- student-spring-boot-starter：自定义starter模块
- student-starter-test-sample：测试自定义starter模块

## 如何构建

- 准备

在当前机器上安装下列软件:
1. Java JDK 17
2. Apache Maven 4.0.0-alpha-8 or above it

- 构建
进入代码根pom.xml所在目录，运行以下命令来构建多模块应用: 
```
mvn clean package
```
它将在各个模块下得/target目录产生对应的jar文件。


## 如何运行测试模块

进入代码根pom.xml所在目录，运行如下命令来运行测试应用:
```
cd student-starter-test-sample\target
java -jar student-starter-test-sample-0.0.1-SNAPSHOT.jar
```
验证控制台打印信息有如下内容即表示测试成功：
The student name is Tommy Ma, sex is Man, age is 45, score is 88