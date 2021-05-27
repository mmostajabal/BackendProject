/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class LoginClass {
    private Integer _UserId;
    private String _FirstName;
    private String _LastName;
    private String _UserName;
    private String _Email;
    private String _PhoneNumber;
    private String _Password;
    private Integer _UserType;
    private Integer _UserScore;

    public String getFirstName() {
        return _FirstName;
    }

    public void setFirstName(String _FirstName) {
        this._FirstName = _FirstName;
    }

    public String getLastName() {
        return _LastName;
    }

    public void setLastName(String _LastName) {
        this._LastName = _LastName;
    }

    public String getUserName() {
        return _UserName;
    }

    public void setUserName(String _UserName) {
        this._UserName = _UserName;
    }

    public String getEmail() {
        return _Email;
    }

    public void setEmail(String _Email) {
        this._Email = _Email;
    }

    public String getPhoneNumber() {
        return _PhoneNumber;
    }

    public void setPhoneNumber(String _PhoneNumber) {
        this._PhoneNumber = _PhoneNumber;
    }

    public String getPassword() {
        return _Password;
    }

    public void setPassword(String _Password) {
        this._Password = _Password;
    }
    
    
    public boolean CheckLogin(String UseName, String Password){
        
        return true;
    }

    public int getUserType() {
        return _UserType;
    }

    public void setUserType(int _UserType) {
        this._UserType = _UserType;
    }

    public int getUserScore() {
        return _UserScore;
    }

    public void setUserScore(int _UserScore) {
        this._UserScore = _UserScore;
    }
    
}
