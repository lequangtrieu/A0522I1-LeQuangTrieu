package ss22_case_study.Services.Implement;

import com.sun.source.tree.UsesTree;
import ss22_case_study.Models.Facility.Facility;
import ss22_case_study.Models.Facility.House;
import ss22_case_study.Models.Facility.Room;
import ss22_case_study.Models.Facility.Villa;
import ss22_case_study.Models.Person.Customer;
import ss22_case_study.Models.Person.Employee;
import ss22_case_study.Services.FacilityService;

import java.io.*;
import java.util.*;

public class FacilityServiceImp implements FacilityService {
    private Scanner input = new Scanner(System.in);
    @Override
    public void add() {
        while (true) {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    addingVilla(); break;
                case 2:
                    addingHouse(); break;
                case 3:
                    addingRoom(); break;
                case 4:
                    return;
            }
        }
    }

    @Override
    public void display() {
        try {
            Map<Villa, Integer> villaMap = new LinkedHashMap<>();
            Map<House, Integer> houseMap = new LinkedHashMap<>();
            Map<Room, Integer> roomMap = new LinkedHashMap<>();
            readVillaCSV(villaMap);
            readHouseCSV(houseMap);
            readRoomCSV(roomMap);
            Set<Villa> villas = villaMap.keySet();
            Set<House> houses = houseMap.keySet();
            Set<Room> rooms = roomMap.keySet();
            for (Villa villa :
                    villas) {
                System.out.println(villa.displayVilla() + ", number of times used villa service: " + villaMap.get(villa));
            }
            for (House house :
                    houses) {
                System.out.println(house.displayHouse() + ", number of times used house service: " + houseMap.get(house));
            }
            for (Room room :
                    rooms) {
                System.out.println(room.displayRoom() + ", number of times used room service: " + roomMap.get(room));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editInfo() {

    }

    @Override
    public void displayMaintenance() {

    }

    private Facility infoFacility() {
        System.out.println("enter the serviceName: ");
        String serviceName = input.nextLine();
        System.out.println("enter the using area: ");
        int usingArea = Integer.parseInt(input.nextLine());
        System.out.println("enter the price: ");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("enter the amountPeople: ");
        int amountPeople = Integer.parseInt(input.nextLine());
        System.out.println("enter the rentType: ");
        String rentType = input.nextLine();
        Facility facilityInfo = new Facility(serviceName, usingArea, price, amountPeople, rentType) {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
        return facilityInfo;
    }

    private Villa infoVilla() {
        Facility facility = infoFacility();
        System.out.println("enter the levelRoom: ");
        int levelRoom = Integer.parseInt(input.nextLine());
        System.out.println("enter the areaPool: ");
        int areaPool = Integer.parseInt(input.nextLine());
        System.out.println("enter the floors: ");
        int floors = Integer.parseInt(input.nextLine());
        Villa villa = new Villa(facility.getServiceName(), facility.getUsingArea(), facility.getPrice(), facility.getAmountPeople(), facility.getRentType(), levelRoom, areaPool, floors);
        return villa;
    }

    private House infoHouse() {
        Facility facility = infoFacility();
        System.out.println("enter the levelRoom: ");
        int levelRoom = Integer.parseInt(input.nextLine());
        System.out.println("enter the floors: ");
        int floors = Integer.parseInt(input.nextLine());
        House house = new House(facility.getServiceName(), facility.getUsingArea(), facility.getPrice(), facility.getAmountPeople(), facility.getRentType(), levelRoom, floors);
        return house;
    }

    private Room infoRoom() {
        Facility facility = infoFacility();
        System.out.println("enter the freeService: ");
        String freeService = input.nextLine();
        Room room = new Room(facility.getServiceName(), facility.getUsingArea(), facility.getPrice(), facility.getAmountPeople(), facility.getRentType(), freeService);
        return room;
    }

    @Override
    public void addingVilla() {
        try {
            Map<Villa, Integer> villaMap = new LinkedHashMap<>();
            readVillaCSV(villaMap);
            Villa villa = this.infoVilla();
            villaMap.put(villa, 1);
            writeVillaCSV(villaMap);
            System.out.println("adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addingHouse() {
        try {
            Map<House, Integer> houseMap = new LinkedHashMap<>();
            readHouseCSV(houseMap);
            House house = this.infoHouse();
            houseMap.put(house, 1);
            writeHouseCSV(houseMap);
            System.out.println("adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addingRoom() {
        try {
            Map<Room, Integer> roomMap = new LinkedHashMap<>();
            readRoomCSV(roomMap);
            Room room = this.infoRoom();
            roomMap.put(room, 1);
            writeRoomCSV(roomMap);
            System.out.println("adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readVillaCSV(Map<Villa, Integer> villaMap) throws IOException {
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\villa.csv");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        Villa villa;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            String serviceName = temp[0];
            int usingArea = Integer.parseInt(temp[1]);
            int price = Integer.parseInt(temp[2]);
            int amountPeople = Integer.parseInt(temp[3]);
            String rentType = temp[4];
            int levelRoom = Integer.parseInt(temp[5]);
            int areaPool = Integer.parseInt(temp[6]);
            int floors = Integer.parseInt(temp[7]);
            int index = Integer.parseInt(temp[8]);
            villa = new Villa(serviceName, usingArea, price, amountPeople, rentType, levelRoom, areaPool, floors);
            villaMap.put(villa, index);
        }
        br.close();
    }

    private void writeVillaCSV(Map<Villa, Integer> villaMap) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\villa.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        Set<Villa> villas = villaMap.keySet();
        for (Villa villa :
                villas) {
            bw.write(villa + "," + villaMap.get(villa));
            bw.write("\n");
        }
        bw.close();
    }

    private void readHouseCSV(Map<House, Integer> houseMap) throws IOException {
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\house.csv");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        House house;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            String serviceName = temp[0];
            int usingArea = Integer.parseInt(temp[1]);
            int price = Integer.parseInt(temp[2]);
            int amountPeople = Integer.parseInt(temp[3]);
            String rentType = temp[4];
            int levelRoom = Integer.parseInt(temp[5]);
            int floors = Integer.parseInt(temp[6]);
            int index = Integer.parseInt(temp[7]);
            house = new House(serviceName, usingArea, price, amountPeople, rentType, levelRoom, floors);
            houseMap.put(house, index);
        }
        br.close();
    }

    private void writeHouseCSV(Map<House, Integer> houseMap) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\house.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        Set<House> houses = houseMap.keySet();
        for (House house :
                houses) {
            bw.write(house + "," + houseMap.get(house));
            bw.write("\n");
        }
        bw.close();
    }

    private void readRoomCSV(Map<Room, Integer> roomMap) throws IOException {
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\room.csv");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        Room room;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            String serviceName = temp[0];
            int usingArea = Integer.parseInt(temp[1]);
            int price = Integer.parseInt(temp[2]);
            int amountPeople = Integer.parseInt(temp[3]);
            String rentType = temp[4];
            String freeService = temp[5];
            int index = Integer.parseInt(temp[6]);
            room = new Room(serviceName, usingArea, price, amountPeople, rentType, freeService);
            roomMap.put(room, index);
        }
        br.close();
    }

    private void writeRoomCSV(Map<Room, Integer> roomMap) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\room.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        Set<Room> rooms = roomMap.keySet();
        for (Room room :
                rooms) {
            bw.write(room + "," + roomMap.get(room));
            bw.write("\n");
        }
        bw.close();
    }
}
