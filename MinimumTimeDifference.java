package swe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumTimeDifference {
    int findMinDifference(List<String> timePoints) {
        boolean[] time_seen = new boolean[1440];

        for (String time : timePoints) {
            String[] time_split = time.split(":");
            int hour = Integer.parseInt(time_split[0]);
            int minute = Integer.parseInt(time_split[1]);
            if (time_seen[(hour * 60) + minute]) {
                return 0;
            }
            time_seen[(hour * 60) + minute] = true;
        }

        Integer first_time_seen = null;
        Integer prev_time_seen = null;
        int minimum_difference = Integer.MAX_VALUE;

        for (int i = 0; i < 1440; i++) {
            if (time_seen[i]){
                if (first_time_seen == null){
                    first_time_seen = i;
                    prev_time_seen = i;
                }else{
                    minimum_difference = Math.min(minimum_difference, Math.min( (i - prev_time_seen), (1440 - (i + prev_time_seen))));
                    prev_time_seen = i;
                }
            }
        }
        minimum_difference = Math.min(minimum_difference, Math.min((prev_time_seen - first_time_seen), 1440  - prev_time_seen + first_time_seen));

        return minimum_difference;
    }

    public static void main(String[] args) {
        var timePoint = new ArrayList<String>();
        timePoint.add("00:03");
        timePoint.add("23:59");
        timePoint.add("12:03");
        
        MinimumTimeDifference ob = new MinimumTimeDifference();
        System.out.print("Minimum difference is  : " + ob.findMinDifference(timePoint));


    }

}
