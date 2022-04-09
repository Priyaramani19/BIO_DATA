package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Data_Activity extends AppCompatActivity {

    private EditText name_adt,surname_adt,fname_adt,mname_adt,village_adt,
                     add_adt,mbl_adt,birth_adt,mail_adt;
    private Button submit_btn,reset_btn;
    private RadioGroup rd_grp_btn;
    private RadioButton male_btn,female_btn;
    private CheckBox read_chk,dance_chk,sing_chk,swim_chk,travel_chk;
    private SeekBar seek;
    private TextView seek_txt;
    String gender,read,dance,sing,swim,travel,age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        binding();



        read_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    read = "Reading";
                }
                else
                {
                    read = "";
                }
            }
        });

        dance_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    dance = "Dancing";
                }
                else
                {
                    dance = "";
                }
            }
        });

        sing_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    sing = "Singing";
                }
                else
                {
                    sing = "";
                }
            }
        });

        swim_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    swim = "Swimming";
                }
                else
                {
                    swim = "";
                }
            }
        });

        travel_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    travel = "Travelling";
                }
                else
                {
                    travel = "";
                }
            }
        });


        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seek_txt.setText(""+i);
                age=""+i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                male_btn.setChecked(false);
                female_btn.setChecked(false);

                read_chk.setChecked(false);
                dance_chk.setChecked(false);
                sing_chk.setChecked(false);
                swim_chk.setChecked(false);
                travel_chk.setChecked(false);

                name_adt.setText("");
                surname_adt.setText("");
                fname_adt.setText("");
                mname_adt.setText("");
                birth_adt.setText("");
                village_adt.setText("");
                add_adt.setText("");
                mbl_adt.setText("");
                mail_adt.setText("");

                seek.setProgress(0);
            }
        });

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = name_adt.getText().toString();
                String surname = surname_adt.getText().toString();
                String fname = fname_adt.getText().toString();
                String mname = mname_adt.getText().toString();
                String birth = birth_adt.getText().toString();
                String village = village_adt.getText().toString();
                String add = add_adt.getText().toString();
                String mobile = mbl_adt.getText().toString();
                String mail = mail_adt.getText().toString();


                if(rd_grp_btn.getCheckedRadioButtonId() == R.id.male_btn) {
                    gender = "Male";
                }
                else if(rd_grp_btn.getCheckedRadioButtonId() == R.id.female_btn) {
                    gender = "Female";
                }


                if(name_adt.getText().length()==0){
                    name_adt.setError("Enter Your Name");
                }
                else if(surname_adt.getText().length()==0) {
                    surname_adt.setError("Enter SurName");
                }
                else if(fname_adt.getText().length()==0) {
                    fname_adt.setError("Enter Father Name");
                }
                else if(mname_adt.getText().length()==0) {
                    mname_adt.setError("Enter Mother Name");
                }
                else if(mbl_adt.getText().length()==0) {
                    mbl_adt.setError("Enter Mobile Number");
                }
                else if(mbl_adt.getText().length()!=10){
                    mbl_adt.setError("Enter Valid Mobile number");
                }
                else if(birth_adt.getText().length()==0) {
                    birth_adt.setError("Enter Birth Date");
                }
                else if(village_adt.getText().length()==0) {
                    village_adt.setError("Enter Village Name");
                }
                else if(add_adt.getText().length()==0) {
                    add_adt.setError("Enter Village Name");
                }
                else if (mail_adt.getText().length()==0) {
                    mail_adt.setError("Enter E-Mail");
                }
                else
                {
//                    Toast.makeText(Data_Activity.this, name+"\n"+surname+"\n"+fname+"\n"+mname+"\n"+age+"\n"+gender+"\n"+read+"\n"+dance+"\n"+sing+"\n"+swim+"\n"+travel, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Data_Activity.this,MainActivity.class);
                    intent.putExtra("n1",name);
                    intent.putExtra("n2",surname);
                    intent.putExtra("n3",fname);
                    intent.putExtra("n4",mname);
                    intent.putExtra("n5",age);
                    intent.putExtra("n6",gender);
                    intent.putExtra("n7",read);
                    intent.putExtra("n8",dance);
                    intent.putExtra("n9",sing);
                    intent.putExtra("n10",swim);
                    intent.putExtra("n11",travel);
                    intent.putExtra("n12",village);
                    intent.putExtra("n13",add);
                    intent.putExtra("n14",mobile);
                    intent.putExtra("n15",birth);
                    intent.putExtra("n16",mail);
                    startActivity(intent);
                }

            }
        });
    }


    private void binding()
    {
        name_adt=findViewById(R.id.name_adt);
        surname_adt=findViewById(R.id.surname_adt);
        fname_adt=findViewById(R.id.fname_adt);
        mname_adt=findViewById(R.id.mname_adt);
        village_adt=findViewById(R.id.village_adt);
        add_adt=findViewById(R.id.add_adt);
        mbl_adt=findViewById(R.id.mbl_adt);
        birth_adt=findViewById(R.id.birth_adt);
        mail_adt=findViewById(R.id.mail_adt);
        submit_btn=findViewById(R.id.submit_btn);
        rd_grp_btn=findViewById(R.id.rd_grp_btn);
        male_btn=findViewById(R.id.male_btn);
        female_btn=findViewById(R.id.female_btn);
        reset_btn=findViewById(R.id.reset_btn);
        read_chk=findViewById(R.id.read_chk);
        dance_chk=findViewById(R.id.dance_chk);
        sing_chk=findViewById(R.id.sing_chk);
        swim_chk=findViewById(R.id.swim_chk);
        travel_chk=findViewById(R.id.travel_chk);
        seek=findViewById(R.id.seek);
        seek_txt=findViewById(R.id.seek_txt);
    }
}