package com.ulsa.uzonline;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void Alert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                 builder
                .setCancelable(false)//faqat false qaytaradi agar nazat yo yo da yo net
                .setTitle("APl")//bu isim beradi
                .setMessage("Вы уверень чтобы закрыть приложения")//mashno deb yozuv chiqadi
                .setNegativeButton("No", new DialogInterface.OnClickListener() {//negativ
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        System.exit(0);
                        Toast.makeText(MainActivity.this, "finish", Toast.LENGTH_SHORT).show();

                    }
                })
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

            }
        });

        AlertDialog alertDialog =builder.create();
        alertDialog.show();

    }


}


