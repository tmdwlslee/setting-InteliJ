package com.study.first.springboot.web;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JunitControllerTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClassCall(){
        System.out.println("afterClass");
    }

    @Before
    public void beforeCall(){
        System.out.println("Before");
    }

    @After
    public void afterCall(){
        System.out.println("After");
    }

    @Test
    public void 메서드1(){
        System.out.println("메서드1");
    }

    @Test
    public void 메서드2(){
        System.out.println("메서드2");
    }

    @Test
    public void 메서드3(){
        System.out.println("메서드3");
    }

}
