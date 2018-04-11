/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author MSI
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="User")
public class User {
    
    @XmlElement(name="username")
    String username;
    
    @XmlElement(name="password")
    char[] password;
    
    @XmlElement(name="Nickname")
    String Nickname;
    
    public User(String username, char[] password, String nickname){
        this.username = username;
        this.password = password;
        this.Nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return password;
    }

    public String getNickname() {
        return Nickname;
    }
    
}
