package coding.hactober.com.allofdzikir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterList extends RecyclerView.Adapter<AdapterList.DzikirHolder> {
    ArrayList<ModelAdapter> listData;

    public AdapterList(ArrayList<ModelAdapter> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public AdapterList.DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false);
        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {

        dzikirHolder.bindView(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {
        private TextView menuItem,menuLagi;

        public DzikirHolder(@NonNull View itemView){
            super(itemView);
            menuItem = itemView.findViewById(R.id.menuItem);
            menuLagi = itemView.findViewById(R.id.menuLagi);
        }
        private void bindView(ModelAdapter data){
            menuItem.setText(data.getJudul());
            menuLagi.setText(data.getSubJudul());

        }

    }
}
