package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {

    //Homework
                     //1
    @Test
    public void deleteStudentById(){

        Response response = given()
                .pathParam("id", 1)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
                        //2
    @Test
    public void deleteStudentByIdSecond(){

        Response response = given()
                .pathParam("id", 2)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
                       //3
    @Test
    public void deleteStudentByIdThird(){

        Response response = given()
                .pathParam("id", 3)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
                         //4
    @Test
    public void deleteStudentByIdFour(){

        Response response = given()
                .pathParam("id", 4)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
                          //5
    @Test
    public void deleteStudentByIdFifth(){

        Response response = given()
                .pathParam("id", 5)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }


}
