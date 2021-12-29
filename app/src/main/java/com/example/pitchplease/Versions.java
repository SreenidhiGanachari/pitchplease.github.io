package com.example.pitchplease;

public class Versions {


    private String codeName,version,apilevel,description,phone,name,returnp;
    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public Versions(String codeName, String version, String apilevel, String description,String phone , String name,String returnp) {
        this.codeName = codeName;
        this.version = version;
        this.apilevel = apilevel;
        this.description = description;
        this.phone=phone;
        this.name=name;
        this.returnp=returnp;
        this.expandable=false;

    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApilevel() {
        return apilevel;
    }

    public void setApilevel(String apilevel) {
        this.apilevel = apilevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String description) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String description) {
        this.name = name;

    }

    public String getReturnp() {
        return returnp;
    }

    public void setReturnp(String returnp) {
        this.returnp = returnp;

    }


    @Override
    public String toString() {
        return "Versions{" +
                "codeName='" + codeName + '\'' +
                ", version='" + version + '\'' +
                ", apilevel='" + apilevel + '\'' +
                ", description='" + description + '\'' +
                ", phone='" + phone+ '\'' +
                ", name='" + name+ '\'' +
                ", returnp='" + returnp+ '\'' +

                '}';
    }
}
