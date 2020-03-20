package org.example.lesson08;

public class BusTrip {
    public static String checkCrashOnBridge(String centBusHeight, String bridgeNum, String heightBridge) {

        String[] bridges = heightBridge.split(" ");

        String res = null;

        for (int i = 0; i < Integer.parseInt(bridgeNum); ++i) {
            if (Integer.parseInt(centBusHeight) < Integer.parseInt(bridges[i])) {
                res = "Will not crash";
            } else {
                int bridgeCrash = i + 1;
                res = "Will crash on bridge " + bridgeCrash;
                break;
            }
        }
        return res;
    }
}
