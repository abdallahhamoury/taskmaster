package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SettingsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button submitUserNameInfo=findViewById(R.id.submitUsernameButtom);



        submitUserNameInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(SettingsPage.this);
                SharedPreferences.Editor sharedPreferencesEdit=sharedPreferences.edit();
                EditText userNameInput=findViewById(R.id.userNameInputId);
                String userName=userNameInput.getText().toString();


                //send team name to main by sharedPreferences
                RadioGroup radioGroup=findViewById(R.id.groupRadioButtonFromSettingId);
                RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                String radioString=radioButton.getText().toString();

                sharedPreferencesEdit.putString("userName",userName);
                sharedPreferencesEdit.putString("teamName",radioString);
//                System.out.println(radioString);
                sharedPreferencesEdit.apply();

                Intent transferToMainActivity=new Intent(SettingsPage.this,MainActivity.class);
                startActivity(transferToMainActivity);
            }
        });
    }
}