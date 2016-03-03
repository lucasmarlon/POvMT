package povmt.projeto.les.povmt.projetopiloto.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import povmt.projeto.les.povmt.projetopiloto.R;
import povmt.projeto.les.povmt.projetopiloto.models.Atividade;

public class ActivityAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Atividade> items;


    public ActivityAdapter(Context context, List<Atividade> items) {
        this.items = items;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Atividade item = items.get(position);
        convertView = mInflater.inflate(R.layout.my_activity_item, null);
        ((TextView) convertView.findViewById(R.id.tv_activity_name)).setText(item.getNome());

        return convertView;
    }
}
