package bottomnav.hitherejoe.com.bottomnavigation.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bottomnav.hitherejoe.com.bottomnavigation.IObscura;
import bottomnav.hitherejoe.com.bottomnavigation.Person;
import bottomnav.hitherejoe.com.bottomnavigation.PersonAdapter;
import bottomnav.hitherejoe.com.bottomnavigationsample.R;

/**
 * Created by User on 19.03.2018.
 */

public class ChatFragment extends Fragment {
    private IObscura obscura;

    Context  mContext;
    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private List<Person> persons;

    public ChatFragment(){

    }
    public ChatFragment (IObscura obscura){
        this.obscura=obscura;
    }

    public static ChatFragment newInstance(IObscura obscura) {
        ChatFragment fragment = new ChatFragment(obscura);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.chat, container, false);
        RecyclerView rv = (RecyclerView)view.findViewById(R.id.rv_chat);
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);
        mAdapter = new PersonAdapter(persons);
        rv.setAdapter(mAdapter);
        initializeData();
//        initializeAdapter();
        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Name", "ZZZZ","Time","https://www.wallpaperbackgrounds.org/wp-content/uploads/Picture.jpg","Time" ));

    }
    private void initializeAdapter(){
        PersonAdapter adapter = new PersonAdapter(persons);
        rv.setAdapter(adapter);
    }

}
