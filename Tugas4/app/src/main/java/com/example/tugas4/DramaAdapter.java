package com.example.tugas4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DramaAdapter extends RecyclerView.Adapter<myviewholder>
{
    ArrayList<DramaModel> data;
    Context context;
    public DramaAdapter(ArrayList<DramaModel> data, Context context)
    {
        this.data = data;
        this.context=context;
    }

    public ArrayList<DramaModel> getBookModels() {
        return data;
    }

    public void setDramaModels(ArrayList<DramaModel> dramaModels) {
        this.data = dramaModels;
    }
/*
    private Context context;
    private ArrayList<DramaModel> dramaModels;

    public DramaAdapter(Context context, ArrayList<DramaModel> listData) {
        this.context = context;
    }

    public ArrayList<DramaModel> getDramaModels() {
        return dramaModels;
    }

    public void setDramaModels(ArrayList<DramaModel> dramaModels) {
        this.dramaModels = dramaModels;
    }
*/

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_drama,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position)
    {
        final DramaModel temp=data.get(position);

        holder.t1.setText(data.get(position).getHeader());
        holder.img.setImageResource(data.get(position).getImgname());

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,MainActivity2.class);
                intent.putExtra("imagename",temp.getImgname());
                intent.putExtra("header",temp.getHeader());
                intent.putExtra("desc",temp.getDesc());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
}

