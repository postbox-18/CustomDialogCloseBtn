package com.example.customdialogclosebtn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptersDialog extends RecyclerView.Adapter<AdaptersDialog.ViewHolder> {

    private String TAG = "AdaptersDialog";
    ArrayList<ComboBox_ListView> listVOs;

    public AdaptersDialog(ArrayList<ComboBox_ListView> listVOs) {
        this.listVOs = listVOs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_switchview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_Title.setText(listVOs.get(position).getTitle());

        holder.cb_CheckBox.setChecked(listVOs.get(position).isSelected());

    }

    @Override
    public int getItemCount() {
        return listVOs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_Title;
        private SwitchCompat cb_CheckBox;
        private ConstraintLayout constraint;

        ViewHolder(View itemView) {
            super(itemView);

            tv_Title = itemView.findViewById(R.id.text);
            cb_CheckBox = itemView.findViewById(R.id.checkbox);

        }
    }
}
