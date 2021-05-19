package cities;

import cityelement.Hospital;
import cityelement.House;
import cityelement.Restaurant;
import cityelement.School;

public  class Cities {

    House buildTheHouse (){
        return new House();
    }

    Hospital buildTheHospital (){
        return new Hospital();
    }
    School buildtTheSchool (){
        return new School();
    }
    Restaurant buildTheRest (){
        return new Restaurant();
    }

}
