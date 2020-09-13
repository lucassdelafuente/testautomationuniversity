package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"street", "flat_no", "pincode", "type"})
public class Address {
    private String street;
    private String flat_no;
    private int pincode;
    private String type;

    public Address(){

    }

    public Address(String street, String flat_no, int pincode, String type){
       this.street = street;
       this.flat_no = flat_no;
       this.pincode = pincode;
       this.type = type;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("flat_no")
    public String getFlat_no() {
        return flat_no;
    }

    @JsonProperty("flat_no")
    public void setFlat_no(String flat_no) {
        this.flat_no = flat_no;
    }

    @JsonProperty("pincode")
    public int getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }
}
