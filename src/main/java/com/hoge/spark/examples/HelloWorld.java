package com.hoge.spark.examples;

import java.util.Arrays;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class HelloWorld {

	public static void main(String[] args) {
		try (JavaSparkContext sc = new JavaSparkContext("local", "Hello World")) {
            JavaRDD<String> rdd = sc.parallelize(Arrays.asList("Hello", "World", "!"));
            rdd.foreach(val -> System.out.print(val + " "));
        }
	}

}
