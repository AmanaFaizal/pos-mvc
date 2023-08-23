/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author ASS if
 */
public class CustomerModel {
    private String cusId;
    private String custitle;
    private String cusname;
    private String cusdob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String zip;

    public CustomerModel() {
    }

    public CustomerModel(String cusId, String custitle, String cusname, String cusdob, Double salary, String address, String city, String province, String zip) {
        this.cusId = cusId;
        this.custitle = custitle;
        this.cusname = cusname;
        this.cusdob = cusdob;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip = zip;
    }

    /**
     * @return the cusId
     */
    public String getCusId() {
        return cusId;
    }

    /**
     * @param cusId the cusId to set
     */
    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    /**
     * @return the custitle
     */
    public String getCustitle() {
        return custitle;
    }

    /**
     * @param custitle the custitle to set
     */
    public void setCustitle(String custitle) {
        this.custitle = custitle;
    }

    /**
     * @return the cusname
     */
    public String getCusname() {
        return cusname;
    }

    /**
     * @param cusname the cusname to set
     */
    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    /**
     * @return the cusdob
     */
    public String getCusdob() {
        return cusdob;
    }

    /**
     * @param cusdob the cusdob to set
     */
    public void setCusdob(String cusdob) {
        this.cusdob = cusdob;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "cusId=" + cusId + ", custitle=" + custitle + ", cusname=" + cusname + ", cusdob=" + cusdob + ", salary=" + salary + ", address=" + address + ", city=" + city + ", province=" + province + ", zip=" + zip + '}';
    }

   
}
