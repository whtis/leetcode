package easy.Array;

import java.util.*;

/**
 * Created by wht on 2017/3/11.
 */
public class E119 {
    public List<Integer> getRow(int rowIndex) {


        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }

        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
        }
        return row;
    }
}
