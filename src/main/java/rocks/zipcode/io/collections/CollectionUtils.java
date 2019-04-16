package rocks.zipcode.io.collections;

import rocks.zipcode.io.generics.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {

    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {
        return new ArrayList<>(collection);
    }

    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        return flatten(nestedCollection).contains(collection);
    }

    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {
        List temp = new ArrayList<>();
        for (Collection current:collections) {
            temp.add(current);
        }
    return temp;
    }

    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {
        return Arrays.stream(collections).flatMap(Collection::stream).collect(Collectors.toList());
    }
}
