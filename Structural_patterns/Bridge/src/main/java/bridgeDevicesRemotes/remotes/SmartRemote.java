package bridgeDevicesRemotes.remotes;

import bridgeDevicesRemotes.devices.Device;
import bridgeDevicesRemotes.devices.SmartTv;

public class SmartRemote extends AdvancedRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice command received: " + command);

        if (device instanceof SmartTv smartTv) {
            if (command.equalsIgnoreCase("browse internet")) {
                smartTv.browseInternet();
            } else {
                System.out.println("Unknown voice command for SmartTV.");
            }
        } else {
            System.out.println("Voice control is only supported for SmartTV.");
        }
    }
}

