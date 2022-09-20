package com.example.customdialogclosebtn;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomDialog extends Dialog {
    RecyclerView recyclerview;
    AdaptersDialog dialog;
    LinearLayout layout;
    ImageView close;
    ArrayList<ComboBox_ListView> listVOs=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        layout=findViewById(R.id.layout);
        recyclerview=findViewById(R.id.recyclerview);
        close=findViewById(R.id.close);
        setAdapters();
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
    private void setAdapters() {
        String[] set_Title = new String[]{
                "Visits",
                "Diagnosis",
                "Meds",
                "Lab",
                "Birth Summary",
                "Death Summary",
                "Discharge Summary",
                "Doctor Notes",
                "Nursing Notes",
                "Reference Letter",
                "Radiology",
                "Cardiology",
                "Instructions",
                "Problem List",
                "Scan Note",
                "Microbiology",
                "Pathology",
                "Services",
                "Blood Bank",
                "Inventory",
                "Dietary"
        };
        String[]  set_TitleID = new String[]{
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "18",
                "19",
                "20",
                "21",
                "22"

        };


        for (int i = 0; i < set_Title.length; i++) {
            ComboBox_ListView stateVO = new ComboBox_ListView();
            stateVO.setTitle(set_Title[i]);
            stateVO.setTitle_id(set_TitleID[i]);
            stateVO.setSelected(false);
            listVOs.add(stateVO);
        }

        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        dialog=new AdaptersDialog(listVOs);
        recyclerview.setAdapter(dialog);

        //show();
    }

    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected CustomDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
