package com.example.main;

import com.example.dependency.MyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private MyBean myBean;

    public void testBean() {
        if (myBean == null) {
            logger.error("MyBean is null!");
        } else {
            System.out.println(myBean.sayHello());
        }
    }
}
