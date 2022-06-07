package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {
                            //1
    @Test
    public void updateStudentWithPut() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Jira");
        courseList.add("Java");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Prime");
        studentPojo.setLastName("testing");
        studentPojo.setEmail("rogerfed@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                                  //2
    @Test
    public void updateStudentWithPutSecond() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Python");
        courseList.add("c++");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Roger");
        studentPojo.setLastName("Federer");
        studentPojo.setEmail("rogerfed1@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                                     //3
    @Test
    public void updateStudentWithPutThird() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Data Science");
        courseList.add("Hacker");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("rafel");
        studentPojo.setLastName("nadal");
        studentPojo.setEmail("rogerfed1@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                           //4
    @Test
    public void updateStudentWithPutFourth() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Cricket");
        courseList.add("Tennis");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("novak");
        studentPojo.setLastName("djokovic");
        studentPojo.setEmail("novak@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                         //5
    @Test
    public void updateStudentWithPutFive() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Html");
        courseList.add("css");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("prime");
        studentPojo.setLastName("testing");
        studentPojo.setEmail("prime@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
