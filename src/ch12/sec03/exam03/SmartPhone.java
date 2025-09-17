package ch12.sec03.exam03;

public class SmartPhone {
    private String Company;
    private String os;

    public SmartPhone(String Company, String os) {
        this.Company = Company;
        this.os = os;
    }
    @Override
    public String toString() {
        return Company + ","+ os;
    }
}


