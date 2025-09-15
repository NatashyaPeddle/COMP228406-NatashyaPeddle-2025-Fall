package exercise1;

public class SingerDriver {

    public static void main(String[] args) {
        //CREATE instance of singer
        Singer singer1 = new Singer();

        //display default stats for singer1
        System.out.println(singer1.getId());
        System.out.println(singer1.getName());
        System.out.println(singer1.getAddress());
        System.out.println(singer1.getBirthday());
        System.out.println(singer1.getAlbumnumber());



        //set the new singer's stats
        singer1.SetId("123");
        singer1.SetName("John Doe");
        singer1.SetAddress("Address 123 St");
        singer1.SetBirthday("10/31/2005");
        singer1.SetAlbumnumber(4);

        //display stats for singer1
        System.out.println("---Singer Info---");
        System.out.println(singer1.getId());
        System.out.println(singer1.getName());
        System.out.println(singer1.getAddress());
        System.out.println(singer1.getBirthday());
        System.out.println(singer1.getAlbumnumber());

        //change stat values




        //list the new singer's name with getters


    }
}
