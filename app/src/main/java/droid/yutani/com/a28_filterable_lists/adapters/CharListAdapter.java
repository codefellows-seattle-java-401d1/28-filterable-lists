package droid.yutani.com.a28_filterable_lists.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import droid.yutani.com.a28_filterable_lists.R;
import droid.yutani.com.a28_filterable_lists.activities.CharDetail;
import droid.yutani.com.a28_filterable_lists.model.BebopCharacter;

public class CharListAdapter extends RecyclerView.Adapter<CharListAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public BebopCharacter mCharacter;

        public View view;
        public TextView name;
        public TextView job;

        public ViewHolder (View view) {
            super(view);
            this.view = view;
            this.name = view.findViewById(R.id.name);
            this.job = view.findViewById(R.id.job);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), CharDetail.class);
            mCharacter.fillIntent(intent);

            view.getContext().startActivity(intent);
        }
    }

    List<BebopCharacter> characterList;

    public CharListAdapter (List<BebopCharacter> characterList) {
        this.characterList = characterList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.character_list_item, viewGroup, false);

        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder vh, int i) {
        BebopCharacter character = characterList.get(i);
        vh.name.setText(character.name);
        vh.job.setText(character.job);

        vh.mCharacter = character;
    }

    @Override
    public int getItemCount() {
        return this.characterList.size();
    }
}
