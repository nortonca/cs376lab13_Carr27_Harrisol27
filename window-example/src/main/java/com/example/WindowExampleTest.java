package com.example;

import org.junit.jupiter.api.Test;

import javax.swing.ImageIcon;

import static org.junit.jupiter.api.Assertions.*;

class WindowExampleTest {

    @Test
    void testAddTime() {
        String time = WindowExample.Utils.addTime();
        assertNotNull(time, "addTime should return a non-null value.");
        assertTrue(time.matches("\\d{4}-\\d{2}-\\d{2}:\\d{2}:\\d{2}:\\d{2} [A-Z]{3} \\d{4}"),
                "addTime should return a string matching the format 'yyyy-MM-dd:hh:mm:ss zzz yyyy'.");
    }

    @Test
    void testImgSignature() {
        ImageIcon imgIcon = new ImageIcon();
        String signature = WindowExample.Utils.imgSignature(imgIcon);
        assertNotNull(signature, "imgSignature should return a non-null value.");
        assertTrue(signature.matches("\\d+"), "imgSignature should return a numeric string.");
    }
}
