package ch05.sec12;

import java.util.Calendar;

public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;  // enum 상수 다음에 세미콜론

    // 오늘 요일을 Week 값으로 반환
    public static Week today() {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:    return SUNDAY;
            case Calendar.MONDAY:    return MONDAY;
            case Calendar.TUESDAY:   return TUESDAY;
            case Calendar.WEDNESDAY: return WEDNESDAY;
            case Calendar.THURSDAY:  return THURSDAY;
            case Calendar.FRIDAY:    return FRIDAY;
            case Calendar.SATURDAY:  return SATURDAY;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
    }
    public static void main(String[] args) {
        System.out.println("오늘은: " + Week.today());
    }
}

