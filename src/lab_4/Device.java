package lab_4;

// Class A
public class Device {
    private String type;
    private String ramMemory;
    private String storage;
    private String procesor;

    public Device(String type, String ramMemory, String storage, String procesor) {
        this.type = type;
        this.ramMemory = ramMemory;
        this.storage = storage;
        this.procesor = procesor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }
}
