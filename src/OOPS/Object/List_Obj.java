package OOPS.Object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_Obj {
    static void main() {
        List<List<Integer>> grid = new ArrayList<>();

        // 1. Add inner lists (rows)
//        grid.add(new ArrayList<>(List.of(5)));
        grid.add(new ArrayList<>(Arrays.asList(5,10)));
        grid.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        grid.add(new ArrayList<>(Arrays.asList(30, 40, 50)));

        // 2. Add an element to the first row
        grid.get(0).add(25);

        // 3. Access an element (Row 1, Column 2)
        int value = grid.get(1).get(2); // Returns 50

        // 4. Update an element (Row 0, Column 1 -> 99)
        grid.get(0).set(1, 99);
        System.out.println(grid);

        // 5. Check dimensions
        int totalRows = grid.size();// Returns 3
        int row1Length = grid.get(1).size(); // Returns 3

        System.out.println(grid.get(0).get(grid.get(0).size()-1));
        System.out.println(grid.get(grid.size()-1));
        System.out.println(grid.get(0).getFirst());
        System.out.println(grid.size());
        System.out.println(grid.get(grid.size()-1));

        grid.get(0).set(1,15);
        System.out.println(grid);


        List<Integer> c=new ArrayList<>();
        for(int i=0;i<grid.get(2).size();i++) {
            c.add(grid.get(2).get(i));
        }
        System.out.println(c);

    }
}
