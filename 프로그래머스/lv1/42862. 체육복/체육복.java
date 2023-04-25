
import java.util.*;
import java.util.stream.Collectors;

public class Main {
}

class Solution {
    private int borrowCount;
    private final Set<Integer> borrowClothes = new HashSet<>();
    private final Set<Integer> extraClothes = new HashSet<>();

    private final List<Integer> borrowMe = new ArrayList<>();

    public int solution(int n, int[] lostArr, int[] reserveArr) {
        // 가변 리스트로 변환 (개발의 편의성)
        List<Integer> lost = Arrays.stream(lostArr).boxed().sorted().collect(Collectors.toCollection(ArrayList::new));
        List<Integer> reserve = Arrays.stream(reserveArr).boxed().sorted().collect(Collectors.toCollection(ArrayList::new));

        borrowSuccess(lost, reserve);
        return (n - lost.size()) + borrowCount;
    }

    public int borrowSuccess(List<Integer> lost, List<Integer> reserve) {
        borrowSelf(lost, reserve);
        useMine(lost, reserve);

        for (int i = 0; i < lost.size(); i++) {
            for (int j = 0; j < reserve.size(); j++) {
                if (canIReserve(lost.get(i), reserve.get(j))) {
                    duplication(lost.get(i), reserve.get(j));
                }
            }
        }
        return borrowCount;
    }

    private void useMine(List<Integer> lost, List<Integer> reserve) {
        List<Integer> self = lost
                .stream()
                .filter(n -> reserve.contains(n))
                .collect(Collectors.toList());

        self.forEach(n -> {
            lost.remove(Integer.valueOf(n));
            reserve.remove(Integer.valueOf(n));
        });
    }

    public boolean canIReserve(int lost, int reserve) {
        if (lost > reserve-2 && lost < reserve+2) {
            return true;
        }
        return false;
    }

    public int duplication(int lost, int reserve) {
        borrowClothes.add(lost);
        extraClothes.add(reserve);

        if (borrowClothes.size() == extraClothes.size()) {
            borrowCount = extraClothes.size();
        } else if (borrowClothes.size() < extraClothes.size()) {
            borrowCount = borrowClothes.size();
        } else if (borrowClothes.size() > extraClothes.size()) {
            borrowCount = extraClothes.size();
        }

        for (int i = 0; i < borrowMe.size(); i++) {
            if (borrowMe.get(i) == lost && borrowMe.get(i) ==reserve) {

            }
        }

        return borrowCount;
    }

    public List<Integer> borrowSelf(List<Integer> lost, List<Integer> reserve) {

        for (int i = 0; i < reserve.size(); i++) {
            for (int j = 0; j < lost.size(); j++) {
                if (reserve.get(i) == lost.get(j)) {
                    borrowMe.add(reserve.get(i));
                }
            }
        }
        return borrowMe;
    }

}

