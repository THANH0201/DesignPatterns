package main.java.bridgeDevicesRemotes;



public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new SmartTv());
    }
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with Smart remote.");
        SmartRemote remote = new SmartRemote(device);
        device.printStatus();
        remote.power();
        remote.mute();
        remote.voiceControl("browse internet");
        remote.voiceControl("open netflix");
    }
}
