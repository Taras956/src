package ua.lviv.iot.algo.part1.book.models;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShuttleMission {
    public static final Pattern PATTERN = Pattern.compile ("/shuttle/missions/([a-zA-Z0-9]+)_[0-9]+");
    public static HashSet<String> getMissionNamesFromFile(File file) {
        String text = "shuttle-STS-67/Earth_Observations/missions_endeavour\n" +
                "shuttle-STS-113/International_Space_Station_Assembly/missions_endeavour\n" +
                "shuttle-STS-60/Space-lab/missions_discovery";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.next() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HashSet<String> missionNames = new HashSet<>();
        Pattern pattern = Pattern.compile("/shuttle/missions/([a-zA-Z0-9]+)_[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            missionNames.add(matcher.group(1));
        }
        return missionNames;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Taras\\work\\shuttle.txt");
        String text = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.next() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HashSet<String> missionNames = new HashSet<>();
        Pattern pattern = Pattern.compile("/shuttle/missions/([a-zA-Z0-9]+)_[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            missionNames.add(matcher.group(1));
        }
        System.out.println(missionNames); // output: [STS-3, STS-2, STS-1, STS-4]
        System.out.println(text);
    }
}



