package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPatchTest extends TestBase {

    //Homework

                      //1
    @Test
    public void updateStudentWithPatch() {

        List<String> courseList = new ArrayList<>();
        courseList.add("Python");
        courseList.add("c++");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Sachin");
        studentPojo.setLastName("Tendulkar");
        studentPojo.setEmail("sachin@gmail.com");
        studentPojo.setProgramme("cricket");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                           //2
    @Test
    public void updateStudentWithPatchSecond() {

        List<String> courseList = new ArrayList<>();
        courseList.add("Data");
        courseList.add("Science");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Sourav");
        studentPojo.setLastName("ganguly");
        studentPojo.setEmail("sachin@gmail.com");
        studentPojo.setProgramme("cricket");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                                  //3
    @Test
    public void updateStudentWithPatchThird() {

        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("C");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Sachin");
        studentPojo.setLastName("Tendulkar");
        studentPojo.setEmail("sachin@gmail.com");
        studentPojo.setProgramme("cricket");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                             //4
    @Test
    public void updateStudentWithPatchFourth() {

        List<String> courseList = new ArrayList<>();
        courseList.add("PHP");
        courseList.add(".net");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Sachin");
        studentPojo.setLastName("Tendulkar");
        studentPojo.setEmail("sachin@gmail.com");
        studentPojo.setProgramme("cricket");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
                               //5
    @Test
    public void updateStudentWithPatchFive() {

        List<String> courseList = new ArrayList<>();
        courseList.add("oracle");
        courseList.add("rdbms");
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Sachin");
        studentPojo.setLastName("Tendulkar");
        studentPojo.setEmail("sachin@gmail.com");
        studentPojo.setProgramme("cricket");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}

