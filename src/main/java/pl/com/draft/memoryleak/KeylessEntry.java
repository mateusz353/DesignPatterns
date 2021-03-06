package pl.com.draft.memoryleak;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mateusz Nowakowski.
 */
class KeylessEntry {

    static class Key {
        Integer id;

        Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        /* Without equals is memory leak

        @Override
        public boolean equals(Object o) {
            boolean response = false;
            if (o instanceof Key) {
                response = (((Key)o).id).equals(this.id);
            }
            return response;
        }

        */
    }

    public static void main(String[] args) {
        Map m = new HashMap();
        while (true)
            for (int i = 0; i < 10000; i++)
                if (!m.containsKey(new Key(i)))
                    m.put(new Key(i), "Number:" + i);
    }
}