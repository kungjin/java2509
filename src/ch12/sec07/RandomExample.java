package ch12.sec07;

import java.util.*;

public class RandomExample {
    public static void main(String[] args) {
        // 선택번호(중복 없이)
        int[] selectNumber = pick6NoDup(new Random());   // 시드 없음 → 매번 다름
        System.out.print("선택번호: ");
        for (int n : selectNumber) System.out.print(n + " ");
        System.out.println();

        // 당첨번호(중복 없이)
        int[] winningNumber = pick6NoDup(new Random());  // 시드 없음 → 매번 다름
        System.out.print("당첨번호: ");
        for (int n : winningNumber) System.out.print(n + " ");
        System.out.println();

        // 맞힌 개수 세기
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        int matchCount = 0;
        for (int s : selectNumber) {
            for (int w : winningNumber) {
                if (s == w) matchCount++;
            }
        }
        System.out.println("맞힌 갯수: " + matchCount);

        switch (matchCount) {
            case 6 -> System.out.println("🎉 1등: 6개 모두 맞음!");
            case 5 -> System.out.println("🥈 2등: 5개 맞음");
            case 4 -> System.out.println("🥉 3등: 4개 맞음");
            case 3 -> System.out.println("4등: 3개 맞음");
            case 2 -> System.out.println("5등: 2개 맞음");
            default -> System.out.println("꽝! 당첨되지 않았습니다.");
        }
    }

    // 중복 없이 6개 뽑기 (1~45)
    private static int[] pick6NoDup(Random rnd) {
        List<Integer> pool = new ArrayList<>();
        for (int i = 1; i <= 45; i++) pool.add(i);
        Collections.shuffle(pool, rnd);       // 랜덤 섞기
        int[] res = new int[6];
        for (int i = 0; i < 6; i++) res[i] = pool.get(i);
        return res;
    }
}

