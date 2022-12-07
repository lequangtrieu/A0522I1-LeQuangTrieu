package ss22_case_study.Services;

import ss22_case_study.Models.Facility.House;
import ss22_case_study.Models.Facility.Room;
import ss22_case_study.Models.Facility.Villa;

public interface FacilityService extends IService{
    void displayMaintenance();
    void addingVilla();
    void addingHouse();
    void addingRoom();
}
