package co.develhope.introduction.Encapsulation;

import java.util.List;

class BigHouse {
    private int floorsNumber;
    private String address;
    private List<String> residentsNames;

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(List<String> residentsNames) {
        this.residentsNames = residentsNames;
    }
}
