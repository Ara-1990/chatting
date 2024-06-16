package com.the.chatting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class BaseActivity extends AppCompatActivity {


    private DocumentReference documentReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        PreferanceMeneger preferanceMeneger = new PreferanceMeneger(getApplicationContext());
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        documentReference = database.collection(Constants.KEY_COLlECTION_USERS)
                .document(preferanceMeneger.getString(Constants.KEY_USER_ID));

    }


    @Override
    protected void onPause(){
        super.onPause();
        documentReference.update(Constants.KEY_AVAILABLITY, 0);
    }
    @Override
    protected void onResume(){
        super.onResume();
        documentReference.update(Constants.KEY_AVAILABLITY, 1);
    }
}