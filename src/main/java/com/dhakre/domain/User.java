package com.dhakre.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author Vivek on 13/6/17.
 * @project restapi
 * @package com.dhakre.domain
 */

@XmlRootElement(name="user")
public class User implements Serializable {

    private int id;
    private String name;
    private String profession;

    public User() {
    }

    public User(int id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    @XmlElement
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
