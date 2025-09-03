package ch04.sec02;

import java.util.*;

public class LottoExample {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<>();

        // 1~45 사이의 중복 없는 번호 6개 생성
        while (lotto.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            lotto.add(num);
        }

        // 보너스 번호 생성 (기존 번호 제외)
        int bonus;
        do {
            bonus = (int)(Math.random() * 45) + 1;
        } while (lotto.contains(bonus));

        // 오름차순 정렬
        List<Integer> sortedLotto = new ArrayList<>(lotto);
        Collections.sort(sortedLotto);

        // 출력
        System.out.print("로또 번호: ");
        for (int n : sortedLotto) {
            System.out.print(n + " ");
        }
        System.out.println("+ " + bonus);
    }
}