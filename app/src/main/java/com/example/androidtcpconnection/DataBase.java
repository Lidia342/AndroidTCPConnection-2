package com.example.androidtcpconnection;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private DatabaseReference dbref;
    private FirebaseDatabase firebaseDatabase;
    Map<String, Object> data;

    public void UpdateLampElement(String value) {
        data = new HashMap<>();
        dbref = FirebaseDatabase
                .getInstance("https://smart-house-ae2d9-default-rtdb.europe-west1.firebasedatabase.app/")
                .getReference().child("Devices").child("Lamp").child("Ambient");

        data.put("LightSwitch",value);


        dbref.updateChildren(data);


    }

}
