package sorting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomsTest {

    @Test
    void can_attend_all_meetings_Test() {
        ArrayList<ArrayList<Integer>> case_1 = new ArrayList<>();
        case_1.add(new ArrayList<>(List.of(1,5)));
        case_1.add(new ArrayList<>(List.of(5,8)));
        case_1.add(new ArrayList<>(List.of(10,15)));

        Assertions.assertEquals(1,MeetingRooms.can_attend_all_meetings(case_1));
    }

    @Test
    void can_attend_all_meetings_Negative_Test() {
        ArrayList<ArrayList<Integer>> case_2 = new ArrayList<>();
        case_2.add(new ArrayList<>(List.of(1,5)));
        case_2.add(new ArrayList<>(List.of(4,8)));

        Assertions.assertEquals(0,MeetingRooms.can_attend_all_meetings(case_2));

    }

    @Test
    void can_attend_all_meetings_Test_case3() {
        ArrayList<ArrayList<Integer>> case_3 = new ArrayList<>();
        case_3.add(new ArrayList<>(List.of(13,56)));
        case_3.add(new ArrayList<>(List.of(1,3)));
        case_3.add(new ArrayList<>(List.of(4,5)));
        case_3.add(new ArrayList<>(List.of(9990,10341)));
        case_3.add(new ArrayList<>(List.of(8,10)));
        case_3.add(new ArrayList<>(List.of(67,9990)));

        Assertions.assertEquals(1,MeetingRooms.can_attend_all_meetings(case_3));

    }
}
