package com.ohashi.test.sort;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by ohashi on 2017/03/02.
 */
public class SelectTest {
    @Test
    public void select() throws Exception {
        int[] data = RamdomNumberArray.setRamdomArray(8);

        int[] sortData = Select.select(data);

        boolean result = true;

        for (int i = 0; i < sortData.length-1; i++) {
            if (data[i] > data[i + 1]) {
                result = false;
                break;
            }
        }
        assertEquals(true, result);
    }

}