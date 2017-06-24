package com.ds;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Boris on 20.6.17.
 */
public class Max {
    public int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int y = i; y < nums.length; y++) {
                if (nums[i] == nums[y]) {
                    int sp = y - i + 1;
                    if (m.get(nums[i]) == null || m.get(nums[i]) < sp) {
                        m.put(nums[i], sp);
                    }
                }
            }
        }

        Collection<Integer> values = m.values();
        return Collections.max(values);

    }
}
