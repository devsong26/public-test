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

    // 기능 2. 유효한 텍스트인지 확인해보기 StringUtils.hasText

    @Test
    void 입력이_null이면_false를_반환한다(){
        assertFalse(StringUtil.hasText(null));
    }

    @Test
    void 빈_문자열이면_false를_반환(){
        assertFalse(StringUtil.hasText(" "));
    }

    @Test
    void 문자열에_유효한_문자가_하나라도_있으면_true(){
        assertTrue(StringUtil.hasText("8d"));
    }

}
