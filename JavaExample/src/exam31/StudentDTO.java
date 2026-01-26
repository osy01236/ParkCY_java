package exam31;

import java.sql.Date;

public class StudentDTO {

    private int hakbun;
    private String name;
    private String ssn;
    private String phone;
    private String address;
    private Date createddate;

    public StudentDTO() {}

    public int getHakbun() {
        return hakbun;
    }
    public void setHakbun(int hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateddate() {
        return createddate;
    }
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
}
