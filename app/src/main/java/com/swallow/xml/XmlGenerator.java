package com.swallow.xml;

import com.swallow.values.Values;

import java.io.IOException;

/**
 * @author Yann Chou
 * @mail zhouyanbin1029@gmail.com
 * @time 16/6/4.20:56
 */
public interface XmlGenerator {
    void generate(Values values) throws IOException;
}
