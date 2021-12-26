package prob1;

import java.util.Arrays;
import java.util.List;

public class GroupUtil {

    public static Group<?> copy(Group<?> group) {
        return helper(group);
    }

    private static <T> Group<T> helper(Group<T> group) {
        return new Group<>(group.getSpecialElements(), group.getElements());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Group<Integer> group = new Group<>(1, list);
        System.out.println(group);
        System.out.println(GroupUtil.copy(group));
    }
}
