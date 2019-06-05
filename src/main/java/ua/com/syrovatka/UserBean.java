package ua.com.syrovatka;

public class UserBean {
    private String surname;
    private String name;
    private String patronymic;
    private String ip;
    private String mac;

    public UserBean(String surname, String name, String patronymic, String ip, String mac) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.ip = ip;
        this.mac = mac;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
