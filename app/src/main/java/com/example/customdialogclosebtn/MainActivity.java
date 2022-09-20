package com.example.customdialogclosebtn;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String TAG="MainActivity";
    RecyclerView recyclerview;
    AdaptersDialog dialog;
    LinearLayout layout;
    private ArrayList<ComboBox_ListView> listVOs=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=findViewById(R.id.img);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog builder=new CustomDialog(MainActivity.this);
                //View dialogView= LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_dialog,null);
                builder.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                builder.setCancelable(false);
                builder.show();
               /* layout=dialogView.findViewById(R.id.layout);
                recyclerview=dialogView.findViewById(R.id.recyclerview);*/

            }


        });








    }


}