package ua.lviv.iot.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.book.models.ShuttleMission;

import java.io.File;
import java.util.HashSet;

public class ShuttleMissionTest {
    @Test
    public void testShuttleMission() {
        File file = new File("shuttle.txt");
        HashSet<String> expectedMissionNames = new HashSet<>();
        expectedMissionNames.add("shuttle-STS-67/Earth_Observations/missions_endeavour");
        expectedMissionNames.add("shuttle-STS-113/International_Space_Station_Assembly/missions_endeavour\n");
        expectedMissionNames.add("shuttle-STS-60/Space-lab/missions_discovery");


        HashSet<String> missionNames = ShuttleMission.getMissionNamesFromFile(file);
        Assertions.assertEquals(expectedMissionNames, missionNames);
    }
}
