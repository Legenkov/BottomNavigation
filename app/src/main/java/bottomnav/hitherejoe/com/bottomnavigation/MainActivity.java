package bottomnav.hitherejoe.com.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import bottomnav.hitherejoe.com.bottomnavigation.Fragments.ChatFragment;
import bottomnav.hitherejoe.com.bottomnavigationsample.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
//                new BottomNavigationView.OnNavigationItemSelectedListener() {
//                    @Override
//                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                        switch (item.getItemId()) {
//                            case R.id.action_chat:
//                                Log.d("TESTING", "ZZ");
//                                Iobscura.openChat();
//                        }
//                        return false;
//                    }
//                });
    }


    private  IObscura Iobscura = new IObscura() {
        @Override
        public void openProfile() {

        }

        @Override
        public void openPeople() {

        }

        @Override
        public void openForum() {

        }

        @Override
        public void openSearch() {

        }

        @Override
        public void openChat() {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.for_fragment, ChatFragment.newInstance(this))
                    .commit();
        }

        @Override
        public void openMessage() {

        }
    };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
                           case R.id.action_chat:
                               Log.d("TESTING", "ZZ");
                                Iobscura.openChat();
                     }
                       return false;
                   }

}
