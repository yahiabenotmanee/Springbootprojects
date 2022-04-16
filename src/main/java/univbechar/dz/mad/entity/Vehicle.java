package univbechar.dz.mad.entity;

public class Vehicle {


    private final long  vehId;
    private final String  vehtype;
    private final String vehName;



    public Vehicle(long vehicleId, String vehiclename,String vehicletype ) {
        this.vehId = vehicleId;
        this.vehtype = vehicletype;
        this.vehName = vehiclename;
    }

    public long getId() {
        return vehId;
    }

    public String getName() {
        return vehName;

    }
    public String getemail(){
        return vehtype;
    }
}

