package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name_txt,surname_txt,fname_txt,mname_txt,age_txt,gender_txt,hobbies1,hobbies2,hobbies3,hobbies4,hobbies5,village_txt,
                     add_txt,mbl_txt,birth_txt,mail_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();

        String name = getIntent().getStringExtra("n1");
        String surname = getIntent().getStringExtra("n2");
        String fname = getIntent().getStringExtra("n3");
        String mname = getIntent().getStringExtra("n4");
        String age = getIntent().getStringExtra("n5");
        String gender = getIntent().getStringExtra("n6");
        String read = getIntent().getStringExtra("n7");
        String dance = getIntent().getStringExtra("n8");
        String sing = getIntent().getStringExtra("n9");
        String swim = getIntent().getStringExtra("n10");
        String travel = getIntent().getStringExtra("n11");
        String village = getIntent().getStringExtra("n12");
        String add = getIntent().getStringExtra("n13");
        String mobile = getIntent().getStringExtra("n14");
        String birth = getIntent().getStringExtra("n15");
        String mail = getIntent().getStringExtra("n16");


        name_txt.setText(name);
        surname_txt.setText(surname);
        fname_txt.setText(fname);
        mname_txt.setText(mname);
        age_txt.setText(age);
        gender_txt.setText(gender);
        birth_txt.setText(birth);
        hobbies1.setText(read);
        hobbies2.setText(dance);
        hobbies3.setText(sing);
        hobbies4.setText(swim);
        hobbies5.setText(travel);
        village_txt.setText(village);
        add_txt.setText(add);
        mbl_txt.setText(mobile);
        mail_txt.setText(mail);


        mbl_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m_no = "tel:"+mobile;
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(m_no));
                startActivity(i);

            }
        });

    }

    private void binding()
    {
        name_txt = findViewById(R.id.name_txt);
        surname_txt = findViewById(R.id.surname_txt);
        fname_txt = findViewById(R.id.fname_txt);
        mname_txt = findViewById(R.id.mname_txt);
        age_txt = findViewById(R.id.age_txt);
        gender_txt = findViewById(R.id.gender_txt);
        hobbies1 = findViewById(R.id.hobbies1);
        hobbies2 = findViewById(R.id.hobbies2);
        hobbies3 = findViewById(R.id.hobbies3);
        hobbies4 = findViewById(R.id.hobbies4);
        hobbies5 = findViewById(R.id.hobbies5);
        village_txt = findViewById(R.id.village_txt);
        mbl_txt = findViewById(R.id.mbl_txt);
        add_txt = findViewById(R.id.add_txt);
        birth_txt = findViewById(R.id.birth_txt);
        mail_txt = findViewById(R.id.mail_txt);
    }
}