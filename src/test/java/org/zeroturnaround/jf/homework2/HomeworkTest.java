package org.zeroturnaround.jf.homework2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class HomeworkTest {

  @Test
  public void testREADMEmd() throws IOException {
    Map<String, Integer> expected = new LinkedHashMap<>();
    expected.put("the", 28);
    expected.put("of", 21);
    expected.put("lorem", 19);
    expected.put("ipsum", 19);
    expected.put("it", 11);

    Map<String, Long> actual = new Homework2().getWords("lorem-ipsum.txt");
    assertEquals(expected.toString(), actual.toString());
  }

}
