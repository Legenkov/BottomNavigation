package bottomnav.hitherejoe.com.bottomnavigation;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import bottomnav.hitherejoe.com.bottomnavigationsample.R;

/**
 * Created by User on 15.03.2018.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder> {
    Context mContext;

    public static class PersonHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView tvName;
        TextView tvLastMsgDate;
        TextView tvLastMessage;
        TextView tvLastMessageTime;
        ImageView ivProfilePhoto;
        public PersonHolder(View itemView) {

            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cv);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_chat_name_user);
            tvLastMsgDate = (TextView) itemView.findViewById(R.id.tv_item_chat_date_last_msg);
            tvLastMessage = (TextView) itemView.findViewById(R.id.tv_item_chat_body_last_msg);
            tvLastMessageTime = (TextView) itemView.findViewById(R.id.tv_item_chat_count_new);
            ivProfilePhoto = (ImageView) itemView.findViewById(R.id.iv_item_chat_profile) ;

        }
    }

    List<Person> persons;

    public PersonAdapter(List<Person> persons){
        this.persons = persons;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public PersonHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_person, viewGroup, false);
        PersonHolder ph = new PersonHolder(v);
        return ph;
    }

    @Override
    public void onBindViewHolder(PersonAdapter.PersonHolder personHolder, int position) {
        personHolder.tvName.setText(persons.get(position).name);
        personHolder.tvLastMsgDate.setText(persons.get(position).lastMsgDate);
        personHolder.tvLastMessageTime.setText(persons.get(position).lastMessageTime);
        personHolder.tvLastMessage.setText(persons.get(position).lastMessage);

        Picasso.with(mContext)
                .load(persons.get(position).getPhotoUrl().toString())
                .placeholder(R.drawable.fiasko)
                .into(personHolder.ivProfilePhoto);

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }




}
