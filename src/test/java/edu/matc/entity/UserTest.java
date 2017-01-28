package edu.matc.entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

/**
 * Created by student on 1/24/17.
 */
public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new User("Abe","Abbot","5",Date.valueOf("2000-01-26"));
    }

     @Test
    public void getAge() throws Exception {
        assertEquals(17, user.getAge());
    }

}