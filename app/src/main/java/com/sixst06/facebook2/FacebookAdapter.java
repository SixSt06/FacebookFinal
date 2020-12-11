package com.sixst06.facebook2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FacebookAdapter extends RecyclerView.Adapter<FacebookAdapter.ViewHolder> {

    private List<Publicacion> publicacionList;
    private Context context;

    public FacebookAdapter(List<Publicacion> publicacionList) {
        this.publicacionList = publicacionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_facebook, parent, false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Publicacion publicacion = publicacionList .get(position);
        holder.imgPerfil.setImageResource(R.drawable.selfie);
        holder.lblNombrePerfil.setText(publicacion.getNombrePerfil());
        holder.lblMin.setText(publicacion.getHora());
        holder.lblDescipcion.setText(publicacion.getDescripcion());
        holder.imgPublicacion.setImageResource(R.drawable.publicacion);
        holder.lblLikes.setText(publicacion.getLikes());
        holder.lblShares.setText(publicacion.getShares());
        holder.btnLike.setText(publicacion.getBtnMeGusta());
        holder.btnComment.setText(publicacion.getBtnComentar());
        holder.btnShare.setText(publicacion.getBtnCompartir());
    }

    @Override
    public int getItemCount() {
        return publicacionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private ImageView imgPerfil;
        private TextView lblNombrePerfil;
        private TextView lblMin;
        private TextView lblDescipcion;
        private ImageView imgPublicacion;
        private TextView lblLikes;
        private TextView lblShares;
        private Button btnLike;
        private Button btnComment;
        private Button btnShare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPerfil = itemView.findViewById(R.id.imgPerfil);
            lblNombrePerfil = itemView.findViewById(R.id.lblNombrePerfil);
            lblMin = itemView.findViewById(R.id.lblMin);
            lblDescipcion = itemView.findViewById(R.id.lblDescripcion);
            imgPublicacion = itemView.findViewById(R.id.imgPublicacion);
            lblLikes = itemView.findViewById(R.id.lblLikes);
            lblShares = itemView.findViewById(R.id.lblShares);
            btnLike = itemView.findViewById(R.id.btnLike);
            btnComment = itemView.findViewById(R.id.btnComment);
            btnShare = itemView.findViewById(R.id.btnShare);
            this.view = itemView;
        }
    }
}
