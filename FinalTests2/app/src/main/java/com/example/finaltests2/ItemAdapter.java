package com.example.finaltests2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import modele.Personne;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    public List<Personne> list;
    Service service = new Service();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNombre;
        public Button btnSupprimer;

        public ViewHolder(LinearLayout view) {
            super(view);
            tvNombre = view.findViewById(R.id.tvNombre);
            btnSupprimer = view.findViewById(R.id.btnSupprimer);
        }

        public TextView getTextView() {
            return btnSupprimer;
        }
    }

    public ItemAdapter() {
        list = new ArrayList<>();
    }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        LinearLayout view = (LinearLayout) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rv_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Personne personneCourante = list.get(position);
        viewHolder.tvNombre.setText(personneCourante.Nombre);
        viewHolder.btnSupprimer.setOnClickListener(new View.OnClickListener() {
            ItemAdapter adapter;
            @Override
            public void onClick(View view) {
                adapter.list.remove(personneCourante);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
