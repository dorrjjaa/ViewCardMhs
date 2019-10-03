package com.datamhs.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.datamhs.DaftarTemanActivity;
import com.datamhs.Model.DaftarTeman;
import com.datamhs.R;

import java.util.ArrayList;

public class DaftartemanAdapter extends RecyclerView.Adapter<DaftartemanAdapter.ViewHolder> {
    private ArrayList<DaftarTeman> dataList;

    public DaftartemanAdapter(ArrayList<DaftarTeman> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_tmn, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtGender.setText(dataList.get(position).getGender());
        holder.txtHobby.setText(dataList.get(position).getHobby());
        holder.txtCita2.setText(dataList.get(position).getCita2());
        holder.txtMotohidup.setText(dataList.get(position).getMotohidup());
        holder.img.setImageResource(dataList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtNama,txtNim,txtGender,txtHobby,txtCita2,txtMotohidup;
        public ImageView img;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtNama = itemView.findViewById(R.id.txt_nama_teman);
            txtNim = itemView.findViewById(R.id.txt_nim_teman);
            txtGender = itemView.findViewById(R.id.txt_gender_teman);
            txtHobby = itemView.findViewWithTag(R.id.txt_hobby_teman);
            txtCita2 = itemView.findViewById(R.id.txt_cita_teman);
            txtMotohidup = itemView.findViewById(R.id.txt_moto_teman);
            img= itemView.findViewById(R.id.imageView2);

        }
    }
}
