package lab_4;

import lab_4.Device;
// class B, extends class A
public class Phone extends Device {
    private String cameraQuality;
    private String screenResolution;

    public Phone(String type, String ramMemory, String storage, String procesor, String cameraQuality, String screenResolution) {
        super(type, ramMemory, storage, procesor);
        this.cameraQuality = cameraQuality;
        this.screenResolution = screenResolution;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(String cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public String getStorage() {
        return super.getStorage() + " SSD Storage";
    }
}
