package org.example.string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilTest {

    // 기능 1: 빈 문자열 체크

    @Test
    void null을_입력한다(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    void 빈문자열을_입력한다(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    void 문자열을_입력한다(){
        assertFalse(StringUtil.isEmpty("TEST"));
    }

    @Test
    void whitespace만_있는_문자열을_입력한다(){
        assertTrue(StringUtil.isEmpty(" "));
        assertTrue(StringUtil.isEmpty("              "));
    }

}
