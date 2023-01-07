package com.test.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.test.pages.TodoAppPage;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        TodoAppPage todoAppPage = new TodoAppPage();
        todoAppPage.open();
        assertTrue(true);
    }
}
