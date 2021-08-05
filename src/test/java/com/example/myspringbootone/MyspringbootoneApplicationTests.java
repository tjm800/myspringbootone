package com.example.myspringbootone;

import com.example.myspringbootone.controller.BootOneController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MyspringbootoneApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testSayHello(){
        assertEquals("Hello World",new BootOneController().helloWorld());
    }

}
