package edu.escuelaing.arem;

import static spark.Spark.*;

public class SparkWebApp {

 public static void main(String[] args) {
    get("/hello", (req, res) -> "Hello Heroku");
 }
}