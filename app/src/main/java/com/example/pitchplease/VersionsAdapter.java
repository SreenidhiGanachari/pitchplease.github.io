package com.example.pitchplease;




import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersionsAdapter extends RecyclerView.Adapter<VersionsAdapter.VersionVH> {

    List<Versions> versionsList;

    public VersionsAdapter(List<Versions> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row1,parent,false);
        return new VersionVH(view);
    }
    @Override
    public void onBindViewHolder(VersionVH holder,int position){

        Versions versions=versionsList.get(position);
        holder.codeNameTxt.setText(versions.getCodeName());
        holder.versionTxt.setText(versions.getVersion());
        holder.apilevelTxt.setText(versions.getApilevel());
        holder.descriptionTxt.setText(versions.getDescription());
        holder.phoneTxt.setText(versions.getPhone());
        holder.nameTxt.setText(versions.getName());
        holder.returnpTxt.setText(versions.getReturnp());

        boolean isExpandable=versionsList.get(position).isExpandable();
        holder.expandablelayout.setVisibility(isExpandable ? View.VISIBLE:View.GONE);

    }
    @Override
    public int getItemCount(){

        return versionsList.size();
    }
    public class VersionVH extends RecyclerView.ViewHolder{
        TextView codeNameTxt , versionTxt,apilevelTxt,descriptionTxt,phoneTxt,nameTxt,returnpTxt;
        LinearLayout linearLayout;
        RelativeLayout expandablelayout;
        public VersionVH(@NonNull View itemView) {
            super(itemView);

            codeNameTxt = itemView.findViewById(R.id.code_name);
            versionTxt = itemView.findViewById(R.id.version);
            apilevelTxt = itemView.findViewById(R.id.apilevel);
            descriptionTxt = itemView.findViewById(R.id.description);
            phoneTxt = itemView.findViewById(R.id.phone_number);
            nameTxt = itemView.findViewById(R.id.name);
            returnpTxt = itemView.findViewById(R.id.returnp);


            linearLayout=itemView.findViewById(R.id.linear_layout);
            expandablelayout=itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Versions versions=versionsList.get(getAdapterPosition());
                    versions.setExpandable(!versions.isExpandable());
                    notifyItemChanged(getAdapterPosition());


                }
            });

        }
    }
}