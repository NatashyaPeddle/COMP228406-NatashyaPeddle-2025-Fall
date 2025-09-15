package exercise1;

public class Singer {
    //declaring variables
    //required: id, name, address, date of birth, number of albums published

    private String id;
    private String name;
    private String address;
    private String birthday;
    private int albumnumber;

    //constructor - no arguements / default
    public Singer() {
        this.id = "default";
        this.name = "default";
        this.address = "default";
        this.birthday = "default";
        this.albumnumber = 0;
    }
    //constructor with 5 arguements
    public Singer(String id, String name, String address, String birthday, int albumnumber){
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.albumnumber = albumnumber;
    }

    //setters
    public void SetId (String id){
        this.id = id;
    }
    public void SetName (String name){
        this.name = name;
    }
    public void SetAddress (String address){
        this.address = address;
    }
    public void SetBirthday ( String birthday){
        this.birthday = birthday;
    }
    public void SetAlbumnumber ( int albumnumber){
        this.albumnumber = albumnumber;
    }

    //getters
    public String getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public String getAddress () {
        return address;
    }

    public String getBirthday () {
        return birthday;
    }

    public int getAlbumnumber () {
        return albumnumber;
    }
}


