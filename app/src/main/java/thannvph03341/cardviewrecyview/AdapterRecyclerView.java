package thannvph03341.cardviewrecyview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dominions on 14/2/2017.
 */

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ItemViewHoder>{

    Context context;
    List<Model1> model1List = new ArrayList<>();

    public AdapterRecyclerView(Context context, List<Model1> model1List) {
        this.context = context;
        this.model1List = model1List;
    }

    @Override
    public ItemViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cardview, parent, false);
        return new ItemViewHoder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHoder holder, int position) {
        Model1 model1 = model1List.get(position);
        holder.txtHoTen.setText(model1.getHotTen());
        holder.txtTuoi.setText(Integer.toString(model1.getTuoi()));
    }

    @Override
    public int getItemCount() {
        return model1List.size();
    }

    public class ItemViewHoder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtHoTen, txtTuoi;

        public ItemViewHoder(View itemView) {
            super(itemView);
            txtHoTen = (TextView) itemView.findViewById(R.id.txtHoTen);
            txtTuoi = (TextView) itemView.findViewById(R.id.txtTuoi);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
