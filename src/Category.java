/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class Category {
    private String _CategoryId;
    private String _CategoryDesc;    

    public Category(String _CategoryId, String _CategoryDesc) {
        this._CategoryId = _CategoryId;
        this._CategoryDesc = _CategoryDesc;
    }

    public String getCategoryId() {
        return _CategoryId;
    }

    public void setCategoryId(String _CategoryId) {
        this._CategoryId = _CategoryId;
    }

    public String getCategoryDesc() {
        return _CategoryDesc;
    }

    public void setCategoryDesc(String _CategoryDesc) {
        this._CategoryDesc = _CategoryDesc;
    }
 
    @Override
    public String toString() {
        return this._CategoryDesc;
    }

}
