package com.fruit.crawler;

import com.fruit.crawler.task.SimpleTask;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello World!");
        SimpleTask task = new SimpleTask();
        task.doTask("http://www.baidu.com");
    }
}
