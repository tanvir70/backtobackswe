package swe.StackQueue;

import java.util.*;

public class SunsetView {
    public List<Integer> getBuildingsWithAView(int[] buildings) {

        Stack<Integer> buildingWithView = new Stack<>();
        for (int i = buildings.length - 1; i >= 0; i--) {
            int buildingHeight = buildings[i];
            while (!buildingWithView.isEmpty() && buildingHeight >= buildings[buildingWithView.peek()]) {
                buildingWithView.pop();
            }
            buildingWithView.push(i);
        }
        Collections.reverse(buildingWithView);
        return new ArrayList<>(buildingWithView);
    }
}
