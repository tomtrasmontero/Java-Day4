package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ProblemSet {

}

/*
Problem #P09
* <b>(**) Pack consecutive duplicates of list elements into sublists</b>
* <p>If a list contains repeated elements they should be placed in separate sublists.</p>
*
* <pre>
*     pack(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
*     [["a","a","a","a"],["b"],["c","c"],["a","a"],["d"],["e","e","e","e"]]
* </pre>
*/
class P09 {
    public static List<List<String>> pack(List<String> list) {
        List<List<String>> packedList = new ArrayList<>();
        List<String> listGroup = new ArrayList<String>();
        String currentElement = list.get(0);
        for (String value : list ){
            if(currentElement == value){
                listGroup.add(value);
                currentElement = value;
            } else {
                packedList.add(listGroup);
                listGroup = new ArrayList<String>();
                listGroup.add(value);
                currentElement = value;
            }

        }
//        add last set
        packedList.add(listGroup);
        return packedList;
    }
}

/*
 * <b>(**) Flatten a nested list structure</b>
 * <p>
 * Transform a list, possibly holding lists as elements into a 'flat' list by replacing each list with its elements (recursively).
 * </p>
 */
class P07 {
    public static List<?> flatten(List<?> list) {
        List<String> flattenedList = new ArrayList<>();
        for(Object value: list) {
            if(value instanceof String) {
                flattenedList.add((String) value);
            } else {
                List<?> data = flatten((List<?>) value);
                flattenedList.addAll((Collection<? extends String>) data);
                System.out.println(data);
            }
        }

        System.out.println(flattenedList.toString());
        return flattenedList;
    }
}

/*
 * (**) Duplicate the elements of a list a given number of times.
 * <pre>
 *          duplicate(Arrays.asList("a", "b", "c", "d"))
 * </pre>
 */

class P15 {
    public static List duplicate(List<String> list, int times) {
        List<String> resultCollection = new ArrayList<>();

        for (String value : list) {
            for (int i = 0; i < times ; i++) {
                resultCollection.add(value);
            }
        }

        return resultCollection;
    }
}