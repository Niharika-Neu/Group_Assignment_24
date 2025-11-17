/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Business.Directories;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 *
 * @author nihar
 */
public class BusinessDirectory {
    
    private ArrayList<Business> businessList;

    public BusinessDirectory() {
        businessList = new ArrayList<>();
    }

    public ArrayList<Business> getBusinessList() {
        return businessList;
    }

    public Business addBusiness(Business business) {
        businessList.add(business);
        return business;
    }

    public void removeBusiness(Business business) {
        businessList.remove(business);
    }

   public Business findBusinessByName(String name) {
    if (name == null) return null;

    for (Business b : businessList) {
        if (b != null && b.getName() != null && b.getName().equalsIgnoreCase(name)) {
          return b;
}
    }
    return null;
}
}

