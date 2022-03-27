package com.example.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import  android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin, btnRegister;

    //Deklarasi variabel untuk EditText
    EditText ednama, edpassword;

    //Deklarasi variabel untuk menyimpan nama dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.button);

        //Menghubungkan  variabel ednama dengan componen button pada layout
        ednama = findViewById(R.id.edNama);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //Menghubungkan fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Menyimpan input user di edittext nama ke dalam variabel nama
                nama = ednama.getText().toString();

                //Menyimpan input di user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //Mengeset nama yang benar
                String nama = "Barik";

                //Mengeset password yang benar
                String password = "123";

                //Mengecek apakah isi dari nama dan password sudah sama dengan nama dan password yang sudah diset
                if (nama.equals(nama) && password.equals(password)) {
                    //membuat variabel toast dan menampilkan pesan "Login sukses"
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Login Sukses",
                            Toast.LENGTH_LONG);

                    //menampilkan toast
                    toast.show();

                    //membuat objek bundle
                    Bundle b = new Bundle();

                    //memasukkan value dari variabel  nama dengan kunci "a" dan dimasukkan ke dalam bundle
                    b.putString("a", nama.trim());

                    //memasukkan value dari variabel password dengan kunci "b" dan dimasukkan ke dalam bundle
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                    Intent i = new Intent(getApplicationContext(), ActivityResult.class);

                    //memasukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);
                } else {
                    //membuat variabel toast dan membuat  toast dan menampilkan pesan "Login Gagal"

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG);

                    //menampilkan toast
                    toast.show();
                }
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);
            }
        });

    }
}