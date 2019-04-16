package rocks.zipcode.io.collections;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {
    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        List og = new ArrayList(originalSet);
        Set<Set<TypeOfSet>> answer= new HashSet<>();
        int n = originalSet.size();
        for (int i = 0; i < (1<<n); i++) {
            HashSet temp = new HashSet();
            for (int j = 0; j < n; j++) {
                if((i & (1<<j)) > 0);

                temp.add(og.get(j));
            }
            answer.add(temp);
        }
        return answer;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
