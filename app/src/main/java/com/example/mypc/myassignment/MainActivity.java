package com.example.mypc.myassignment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TextView f_name, l_name, fa_name, c_num, gen, highedu, age, email, pass, add, hobby,qual;
    EditText f_name_edt, l_name_edt, fa_name_edt, c_num_edt, age_edt, email_edt, pass_edt, add_edt;
    RadioButton r_m_btn, r_f_btn;
    RadioGroup rgbtn;
    Spinner spinner;
    CheckBox chk_read, chk_dance, chk_sing, chk_play_bad, chk_play_cric;
    Button sub_btn,dialogbtn;
    String qualification,hobbies;
    final Context context=this;
    TextView textdia;
    public static final String MYPREFERENCE="Myprefs";
    public static final String firstname="fnamekey";
    public static final String lastname="lnamekey";
    public static final String fathername="fanamekey";
    public static final String contactnumber="cnumkey";
    public static final String agest="agekey";
    public static final String emailst="emailkey";
    public static final String password="passkey";
    public static final String address="addkey";
    public static final String quali="qualkey";
    boolean radiokey=false;
    boolean radiokey1=false;
    boolean chkreading=false;
    boolean chkdancing=false;
    boolean chkplacric=false;
    boolean chksinging=false;
    boolean chkplabad=false;
    boolean isHobbies=false;

    SharedPreferences sharedPreferences;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f_name = (TextView) findViewById(R.id.f_name);
        l_name = (TextView) findViewById(R.id.l_name);
        fa_name = (TextView) findViewById(R.id.fa_name);
        c_num = (TextView) findViewById(R.id.c_num);
        gen = (TextView) findViewById(R.id.gen);
        highedu = (TextView) findViewById(R.id.highedu);
        age = (TextView) findViewById(R.id.age);
        email = (TextView) findViewById(R.id.email);
        pass = (TextView) findViewById(R.id.pass);
        add = (TextView) findViewById(R.id.add);
        hobby = (TextView) findViewById(R.id.hobby);
        hobby = (TextView) findViewById(R.id.hobby);
        f_name_edt = (EditText) findViewById(R.id.f_name_edt);
        l_name_edt = (EditText) findViewById(R.id.l_name_edt);
        fa_name_edt = (EditText) findViewById(R.id.fa_name_edt);
        c_num_edt = (EditText) findViewById(R.id.c_num_edt);
        age_edt = (EditText) findViewById(R.id.age_edt);
        email_edt = (EditText) findViewById(R.id.email_edt);
        pass_edt = (EditText) findViewById(R.id.pass_edt);
        add_edt = (EditText) findViewById(R.id.add_edt);
        rgbtn = (RadioGroup) findViewById(R.id.rgbtn);
        int checked = rgbtn.getCheckedRadioButtonId();
        r_m_btn = (RadioButton) findViewById(R.id.r_m_btn);
        r_f_btn = (RadioButton) findViewById(R.id.r_f_btn);
        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        qualification="Diploma";
                        Toast.makeText(getApplicationContext(), "Diploma has been Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        qualification="B-tech";
                        Toast.makeText(getApplicationContext(), "B-Tech has been Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        qualification="BCA";
                        Toast.makeText(getApplicationContext(), "BCA has been Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        qualification="MCA";
                        Toast.makeText(getApplicationContext(), "MCA has been Selected", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        chk_read = (CheckBox) findViewById(R.id.chk_read);
        chk_dance = (CheckBox) findViewById(R.id.chk_dance);
        chk_sing = (CheckBox) findViewById(R.id.chk_sing);
        chk_play_bad = (CheckBox) findViewById(R.id.chk_play_bad);
        chk_play_cric = (CheckBox) findViewById(R.id.chk_play_cric);

        sub_btn = (Button) findViewById(R.id.sub_btn);
        sharedPreferences = getSharedPreferences(MYPREFERENCE, Context.MODE_PRIVATE);

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor= sharedPreferences.edit();
                String fn=f_name_edt.getText().toString();
                String ln=l_name_edt.getText().toString();
                String fan=fa_name_edt.getText().toString();
                String cn=c_num_edt.getText().toString();
                String ag=age_edt.getText().toString();
                String em=email_edt.getText().toString();
                String pa=pass_edt.getText().toString();
                String ad=add_edt.getText().toString();
                editor.putString(firstname,fn);
                editor.putString(lastname,ln);
                editor.putString(fathername,fan);
                editor.putString(contactnumber,cn);
                editor.putString(agest,ag);
                editor.putString(emailst,em);
                editor.putString(password,pa);
                editor.putString(address,ad);
                int checked = rgbtn.getCheckedRadioButtonId();
                if (checked == R.id.r_m_btn) {
                    radiokey=true;
                    editor.putBoolean("Male",radiokey);
                } else if (checked == R.id.r_f_btn) {
                   radiokey=false;
                    editor.putBoolean("Male",radiokey);
                }
                StringBuffer result=new StringBuffer();
                if(chk_read.isChecked())
                {
                    result.append("Reading"+" ");

                }
                if(chk_dance.isChecked())
                {
                    result.append("Dancing"+" ");

                }
                if(chk_play_cric.isChecked()){
                    result.append("Playing Cricket"+" ");

                }
                if(chk_sing.isChecked())
                {
                    result.append("Singing"+" ");

                }
                if(chk_play_bad.isChecked())
                {
                    result.append("Playing Badminton"+" ");
                }


                Log.e("hobbies",""+result);
                editor.putString("Hobbies",result.toString());
                 editor.commit();
                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.activity_user_data);
               boolean test= sharedPreferences.getBoolean("Male",true);
                dialogbtn=(Button)dialog.findViewById(R.id.dialogbtn);
                dialogbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, ImageVideo.class);
                        startActivity(intent);
                    }
                });
                String abcd=sharedPreferences.getString(firstname,fn);
                String abck=sharedPreferences.getString(lastname,fn);
                String abce=sharedPreferences.getString(fathername,fan);
                String abcf=sharedPreferences.getString(contactnumber,cn);
                String abcg=sharedPreferences.getString(agest,ag);
                String abch=sharedPreferences.getString(emailst,em);
                String abci=sharedPreferences.getString(password,pa);
                String abcj=sharedPreferences.getString(address,ad);
                String hobies=sharedPreferences.getString("Hobbies","");
//                String abcl=sharedPreferences.getString(qualification);
                TextView username = (TextView) dialog.findViewById(R.id.username);
                TextView father = (TextView) dialog.findViewById(R.id.father);
                TextView contact = (TextView) dialog.findViewById(R.id.contact);
                TextView dob = (TextView) dialog. findViewById(R.id.dob);
                TextView identity = (TextView)dialog. findViewById(R.id.identity);
                TextView passw = (TextView) dialog.findViewById(R.id.passw);
                TextView address = (TextView) dialog.findViewById(R.id.address);
                TextView radiobtnm = (TextView) dialog.findViewById(R.id.radiobtnm);
                TextView CheckBox = (TextView) dialog.findViewById(R.id.check_box);
                TextView qual = (TextView) dialog.findViewById(R.id.quali);
                if(test)
                {
                    radiobtnm.setText("Male");
                }

                else
                {
                    radiobtnm.setText("Female");
                }

                username.setText("Your name is: "+abcd+" "+abck);
                father.setText("Your Father's name is: "+abce);
                contact.setText("Your Contact number is: "+abcf);
                dob.setText("Your age is: "+abcg);
                identity.setText("Your email is: "+abch);
                passw.setText("Your Password is: "+abci);
                address.setText("Your address is: "+abcj);
                qual.setText("your course is:"+qualification);
                CheckBox.setText("Your Hobbies are :"+hobies);
                dialog.show();

            }
        });

  /*      sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserDataActivity.class);
                intent.putExtra("fname", f_name_edt.getText().toString());
                intent.putExtra("lname", l_name_edt.getText().toString());
                intent.putExtra("faname", fa_name_edt.getText().toString());
                intent.putExtra("cnum", c_num_edt.getText().toString());
                intent.putExtra("age", age_edt.getText().toString());
                intent.putExtra("email", email_edt.getText().toString());
                intent.putExtra("pass", pass_edt.getText().toString());
                intent.putExtra("add", add_edt.getText().toString());
                intent.putExtra("qualification", qualification);
                int checked = rgbtn.getCheckedRadioButtonId();
                if (checked == R.id.r_m_btn) {
                    intent.putExtra("REST", "male");
                } else if (checked == R.id.r_f_btn) {
                    intent.putExtra("REST", "female");
                }

//                chk_read = (CheckBox) findViewById(R.id.chk_read);
//                chk_dance = (CheckBox) findViewById(R.id.chk_dance);
//                chk_sing = (CheckBox) findViewById(R.id.chk_sing);
//                chk_play_bad = (CheckBox) findViewById(R.id.chk_play_bad);
//                chk_play_cric = (CheckBox) findViewById(R.id.chk_play_cric);

                intent.putExtra("Reading", chk_read.isChecked());
                intent.putExtra("Dancing", chk_dance.isChecked());
                intent.putExtra("Singing", chk_sing.isChecked());
                intent.putExtra("Play_bad", chk_play_bad.isChecked());
                intent.putExtra("Play_cric", chk_play_cric.isChecked());
                Toast.makeText(MainActivity.this, "inside button click", Toast.LENGTH_SHORT).show();
                if (chk_read.isChecked()) {
                    Toast.makeText(MainActivity.this, "checked", Toast.LENGTH_SHORT).show();
                }

//                    intent.putExtra("rbm", r_m_btn.getText().toString());
//                intent.putExtra("rbf", r_f_btn.getText().toString());
                startActivity(intent);
            }
        });*/
    }


}
