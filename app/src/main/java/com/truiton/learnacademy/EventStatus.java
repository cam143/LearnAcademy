package com.truiton.learnacademy;

/**
 * Created by CamCam on 8/3/2017.
 */

public class EventStatus {

    public static String app_title = "Learn Academy (" + EventStatus.option2 + ")"; // Title
    public static int app_status = EventStatus.option2_status;

    // Option Status
    public static final int option1_status = 1;
    public static final int option2_status = 2;
    public static final int option3_status = 3;

    // Option Title
    private final static String option1 = "Bisaya";
    private final static String option2 = "English";
    private final static String option3 = "Tagalog";

    // Set Option 1
    public static void set_option1(){
        EventStatus.app_title = "Learn Academy (" + EventStatus.option1 + ")";
        EventStatus.app_status = EventStatus.option1_status;
    }

    // Set Option 2
    public static void set_option2(){
        EventStatus.app_title = "Learn Academy (" + EventStatus.option2 + ")";
        EventStatus.app_status = EventStatus.option2_status;
    }

    // Set Option 3
    public static void set_option3(){
        EventStatus.app_title = "Learn Academy (" + EventStatus.option3 + ")";
        EventStatus.app_status = EventStatus.option3_status;
    }

}
