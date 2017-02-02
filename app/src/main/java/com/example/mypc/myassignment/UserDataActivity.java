package com.example.mypc.myassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class UserDataActivity extends AppCompatActivity {
    TextView username, father, contact, dob, identity, passw, address, radiobtnm, CheckBox, radiobtnf, qual;
    Button dialogbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);
        username = (TextView) findViewById(R.id.username);
        father = (TextView) findViewById(R.id.father);
        contact = (TextView) findViewById(R.id.contact);
        dob = (TextView) findViewById(R.id.dob);
        identity = (TextView) findViewById(R.id.identity);
        passw = (TextView) findViewById(R.id.passw);
        address = (TextView) findViewById(R.id.address);
        radiobtnm = (TextView) findViewById(R.id.radiobtnm);
        CheckBox = (TextView) findViewById(R.id.check_box);
        qual = (TextView) findViewById(R.id.quali);
        dialogbtn=(Button) findViewById(R.id.dialogbtn);
     /*   dialogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserDataActivity.this, ImageVideo.class);
                startActivity(intent);
            }
        });*/
//        radiobtnf=(TextView) findViewById(R.id.radiobtnf);
        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        String faname = intent.getStringExtra("faname");
        String cnum = intent.getStringExtra("cnum");
        String age = intent.getStringExtra("age");
        String email = intent.getStringExtra("email");
        String pass = intent.getStringExtra("pass");
        String add = intent.getStringExtra("add");
        String rbm = intent.getStringExtra("REST");
        String rbf = intent.getStringExtra("REST");
        username.setText("Your name is: " + fname + " " + lname);
        father.setText("Your father name is: " + faname);
        contact.setText("Your Contact num is: " + cnum);
        dob.setText("Your age is: " + age);
        identity.setText("Your email is: " + email);
        passw.setText("Your password is: " + pass);
        address.setText("Your address is: " + add);
        radiobtnm.setText("Your Gender is: " + rbm);
        qual.setText(intent.getStringExtra("qualification"));


        Boolean check1 = getIntent().getExtras().getBoolean("Reading");
        Boolean check2 = getIntent().getExtras().getBoolean("Dancing");
        Boolean check3 = getIntent().getExtras().getBoolean("Singing");
        Boolean check4 = getIntent().getExtras().getBoolean("Play_bad");
        Boolean check5 = getIntent().getExtras().getBoolean("Play_cric");
        Boolean[] array1 = {check1, check2, check3, check4, check5};
        String[] array2 = {"Reading", "Dancing", "Singing", "Badminton", "Cricket"};
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]) {
                buffer.append(array2[i]).append(" ");
            }
        }
        CheckBox.setText(buffer.toString());
    }

}
