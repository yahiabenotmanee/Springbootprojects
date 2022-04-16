package univbechar.dz.mad.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

public class User {


//    @OneToMany(targetEntity = Vehicle.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_vehicle",referencedColumnName = "id")
//    private List<Vehicle> vehicles;


    private final long id;
    private final String name ;
    private final String email ;



    public User(long id, String name,String email ) {
        this.id = id;
        this.name = name;
        this.email = null;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;

    }
    public String getemail(){
        return email;
    }
}
