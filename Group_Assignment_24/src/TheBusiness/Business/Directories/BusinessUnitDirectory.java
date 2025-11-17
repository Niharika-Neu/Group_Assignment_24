/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Business.Directories;

/**
 *
 * @author nihar
 */

import java.util.ArrayList;

public class BusinessUnitDirectory {

    private ArrayList<BusinessUnit> unitList;

    public BusinessUnitDirectory() {
        unitList = new ArrayList<>();
    }

    public ArrayList<BusinessUnit> getUnitList() {
        return unitList;
    }

    public BusinessUnit addBusinessUnit(String name) {
        BusinessUnit unit = new BusinessUnit(name);
        unitList.add(unit);
        return unit;
    }

    public void removeBusinessUnit(BusinessUnit unit) {
        unitList.remove(unit);
    }

    public BusinessUnit findUnitByName(String name) {
        for (BusinessUnit u : unitList) {
            if (u.getUnitName().equalsIgnoreCase(name)) {
                return u;
            }
        }
        return null;
    }
}

