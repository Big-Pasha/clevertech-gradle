package org.clevertech.gradle.pz.utils;

import org.clevertech.gradle.pz.utils.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringUtilTest {

    @Test
    void testIsPositiveNumberWithPositiveNumber() {
        boolean isPositiveNumber = StringUtils.isPositiveNumber("25");

        Assertions.assertTrue(isPositiveNumber);
    }
}
